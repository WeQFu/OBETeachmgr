package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseTarget;

/**
 * 课程目标Service接口
 * 
 * @author jzg
 * @date 2023-06-12
 */
public interface ITeachCourseTargetService 
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
     * 批量删除课程目标
     * 
     * @param courseTargetIds 需要删除的课程目标主键集合
     * @return 结果
     */
    public int deleteTeachCourseTargetByCourseTargetIds(Long[] courseTargetIds);

    /**
     * 删除课程目标信息
     * 
     * @param courseTargetId 课程目标主键
     * @return 结果
     */
    public int deleteTeachCourseTargetByCourseTargetId(Long courseTargetId);

    /**
     * 导入用户数据
     *
     * @param teachCourseTargetList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importData(List<TeachCourseTarget> teachCourseTargetList, Boolean isUpdateSupport);

}
