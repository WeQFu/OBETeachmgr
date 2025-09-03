package com.ruoyi.teachmgr.teachplan.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachOutline;
import com.ruoyi.teachmgr.teachplan.domain.vo.TeachOutlineVo;

/**
 * 课程大纲Mapper接口
 * 
 * @author jzg
 * @date 2023-05-12
 */
public interface TeachOutlineMapper 
{
    /**
     * 查询课程大纲
     * 
     * @param outlineId 课程大纲主键
     * @return 课程大纲
     */
    public TeachOutline selectTeachOutlineByOutlineId(Long outlineId);

    /**
     * 查询课程大纲列表
     * 
     * @param teachOutline 课程大纲
     * @return 课程大纲集合
     */
    public List<TeachOutline> selectTeachOutlineList(TeachOutline teachOutline);

    /**
     * 新增课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    public int insertTeachOutline(TeachOutline teachOutline);

    /**
     * 修改课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    public int updateTeachOutline(TeachOutline teachOutline);

    /**
     * 删除课程大纲
     * 
     * @param outlineId 课程大纲主键
     * @return 结果
     */
    public int deleteTeachOutlineByOutlineId(Long outlineId);

    /**
     * 批量删除课程大纲
     * 
     * @param outlineIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachOutlineByOutlineIds(Long[] outlineIds);

    /**
     * 根据ID数组查询教学大纲列表
     * @param ids 大纲主键集合
     * @return 大纲列表集合
     */
    public List<TeachOutlineVo> selectTeachOutlineByIds(Long[] ids);

}
