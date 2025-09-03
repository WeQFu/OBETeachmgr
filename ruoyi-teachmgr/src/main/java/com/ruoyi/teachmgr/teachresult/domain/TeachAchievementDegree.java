package com.ruoyi.teachmgr.teachresult.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教学改进对象 teach_achievement_degree
 * 
 * @author jzg
 * @date 2024-03-05
 */
public class TeachAchievementDegree extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 达成度id */
    private Long achievDegreeId;

    /** 学期 */
    @Excel(name = "学期")
    private String courseSemester;

    /** 所属课程 */
    @Excel(name = "所属课程")
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

    /** 指标名称 */
    @Excel(name = "指标名称")
    private String graduationRequirementSubName;

    /** 指标内容 */
    @Excel(name = "指标内容")
    private String graduationRequirementSubContent;

    /** 课程目标id */
    @Excel(name = "课程目标id")
    private Long courseTargetId;

    /** 课程目标 */
    @Excel(name = "课程目标")
    private String courseTargetName;

    /** 目标内容 */
    @Excel(name = "目标内容")
    private String courseTargetContent;

    /** 达成度1 */
    @Excel(name = "达成度1")
    private Double achieveDegree1;

    /** 达成度2 */
    @Excel(name = "达成度2")
    private Double achieveDegree2;

    /** 达成度3 */
    @Excel(name = "达成度3")
    private Double achieveDegree3;

    /** 试题难易度 */
    @Excel(name = "试题难易度")
    private String difcultDegree;

    /** 成绩分布 */
    @Excel(name = "成绩分布")
    private String markDistribute;

    /** 评价依据合理性 */
    @Excel(name = "评价依据合理性")
    private String judgeRational;

    /** 课程目标达成情况 */
    @Excel(name = "课程目标达成情况")
    private String achieveSituation;

    /** 持续改进措施 */
    @Excel(name = "持续改进措施")
    private String improveMethod;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setAchievDegreeId(Long achievDegreeId) 
    {
        this.achievDegreeId = achievDegreeId;
    }

    public Long getAchievDegreeId() 
    {
        return achievDegreeId;
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
    public void setAchieveDegree1(Double achieveDegree1) 
    {
        this.achieveDegree1 = achieveDegree1;
    }

    public Double getAchieveDegree1() 
    {
        return achieveDegree1;
    }
    public void setAchieveDegree2(Double achieveDegree2) 
    {
        this.achieveDegree2 = achieveDegree2;
    }

    public Double getAchieveDegree2() 
    {
        return achieveDegree2;
    }
    public void setAchieveDegree3(Double achieveDegree3) 
    {
        this.achieveDegree3 = achieveDegree3;
    }

    public Double getAchieveDegree3() 
    {
        return achieveDegree3;
    }
    public void setDifcultDegree(String difcultDegree) 
    {
        this.difcultDegree = difcultDegree;
    }

    public String getDifcultDegree() 
    {
        return difcultDegree;
    }
    public void setMarkDistribute(String markDistribute) 
    {
        this.markDistribute = markDistribute;
    }

    public String getMarkDistribute() 
    {
        return markDistribute;
    }
    public void setJudgeRational(String judgeRational) 
    {
        this.judgeRational = judgeRational;
    }

    public String getJudgeRational() 
    {
        return judgeRational;
    }
    public void setAchieveSituation(String achieveSituation) 
    {
        this.achieveSituation = achieveSituation;
    }

    public String getAchieveSituation() 
    {
        return achieveSituation;
    }
    public void setImproveMethod(String improveMethod) 
    {
        this.improveMethod = improveMethod;
    }

    public String getImproveMethod() 
    {
        return improveMethod;
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
            .append("achievDegreeId", getAchievDegreeId())
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
            .append("achieveDegree1", getAchieveDegree1())
            .append("achieveDegree2", getAchieveDegree2())
            .append("achieveDegree3", getAchieveDegree3())
            .append("difcultDegree", getDifcultDegree())
            .append("markDistribute", getMarkDistribute())
            .append("judgeRational", getJudgeRational())
            .append("achieveSituation", getAchieveSituation())
            .append("improveMethod", getImproveMethod())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
