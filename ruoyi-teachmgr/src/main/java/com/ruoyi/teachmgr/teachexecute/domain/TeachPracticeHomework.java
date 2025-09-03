package com.ruoyi.teachmgr.teachexecute.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课后作业对象 teach_practice_homework
 * 
 * @author jzg
 * @date 2023-05-13
 */
public class TeachPracticeHomework extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 作业id */
    private Long homeworkId;

    /** 学期 */
    @Excel(name = "学期")
    private String practiceSemester;

    /** 实践计划id */
    @Excel(name = "实践计划id")
    private Long practicePlanId;

    /** 实践名称（读实验计划） */
    @Excel(name = "实践名称", readConverterExp = "读=实验计划")
    private String practiceName;

    /** 课程名称（读实验计划） */
    @Excel(name = "课程名称", readConverterExp = "读=实验计划")
    private String courseName;

    /** 章节名称（读实验计划） */
    @Excel(name = "章节名称", readConverterExp = "读=实验计划")
    private String chapterName;

    /** 课程目标名称（读实验计划） */
    @Excel(name = "课程目标名称", readConverterExp = "读=实验计划")
    private String courseTargetName;

    /** 权重（读实践计划） */
    @Excel(name = "权重", readConverterExp = "读=实践计划")
    private Long practiceWeight;

    /** 组卷id（试卷表exm_exam） */
    @Excel(name = "组卷id", readConverterExp = "试=卷表exm_exam")
    private Long examId;

    /** 试卷名称（试卷表） */
    @Excel(name = "试卷名称", readConverterExp = "试=卷表")
    private String examName;

    /** 评阅状态（是否） */
    @Excel(name = "评阅状态", readConverterExp = "是=否")
    private String evaluateStatus;

    /** 教师评阅 */
    @Excel(name = "教师评阅")
    private String paperEvaluate;

    /** 成绩 */
    @Excel(name = "成绩")
    private Long practiceScore;

    public void setHomeworkId(Long homeworkId) 
    {
        this.homeworkId = homeworkId;
    }

    public Long getHomeworkId() 
    {
        return homeworkId;
    }
    public void setPracticeSemester(String practiceSemester) 
    {
        this.practiceSemester = practiceSemester;
    }

    public String getPracticeSemester() 
    {
        return practiceSemester;
    }
    public void setPracticePlanId(Long practicePlanId) 
    {
        this.practicePlanId = practicePlanId;
    }

    public Long getPracticePlanId() 
    {
        return practicePlanId;
    }
    public void setPracticeName(String practiceName) 
    {
        this.practiceName = practiceName;
    }

    public String getPracticeName() 
    {
        return practiceName;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setChapterName(String chapterName) 
    {
        this.chapterName = chapterName;
    }

    public String getChapterName() 
    {
        return chapterName;
    }
    public void setCourseTargetName(String courseTargetName) 
    {
        this.courseTargetName = courseTargetName;
    }

    public String getCourseTargetName() 
    {
        return courseTargetName;
    }
    public void setPracticeWeight(Long practiceWeight) 
    {
        this.practiceWeight = practiceWeight;
    }

    public Long getPracticeWeight() 
    {
        return practiceWeight;
    }
    public void setExamId(Long examId) 
    {
        this.examId = examId;
    }

    public Long getExamId() 
    {
        return examId;
    }
    public void setExamName(String examName) 
    {
        this.examName = examName;
    }

    public String getExamName() 
    {
        return examName;
    }
    public void setEvaluateStatus(String evaluateStatus) 
    {
        this.evaluateStatus = evaluateStatus;
    }

    public String getEvaluateStatus() 
    {
        return evaluateStatus;
    }
    public void setPaperEvaluate(String paperEvaluate) 
    {
        this.paperEvaluate = paperEvaluate;
    }

    public String getPaperEvaluate() 
    {
        return paperEvaluate;
    }
    public void setPracticeScore(Long practiceScore) 
    {
        this.practiceScore = practiceScore;
    }

    public Long getPracticeScore() 
    {
        return practiceScore;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("homeworkId", getHomeworkId())
            .append("practiceSemester", getPracticeSemester())
            .append("practicePlanId", getPracticePlanId())
            .append("practiceName", getPracticeName())
            .append("courseName", getCourseName())
            .append("chapterName", getChapterName())
            .append("courseTargetName", getCourseTargetName())
            .append("practiceWeight", getPracticeWeight())
            .append("examId", getExamId())
            .append("examName", getExamName())
            .append("evaluateStatus", getEvaluateStatus())
            .append("paperEvaluate", getPaperEvaluate())
            .append("practiceScore", getPracticeScore())
            .toString();
    }
}
