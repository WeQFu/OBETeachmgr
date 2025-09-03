package com.ruoyi.teachmgr.teachstart.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachCourse;

/**
 * 课程管理Mapper接口
 * 
 * @author jzg
 * @date 2023-06-08
 */
public interface TeachCourseMapper 
{
    /**
     * 查询课程管理
     * 
     * @param courseId 课程管理主键
     * @return 课程管理
     */
    public TeachCourse selectTeachCourseByCourseId(Long courseId);

    /**
     * 查询课程管理列表
     * 
     * @param teachCourse 课程管理
     * @return 课程管理集合
     */
    public List<TeachCourse> selectTeachCourseList(TeachCourse teachCourse);

    /**
     * 新增课程管理
     * 
     * @param teachCourse 课程管理
     * @return 结果
     */
    public int insertTeachCourse(TeachCourse teachCourse);

    /**
     * 修改课程管理
     * 
     * @param teachCourse 课程管理
     * @return 结果
     */
    public int updateTeachCourse(TeachCourse teachCourse);

    /**
     * 删除课程管理
     * 
     * @param courseId 课程管理主键
     * @return 结果
     */
    public int deleteTeachCourseByCourseId(Long courseId);

    /**
     * 批量删除课程管理
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachCourseByCourseIds(Long[] courseIds);
}
