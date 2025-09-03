package com.ruoyi.teachmgr.teachplan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价方式对象 teach_course_est_way
 * 
 * @author jzg
 * @date 2024-03-05
 */
public class TeachCourseEstWay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 目标id */
    private Long estWayId;

    /** 学期 */
    @Excel(name = "学期")
    private String courseSemester;

    /** 课程id */
    @Excel(name = "课程id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 毕业要求id */
    @Excel(name = "毕业要求id")
    private Long graduationRequirementId;

    /** 毕业要求名称 */
    @Excel(name = "毕业要求名称")
    private String graduationRequirementName;

    /** 毕业要求内容 */
    @Excel(name = "毕业要求内容")
    private String graduationRequirementContent;

    /** 要求指标id */
    @Excel(name = "要求指标id")
    private Long graduationRequirementSubId;

    /** 要求指标名称 */
    @Excel(name = "要求指标名称")
    private String graduationRequirementSubName;

    /** 要求指标内容 */
    @Excel(name = "要求指标内容")
    private String graduationRequirementSubContent;

    /** 课程目标id */
    @Excel(name = "课程目标id")
    private Long courseTargetId;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 课程目标内容 */
    @Excel(name = "课程目标内容")
    private String courseTargetContent;

    /** 环节类别 */
    @Excel(name = "环节类别")
    private String estWay;

    /** 环节名称 */
    @Excel(name = "环节名称")
    private String estName;

    /** 环节分值 */
    @Excel(name = "环节分值")
    private Double estScore;

    /** 环节比重 */
    @Excel(name = "环节比重")
    private Double estWeight;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setEstWayId(Long estWayId) 
    {
        this.estWayId = estWayId;
    }

    public Long getEstWayId() 
    {
        return estWayId;
    }
    public void setCourseSemester(String courseSemester) 
    {
        this.courseSemester = courseSemester;
    }

    public String getCourseSemester() 
    {
        return courseSemester;
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
    public void setGraduationRequirementId(Long graduationRequirementId) 
    {
        this.graduationRequirementId = graduationRequirementId;
    }

    public Long getGraduationRequirementId() 
    {
        return graduationRequirementId;
    }
    public void setGraduationRequirementName(String graduationRequirementName) 
    {
        this.graduationRequirementName = graduationRequirementName;
    }

    public String getGraduationRequirementName() 
    {
        return graduationRequirementName;
    }
    public void setGraduationRequirementContent(String graduationRequirementContent) 
    {
        this.graduationRequirementContent = graduationRequirementContent;
    }

    public String getGraduationRequirementContent() 
    {
        return graduationRequirementContent;
    }
    public void setGraduationRequirementSubId(Long graduationRequirementSubId) 
    {
        this.graduationRequirementSubId = graduationRequirementSubId;
    }

    public Long getGraduationRequirementSubId() 
    {
        return graduationRequirementSubId;
    }
    public void setGraduationRequirementSubName(String graduationRequirementSubName) 
    {
        this.graduationRequirementSubName = graduationRequirementSubName;
    }

    public String getGraduationRequirementSubName() 
    {
        return graduationRequirementSubName;
    }
    public void setGraduationRequirementSubContent(String graduationRequirementSubContent) 
    {
        this.graduationRequirementSubContent = graduationRequirementSubContent;
    }

    public String getGraduationRequirementSubContent() 
    {
        return graduationRequirementSubContent;
    }
    public void setCourseTargetId(Long courseTargetId) 
    {
        this.courseTargetId = courseTargetId;
    }

    public Long getCourseTargetId() 
    {
        return courseTargetId;
    }
    public void setCourseTargetName(String courseTargetName) 
    {
        this.courseTargetName = courseTargetName;
    }

    public String getCourseTargetName() 
    {
        return courseTargetName;
    }
    public void setCourseTargetContent(String courseTargetContent) 
    {
        this.courseTargetContent = courseTargetContent;
    }

    public String getCourseTargetContent() 
    {
        return courseTargetContent;
    }
    public void setEstWay(String estWay) 
    {
        this.estWay = estWay;
    }

    public String getEstWay() 
    {
        return estWay;
    }
    public void setEstName(String estName) 
    {
        this.estName = estName;
    }

    public String getEstName() 
    {
        return estName;
    }
    public void setEstScore(Double estScore) 
    {
        this.estScore = estScore;
    }

    public Double getEstScore() 
    {
        return estScore;
    }
    public void setEstWeight(Double estWeight) 
    {
        this.estWeight = estWeight;
    }

    public Double getEstWeight() 
    {
        return estWeight;
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
            .append("estWayId", getEstWayId())
            .append("courseSemester", getCourseSemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("graduationRequirementId", getGraduationRequirementId())
            .append("graduationRequirementName", getGraduationRequirementName())
            .append("graduationRequirementContent", getGraduationRequirementContent())
            .append("graduationRequirementSubId", getGraduationRequirementSubId())
            .append("graduationRequirementSubName", getGraduationRequirementSubName())
            .append("graduationRequirementSubContent", getGraduationRequirementSubContent())
            .append("courseTargetId", getCourseTargetId())
            .append("courseTargetName", getCourseTargetName())
            .append("courseTargetContent", getCourseTargetContent())
            .append("estWay", getEstWay())
            .append("estName", getEstName())
            .append("estScore", getEstScore())
            .append("estWeight", getEstWeight())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
