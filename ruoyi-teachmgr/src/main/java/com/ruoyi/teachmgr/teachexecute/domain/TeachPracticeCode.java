package com.ruoyi.teachmgr.teachexecute.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 编码实践对象 teach_practice_code
 * 
 * @author jzg
 * @date 2023-05-13
 */
public class TeachPracticeCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long practiceCodeId;

    /** 学期 */
    @Excel(name = "学期")
    private String practiceSemester;

    /** 实践计划id */
    private Long practicePlanId;

    /** 实践名称（读实验计划） */
    @Excel(name = "实践名称", readConverterExp = "读=实验计划")
    private String practiceName;

    /** 课程名称（读实验计划） */
    private String courseName;

    /** 章节名称（读实验计划） */
    private String chapterName;

    /** 课程目标名称（读实验计划） */
    private String courseTargetName;

    /** 实践权重（读实验计划） */
    private Long practiceWeight;

    /** 实践目的 */
    @Excel(name = "实践目的")
    private String practiceGoal;

    /** 实践要求 */
    @Excel(name = "实践要求")
    private String practiceClaim;

    /** 解决方案 */
    private String practiceSolution;

    /** 测试结果 */
    private String practiceTest;

    /** 提交时间 */
    private Date submitTime;

    /** 评审状态 */
    @Excel(name = "评审状态")
    private String evaluateStatus;

    /** 教师评阅 */
    private String practiceEvaluation;

    /** 实践成绩 */
    @Excel(name = "实践成绩")
    private Long practiceScore;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPracticeCodeId(Long practiceCodeId) 
    {
        this.practiceCodeId = practiceCodeId;
    }

    public Long getPracticeCodeId() 
    {
        return practiceCodeId;
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
    public void setPracticeGoal(String practiceGoal) 
    {
        this.practiceGoal = practiceGoal;
    }

    public String getPracticeGoal() 
    {
        return practiceGoal;
    }
    public void setPracticeClaim(String practiceClaim) 
    {
        this.practiceClaim = practiceClaim;
    }

    public String getPracticeClaim() 
    {
        return practiceClaim;
    }
    public void setPracticeSolution(String practiceSolution) 
    {
        this.practiceSolution = practiceSolution;
    }

    public String getPracticeSolution() 
    {
        return practiceSolution;
    }
    public void setPracticeTest(String practiceTest) 
    {
        this.practiceTest = practiceTest;
    }

    public String getPracticeTest() 
    {
        return practiceTest;
    }
    public void setSubmitTime(Date submitTime) 
    {
        this.submitTime = submitTime;
    }

    public Date getSubmitTime() 
    {
        return submitTime;
    }
    public void setEvaluateStatus(String evaluateStatus) 
    {
        this.evaluateStatus = evaluateStatus;
    }

    public String getEvaluateStatus() 
    {
        return evaluateStatus;
    }
    public void setPracticeEvaluation(String practiceEvaluation) 
    {
        this.practiceEvaluation = practiceEvaluation;
    }

    public String getPracticeEvaluation() 
    {
        return practiceEvaluation;
    }
    public void setPracticeScore(Long practiceScore) 
    {
        this.practiceScore = practiceScore;
    }

    public Long getPracticeScore() 
    {
        return practiceScore;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("practiceCodeId", getPracticeCodeId())
            .append("practiceSemester", getPracticeSemester())
            .append("practicePlanId", getPracticePlanId())
            .append("practiceName", getPracticeName())
            .append("courseName", getCourseName())
            .append("chapterName", getChapterName())
            .append("courseTargetName", getCourseTargetName())
            .append("practiceWeight", getPracticeWeight())
            .append("practiceGoal", getPracticeGoal())
            .append("practiceClaim", getPracticeClaim())
            .append("practiceSolution", getPracticeSolution())
            .append("practiceTest", getPracticeTest())
            .append("submitTime", getSubmitTime())
            .append("evaluateStatus", getEvaluateStatus())
            .append("practiceEvaluation", getPracticeEvaluation())
            .append("practiceScore", getPracticeScore())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
