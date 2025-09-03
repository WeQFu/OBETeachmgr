package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachPracticeHomeworkMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeHomework;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeHomeworkService;

/**
 * 课后作业Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-13
 */
@Service
public class TeachPracticeHomeworkServiceImpl implements ITeachPracticeHomeworkService 
{
    @Autowired
    private TeachPracticeHomeworkMapper teachPracticeHomeworkMapper;

    /**
     * 查询课后作业
     * 
     * @param homeworkId 课后作业主键
     * @return 课后作业
     */
    @Override
    public TeachPracticeHomework selectTeachPracticeHomeworkByHomeworkId(Long homeworkId)
    {
        return teachPracticeHomeworkMapper.selectTeachPracticeHomeworkByHomeworkId(homeworkId);
    }

    /**
     * 查询课后作业列表
     * 
     * @param teachPracticeHomework 课后作业
     * @return 课后作业
     */
    @Override
    public List<TeachPracticeHomework> selectTeachPracticeHomeworkList(TeachPracticeHomework teachPracticeHomework)
    {
        return teachPracticeHomeworkMapper.selectTeachPracticeHomeworkList(teachPracticeHomework);
    }

    /**
     * 新增课后作业
     * 
     * @param teachPracticeHomework 课后作业
     * @return 结果
     */
    @Override
    public int insertTeachPracticeHomework(TeachPracticeHomework teachPracticeHomework)
    {
        return teachPracticeHomeworkMapper.insertTeachPracticeHomework(teachPracticeHomework);
    }

    /**
     * 修改课后作业
     * 
     * @param teachPracticeHomework 课后作业
     * @return 结果
     */
    @Override
    public int updateTeachPracticeHomework(TeachPracticeHomework teachPracticeHomework)
    {
        return teachPracticeHomeworkMapper.updateTeachPracticeHomework(teachPracticeHomework);
    }

    /**
     * 批量删除课后作业
     * 
     * @param homeworkIds 需要删除的课后作业主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeHomeworkByHomeworkIds(Long[] homeworkIds)
    {
        return teachPracticeHomeworkMapper.deleteTeachPracticeHomeworkByHomeworkIds(homeworkIds);
    }

    /**
     * 删除课后作业信息
     * 
     * @param homeworkId 课后作业主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeHomeworkByHomeworkId(Long homeworkId)
    {
        return teachPracticeHomeworkMapper.deleteTeachPracticeHomeworkByHomeworkId(homeworkId);
    }
}
