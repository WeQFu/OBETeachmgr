package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.teachmgr.teachplan.domain.vo.TeachOutlineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachOutlineMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachOutline;
import com.ruoyi.teachmgr.teachplan.service.ITeachOutlineService;

/**
 * 课程大纲Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-12
 */
@Service
public class TeachOutlineServiceImpl implements ITeachOutlineService 
{
    @Autowired
    private TeachOutlineMapper teachOutlineMapper;

    /**
     * 查询课程大纲
     * 
     * @param outlineId 课程大纲主键
     * @return 课程大纲
     */
    @Override
    public TeachOutline selectTeachOutlineByOutlineId(Long outlineId)
    {
        return teachOutlineMapper.selectTeachOutlineByOutlineId(outlineId);
    }

    /**
     * 查询课程大纲列表
     * 
     * @param teachOutline 课程大纲
     * @return 课程大纲
     */
    @Override
    public List<TeachOutline> selectTeachOutlineList(TeachOutline teachOutline)
    {
        return teachOutlineMapper.selectTeachOutlineList(teachOutline);
    }

    /**
     * 新增课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    @Override
    public int insertTeachOutline(TeachOutline teachOutline)
    {
        teachOutline.setCreateTime(DateUtils.getNowDate());
        return teachOutlineMapper.insertTeachOutline(teachOutline);
    }

    /**
     * 修改课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    @Override
    public int updateTeachOutline(TeachOutline teachOutline)
    {
        teachOutline.setUpdateTime(DateUtils.getNowDate());
        return teachOutlineMapper.updateTeachOutline(teachOutline);
    }

    /**
     * 批量删除课程大纲
     * 
     * @param outlineIds 需要删除的课程大纲主键
     * @return 结果
     */
    @Override
    public int deleteTeachOutlineByOutlineIds(Long[] outlineIds)
    {
        return teachOutlineMapper.deleteTeachOutlineByOutlineIds(outlineIds);
    }

    /**
     * 删除课程大纲信息
     * 
     * @param outlineId 课程大纲主键
     * @return 结果
     */
    @Override
    public int deleteTeachOutlineByOutlineId(Long outlineId)
    {
        return teachOutlineMapper.deleteTeachOutlineByOutlineId(outlineId);
    }

//    @Override
//    public List<TeachOutlineVo> selectTeachOutlineByIds(Long[] ids) {
//        return teachOutlineMapper.selectTeachOutlineByIds(ids);
//    }
}
