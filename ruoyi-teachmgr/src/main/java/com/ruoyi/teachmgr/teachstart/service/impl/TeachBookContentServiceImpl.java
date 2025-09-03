package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
//import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.util.TeachMgrTreeSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachBookContentMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;
import com.ruoyi.teachmgr.teachstart.service.ITeachBookContentService;

import javax.annotation.Resource;

/**
 * 教材章节Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-18
 */
@Service
public class TeachBookContentServiceImpl implements ITeachBookContentService 
{
    @Resource
    private TeachBookContentMapper teachBookContentMapper;

    /**
     * 查询教材章节
     * 
     * @param bookChapterId 教材章节主键
     * @return 教材章节
     */
    @Override
    public TeachBookContent selectTeachBookContentByBookChapterId(Long bookChapterId)
    {
        return teachBookContentMapper.selectTeachBookContentByBookChapterId(bookChapterId);
    }

    /**
     * 查询教材章节列表
     * 
     * @param teachBookContent 教材章节
     * @return 教材章节
     */
    @Override
    public List<TeachBookContent> selectTeachBookContentList(TeachBookContent teachBookContent)
    {
        return teachBookContentMapper.selectTeachBookContentList(teachBookContent);
    }

    /**
     * 新增教材章节
     * 
     * @param teachBookContent 教材章节
     * @return 结果
     */
    @Override
    public int insertTeachBookContent(TeachBookContent teachBookContent)
    {
        teachBookContent.setCreateTime(DateUtils.getNowDate());
        return teachBookContentMapper.insertTeachBookContent(teachBookContent);
    }

    /**
     * 修改教材章节
     * 
     * @param teachBookContent 教材章节
     * @return 结果
     */
    @Override
    public int updateTeachBookContent(TeachBookContent teachBookContent)
    {
        teachBookContent.setUpdateTime(DateUtils.getNowDate());
        return teachBookContentMapper.updateTeachBookContent(teachBookContent);
    }

    /**
     * 批量删除教材章节
     * 
     * @param bookChapterIds 需要删除的教材章节主键
     * @return 结果
     */
    @Override
    public int deleteTeachBookContentByBookChapterIds(Long[] bookChapterIds)
    {
        return teachBookContentMapper.deleteTeachBookContentByBookChapterIds(bookChapterIds);
    }

    /**
     * 删除教材章节信息
     * 
     * @param bookChapterId 教材章节主键
     * @return 结果
     */
    @Override
    public int deleteTeachBookContentByBookChapterId(Long bookChapterId)
    {
        return teachBookContentMapper.deleteTeachBookContentByBookChapterId(bookChapterId);
    }

    /////
    @Override
    public boolean hasChildByBookChapterId(Long bookChapterId) {
        int result = teachBookContentMapper.hasChildByBookChapterId(bookChapterId);
        return result > 0;
    }

    @Override
    public List<TreeSelect> selectBookChapterTreeList(TeachBookContent bookContent) {
        List<TeachBookContent> bookContents = selectTeachBookContentList(bookContent);
        return buildBookChapterTreeSelect(bookContents);
    }

    @Override
    public List<TeachBookContent> buildBookChapterTree(List<TeachBookContent> bookContents) {
        List<TeachBookContent> returnList = new ArrayList<TeachBookContent>();
        List<Long> tempList = bookContents.stream().map(TeachBookContent::getBookChapterId).collect(Collectors.toList());
        for (TeachBookContent bookContent : bookContents)
        {
            // 如果是顶级节点, 遍历该父节点的所有子节点
            if (!tempList.contains(bookContent.getBookChapterPid()))
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
    public List<TreeSelect> buildBookChapterTreeSelect(List<TeachBookContent> bookContents) {
        List<TeachBookContent> bookContentTrees = buildBookChapterTree(bookContents);
        return bookContentTrees.stream().map(TeachMgrTreeSelect::new).collect(Collectors.toList());
    }

    /**
     * 递归列表
     */
    private void recursionFn(List<TeachBookContent> list, TeachBookContent t)
    {
        // 得到子节点列表
        List<TeachBookContent> childList = getChildList(list, t);
        t.setChildren(childList);
        for (TeachBookContent tChild : childList)
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
    private List<TeachBookContent> getChildList(List<TeachBookContent> list, TeachBookContent t)
    {
        List<TeachBookContent> tlist = new ArrayList<TeachBookContent>();
        Iterator<TeachBookContent> it = list.iterator();
        while (it.hasNext())
        {
            TeachBookContent n = (TeachBookContent) it.next();
            if (StringUtils.isNotNull(n.getBookChapterPid()) && n.getBookChapterPid().longValue() == t.getBookChapterId().longValue())
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<TeachBookContent> list, TeachBookContent t)
    {
        return getChildList(list, t).size() > 0;
    }
}
