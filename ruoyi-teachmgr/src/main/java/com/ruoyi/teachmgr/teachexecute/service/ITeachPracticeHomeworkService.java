package com.ruoyi.teachmgr.teachexecute.service;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeHomework;

/**
 * 课后作业Service接口
 * 
 * @author jzg
 * @date 2023-05-13
 */
public interface ITeachPracticeHomeworkService 
{
    /**
     * 查询课后作业
     * 
     * @param homeworkId 课后作业主键
     * @return 课后作业
     */
    public TeachPracticeHomework selectTeachPracticeHomeworkByHomeworkId(Long homeworkId);

    /**
     * 查询课后作业列表
     * 
     * @param teachPracticeHomework 课后作业
     * @return 课后作业集合
     */
    public List<TeachPracticeHomework> selectTeachPracticeHomeworkList(TeachPracticeHomework teachPracticeHomework);

    /**
     * 新增课后作业
     * 
     * @param teachPracticeHomework 课后作业
     * @return 结果
     */
    public int insertTeachPracticeHomework(TeachPracticeHomework teachPracticeHomework);

    /**
     * 修改课后作业
     * 
     * @param teachPracticeHomework 课后作业
     * @return 结果
     */
    public int updateTeachPracticeHomework(TeachPracticeHomework teachPracticeHomework);

    /**
     * 批量删除课后作业
     * 
     * @param homeworkIds 需要删除的课后作业主键集合
     * @return 结果
     */
    public int deleteTeachPracticeHomeworkByHomeworkIds(Long[] homeworkIds);

    /**
     * 删除课后作业信息
     * 
     * @param homeworkId 课后作业主键
     * @return 结果
     */
    public int deleteTeachPracticeHomeworkByHomeworkId(Long homeworkId);
}
