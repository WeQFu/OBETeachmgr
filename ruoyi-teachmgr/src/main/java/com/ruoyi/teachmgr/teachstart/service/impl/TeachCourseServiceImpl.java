package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachCourseMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachCourse;
import com.ruoyi.teachmgr.teachstart.service.ITeachCourseService;

/**
 * 课程管理Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-08
 */
@Service
public class TeachCourseServiceImpl implements ITeachCourseService 
{
    @Autowired
    private TeachCourseMapper teachCourseMapper;

    /**
     * 查询课程管理
     * 
     * @param courseId 课程管理主键
     * @return 课程管理
     */
    @Override
    public TeachCourse selectTeachCourseByCourseId(Long courseId)
    {
        return teachCourseMapper.selectTeachCourseByCourseId(courseId);
    }

    /**
     * 查询课程管理列表
     * 
     * @param teachCourse 课程管理
     * @return 课程管理
     */
    @Override
    public List<TeachCourse> selectTeachCourseList(TeachCourse teachCourse)
    {
        return teachCourseMapper.selectTeachCourseList(teachCourse);
    }

    /**
     * 新增课程管理
     * 
     * @param teachCourse 课程管理
     * @return 结果
     */
    @Override
    public int insertTeachCourse(TeachCourse teachCourse)
    {
        teachCourse.setCreateTime(DateUtils.getNowDate());
        return teachCourseMapper.insertTeachCourse(teachCourse);
    }

    /**
     * 修改课程管理
     * 
     * @param teachCourse 课程管理
     * @return 结果
     */
    @Override
    public int updateTeachCourse(TeachCourse teachCourse)
    {
        teachCourse.setUpdateTime(DateUtils.getNowDate());
        return teachCourseMapper.updateTeachCourse(teachCourse);
    }

    /**
     * 批量删除课程管理
     * 
     * @param courseIds 需要删除的课程管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseByCourseIds(Long[] courseIds)
    {
        return teachCourseMapper.deleteTeachCourseByCourseIds(courseIds);
    }

    /**
     * 删除课程管理信息
     * 
     * @param courseId 课程管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseByCourseId(Long courseId)
    {
        return teachCourseMapper.deleteTeachCourseByCourseId(courseId);
    }
}
