package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;
import com.ruoyi.teachmgr.util.TeachMgrTreeSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachGraduationRequirementMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachplan.service.ITeachGraduationRequirementService;

/**
 * 毕业要求Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-13
 */
@Service
public class TeachGraduationRequirementServiceImpl implements ITeachGraduationRequirementService 
{
    @Autowired
    private TeachGraduationRequirementMapper teachGraduationRequirementMapper;

    /**
     * 查询毕业要求
     *
     * @param requirementId 毕业要求主键
     * @return 毕业要求
     */
    @Override
    public TeachGraduationRequirement selectTeachGraduationRequirementByRequirementId(Long requirementId)
    {
        return teachGraduationRequirementMapper.selectTeachGraduationRequirementByRequirementId(requirementId);
    }

    /**
     * 查询毕业要求列表
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 毕业要求
     */
    @Override
    public List<TeachGraduationRequirement> selectTeachGraduationRequirementList(TeachGraduationRequirement teachGraduationRequirement)
    {
        return teachGraduationRequirementMapper.selectTeachGraduationRequirementList(teachGraduationRequirement);
    }

    /**
     * 新增毕业要求
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 结果
     */
    @Override
    public int insertTeachGraduationRequirement(TeachGraduationRequirement teachGraduationRequirement)
    {
        teachGraduationRequirement.setCreateTime(DateUtils.getNowDate());
        return teachGraduationRequirementMapper.insertTeachGraduationRequirement(teachGraduationRequirement);
    }

    /**
     * 修改毕业要求
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 结果
     */
    @Override
    public int updateTeachGraduationRequirement(TeachGraduationRequirement teachGraduationRequirement)
    {
        teachGraduationRequirement.setUpdateTime(DateUtils.getNowDate());
        return teachGraduationRequirementMapper.updateTeachGraduationRequirement(teachGraduationRequirement);
    }

    /**
     * 批量删除毕业要求
     *
     * @param requirementIds 需要删除的毕业要求主键
     * @return 结果
     */
    @Override
    public int deleteTeachGraduationRequirementByRequirementIds(Long[] requirementIds)
    {
        return teachGraduationRequirementMapper.deleteTeachGraduationRequirementByRequirementIds(requirementIds);
    }

    /**
     * 删除毕业要求信息
     *
     * @param requirementId 毕业要求主键
     * @return 结果
     */
    @Override
    public int deleteTeachGraduationRequirementByRequirementId(Long requirementId)
    {
        return teachGraduationRequirementMapper.deleteTeachGraduationRequirementByRequirementId(requirementId);
    }

    /////---start
    @Override
    public boolean hasChildByRequirementId(Long requirementId) {
        int result=teachGraduationRequirementMapper.hasChildByTeachGraduationRequirementId(requirementId);
        return result>0;
    }

    @Override
    public List<TreeSelect> selectTeachGraduationRequirementTreeList(TeachGraduationRequirement bookContent) {
        List<TeachGraduationRequirement> bookContents = selectTeachGraduationRequirementList(bookContent);
        return buildTeachGraduationRequirementTreeSelect(bookContents);
    }

    @Override
    public List<TeachGraduationRequirement> buildTeachGraduationRequirementTree(List<TeachGraduationRequirement> bookContents) {
        List<TeachGraduationRequirement> returnList = new ArrayList<TeachGraduationRequirement>();
        List<Long> tempList = bookContents.stream().map(TeachGraduationRequirement::getRequirementId).collect(Collectors.toList());
        for (TeachGraduationRequirement bookContent : bookContents)
        {
            // 如果是顶级节点, 遍历该父节点的所有子节点
            if (!tempList.contains(bookContent.getRequirementPid()))
            {
                recursionFn(bookContents, bookContent);
                returnList.add(bookContent);
            }
        }
        if (returnList.isEmpty())
        {
            returnList = bookContents;
        }
        return returnList;
    }

    @Override
    public List<TreeSelect> buildTeachGraduationRequirementTreeSelect(List<TeachGraduationRequirement> bookContents) {
        List<TeachGraduationRequirement> bookContentTrees = buildTeachGraduationRequirementTree(bookContents);
        return bookContentTrees.stream().map(TeachMgrTreeSelect::new).collect(Collectors.toList());
    }

    /**
     * 递归列表
     */
    private void recursionFn(List<TeachGraduationRequirement> list, TeachGraduationRequirement t)
    {
        // 得到子节点列表
        List<TeachGraduationRequirement> childList = getChildList(list, t);
        t.setChildren(childList);
        for (TeachGraduationRequirement tChild : childList)
        {
            if (hasChild(list, tChild))
            {
                recursionFn(list, tChild);
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private List<TeachGraduationRequirement> getChildList(List<TeachGraduationRequirement> list, TeachGraduationRequirement t)
    {
        List<TeachGraduationRequirement> tlist = new ArrayList<TeachGraduationRequirement>();
        Iterator<TeachGraduationRequirement> it = list.iterator();
        while (it.hasNext())
        {
            TeachGraduationRequirement n = (TeachGraduationRequirement) it.next();
            if (StringUtils.isNotNull(n.getRequirementPid()) && n.getRequirementPid().longValue() == t.getRequirementId().longValue())
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<TeachGraduationRequirement> list, TeachGraduationRequirement t)
    {
        return getChildList(list, t).size() > 0;
    }
    /////--end

}
