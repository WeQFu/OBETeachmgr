package com.ruoyi.teachmgr.teachplan.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseTarget;

/**
 * 课程目标Mapper接口
 * 
 * @author jzg
 * @date 2023-06-12
 */
public interface TeachCourseTargetMapper 
{
    /**
     * 查询课程目标
     * 
     * @param courseTargetId 课程目标主键
     * @return 课程目标
     */
    public TeachCourseTarget selectTeachCourseTargetByCourseTargetId(Long courseTargetId);

    /**
     * 查询课程目标列表
     * 
     * @param teachCourseTarget 课程目标
     * @return 课程目标集合
     */
    public List<TeachCourseTarget> selectTeachCourseTargetList(TeachCourseTarget teachCourseTarget);

    /**
     * 新增课程目标
     * 
     * @param teachCourseTarget 课程目标
     * @return 结果
     */
    public int insertTeachCourseTarget(TeachCourseTarget teachCourseTarget);

    /**
     * 修改课程目标
     * 
     * @param teachCourseTarget 课程目标
     * @return 结果
     */
    public int updateTeachCourseTarget(TeachCourseTarget teachCourseTarget);

    /**
     * 删除课程目标
     * 
     * @param courseTargetId 课程目标主键
     * @return 结果
     */
    public int deleteTeachCourseTargetByCourseTargetId(Long courseTargetId);

    /**
     * 批量删除课程目标
     * 
     * @param courseTargetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachCourseTargetByCourseTargetIds(Long[] courseTargetIds);
}
