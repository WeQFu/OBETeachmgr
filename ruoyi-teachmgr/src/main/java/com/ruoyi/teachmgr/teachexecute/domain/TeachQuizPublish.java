package com.ruoyi.teachmgr.teachexecute.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考试发布对象 teach_quiz_publish
 * 
 * @author jzg
 * @date 2023-05-28
 */
public class TeachQuizPublish extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** quiz_publish_id */
    private Long quizPublishId;

    /** 学期 */
    @Excel(name = "学期")
    private String publishSemester;

    /** 组卷paper_id */
    @Excel(name = "组卷paper_id")
    private Long paperId;

    /** course_id */
    @Excel(name = "course_id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 组卷类型（考试、作业） */
    @Excel(name = "组卷类型", readConverterExp = "考=试、作业")
    private String paperType;

    /** 组卷名称（xx考试，xx作业） */
    @Excel(name = "组卷名称", readConverterExp = "x=x考试，xx作业")
    private String paperName;

    /** 整体权重 */
    @Excel(name = "整体权重")
    private double paperWeight;

    /** 考试类型（期中、期末、平时） */
    @Excel(name = "考试类型", readConverterExp = "期=中、期末、平时")
    private String quizType;

    /** 班级ids */
    @Excel(name = "班级ids")
    private String deptIds;

    /** 发布状态（未发布、已发布、已关闭） */
    @Excel(name = "发布状态", readConverterExp = "未=发布、已发布、已关闭")
    private String publishStatus;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setQuizPublishId(Long quizPublishId) 
    {
        this.quizPublishId = quizPublishId;
    }

    public Long getQuizPublishId() 
    {
        return quizPublishId;
    }
    public void setPublishSemester(String publishSemester) 
    {
        this.publishSemester = publishSemester;
    }

    public String getPublishSemester() 
    {
        return publishSemester;
    }
    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setPaperType(String paperType) 
    {
        this.paperType = paperType;
    }

    public String getPaperType() 
    {
        return paperType;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setPaperWeight(double paperWeight)
    {
        this.paperWeight = paperWeight;
    }

    public double getPaperWeight()
    {
        return paperWeight;
    }
    public void setQuizType(String quizType) 
    {
        this.quizType = quizType;
    }

    public String getQuizType() 
    {
        return quizType;
    }
    public void setDeptIds(String deptIds) 
    {
        this.deptIds = deptIds;
    }

    public String getDeptIds() 
    {
        return deptIds;
    }
    public void setPublishStatus(String publishStatus) 
    {
        this.publishStatus = publishStatus;
    }

    public String getPublishStatus() 
    {
        return publishStatus;
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
            .append("quizPublishId", getQuizPublishId())
            .append("publishSemester", getPublishSemester())
            .append("paperId", getPaperId())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("paperType", getPaperType())
            .append("paperName", getPaperName())
            .append("paperWeight", getPaperWeight())
            .append("quizType", getQuizType())
            .append("deptIds", getDeptIds())
            .append("publishStatus", getPublishStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
