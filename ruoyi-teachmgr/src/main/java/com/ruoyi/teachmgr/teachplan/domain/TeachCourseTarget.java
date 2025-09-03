package com.ruoyi.teachmgr.teachplan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程目标对象 teach_course_target
 * 
 * @author jzg
 * @date 2023-06-12
 */
public class TeachCourseTarget extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 目标id */
    private Long courseTargetId;

    /** 学期 */
    @Excel(name = "学期")
    private String courseSemester;

    /** 所属课程 */
    @Excel(name = "所属课程")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 毕业要求id(毕业要求表) */
    @Excel(name = "毕业要求id")
    private Long graduationRequirementId;

    /** 毕业要求名称(毕业要求表) */
    @Excel(name = "毕业要求名称")
    private String graduationRequirementName;

    /** 毕业要求内容(毕业要求表) */
    @Excel(name = "毕业要求内容")
    private String graduationRequirementContent;

    /** 毕业二级要求id(毕业要求表) */
    @Excel(name = "毕业指标id")
    private Long graduationRequirementSubId;

    /** 二级要求名称(毕业要求表) */
    @Excel(name = "指标名称")
    private String graduationRequirementSubName;

    /** 二级要求内容(毕业要求表) */
    @Excel(name = "指标内容")
    private String graduationRequirementSubContent;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 课程目标内容 */
    @Excel(name = "课程目标内容")
    private String courseTargetContent;

    /** 达成途径 */
    @Excel(name = "达成途径")
    private String approachWay;

    /** 判读依据 */
    @Excel(name = "判读依据")
    private String judgeNorm;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setCourseTargetId(Long courseTargetId) 
    {
        this.courseTargetId = courseTargetId;
    }

    public Long getCourseTargetId() 
    {
        return courseTargetId;
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
    public void setApproachWay(String approachWay) 
    {
        this.approachWay = approachWay;
    }

    public String getApproachWay() 
    {
        return approachWay;
    }
    public void setJudgeNorm(String judgeNorm) 
    {
        this.judgeNorm = judgeNorm;
    }

    public String getJudgeNorm() 
    {
        return judgeNorm;
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
            .append("courseTargetId", getCourseTargetId())
            .append("courseSemester", getCourseSemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("graduationRequirementId", getGraduationRequirementId())
            .append("graduationRequirementName", getGraduationRequirementName())
            .append("graduationRequirementContent", getGraduationRequirementContent())
            .append("graduationRequirementSubId", getGraduationRequirementSubId())
            .append("graduationRequirementSubName", getGraduationRequirementSubName())
            .append("graduationRequirementSubContent", getGraduationRequirementSubContent())
            .append("courseTargetName", getCourseTargetName())
            .append("courseTargetContent", getCourseTargetContent())
            .append("approachWay", getApproachWay())
            .append("judgeNorm", getJudgeNorm())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
