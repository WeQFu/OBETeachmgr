package com.ruoyi.teachmgr.teachmonitor.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 计划监控对象 teach_plan_monitor
 * 
 * @author jzg
 * @date 2023-05-16
 */
public class TeachPlanMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** paper_id */
    private Long planMonitorId;

    /** 教学计划id（教学计划表） */
    @Excel(name = "教学计划id", readConverterExp = "教=学计划表")
    private Long planId;

    /** 学期（教学计划表） */
    @Excel(name = "学期", readConverterExp = "教=学计划表")
    private String planSemester;

    /** 课程名（教学计划表） */
    @Excel(name = "课程名", readConverterExp = "教=学计划表")
    private String courseName;

    /** 课次（教学计划表） */
    @Excel(name = "课次", readConverterExp = "教=学计划表")
    private Long planNo;

    /** 周次（教学计划表） */
    @Excel(name = "周次", readConverterExp = "教=学计划表")
    private Long weekNo;

    /** 计划时间（教学计划表） */
    @Excel(name = "计划时间", readConverterExp = "教=学计划表")
    private Date lectureTime;

    /** 上课类别（教学计划表） */
    @Excel(name = "上课类别", readConverterExp = "教=学计划表")
    private String lectureType;

    /** 章名称（教学计划表） */
    @Excel(name = "章名称", readConverterExp = "教=学计划表")
    private String chapterName;

    /** 节名称（教学计划表） */
    @Excel(name = "节名称", readConverterExp = "教=学计划表")
    private String chapterSubName;

    /** 实践名称（教学计划表） */
    @Excel(name = "实践名称", readConverterExp = "教=学计划表")
    private String practiceName;

    /** 实际时间（教学计划表） */
    @Excel(name = "实际时间", readConverterExp = "教=学计划表")
    private Date realTime;

    /** 上课类别（教学计划表） */
    @Excel(name = "上课类别", readConverterExp = "教=学计划表")
    private String realType;

    /** 章名称（教学计划表） */
    @Excel(name = "章名称", readConverterExp = "教=学计划表")
    private String realChapterName;

    /** 节名称（教学计划表） */
    @Excel(name = "节名称", readConverterExp = "教=学计划表")
    private String realChapterSubName;

    /** 实践名称（教学计划表） */
    @Excel(name = "实践名称", readConverterExp = "教=学计划表")
    private String realPracticeName;

    /** 是否一致（一致、超前、落后） */
    @Excel(name = "是否一致", readConverterExp = "一=致、超前、落后")
    private String isEqual;

    /** 不一致原因 */
    @Excel(name = "不一致原因")
    private String notEqualCause;

    /** 存在问题 */
    @Excel(name = "存在问题")
    private String meetTrouble;

    /** 改进措施 */
    @Excel(name = "改进措施")
    private String improveMethod;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPlanMonitorId(Long planMonitorId) 
    {
        this.planMonitorId = planMonitorId;
    }

    public Long getPlanMonitorId() 
    {
        return planMonitorId;
    }
    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setPlanSemester(String planSemester) 
    {
        this.planSemester = planSemester;
    }

    public String getPlanSemester() 
    {
        return planSemester;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setPlanNo(Long planNo) 
    {
        this.planNo = planNo;
    }

    public Long getPlanNo() 
    {
        return planNo;
    }
    public void setWeekNo(Long weekNo) 
    {
        this.weekNo = weekNo;
    }

    public Long getWeekNo() 
    {
        return weekNo;
    }
    public void setLectureTime(Date lectureTime) 
    {
        this.lectureTime = lectureTime;
    }

    public Date getLectureTime() 
    {
        return lectureTime;
    }
    public void setLectureType(String lectureType) 
    {
        this.lectureType = lectureType;
    }

    public String getLectureType() 
    {
        return lectureType;
    }
    public void setChapterName(String chapterName) 
    {
        this.chapterName = chapterName;
    }

    public String getChapterName() 
    {
        return chapterName;
    }
    public void setChapterSubName(String chapterSubName) 
    {
        this.chapterSubName = chapterSubName;
    }

    public String getChapterSubName() 
    {
        return chapterSubName;
    }
    public void setPracticeName(String practiceName) 
    {
        this.practiceName = practiceName;
    }

    public String getPracticeName() 
    {
        return practiceName;
    }
    public void setRealTime(Date realTime) 
    {
        this.realTime = realTime;
    }

    public Date getRealTime() 
    {
        return realTime;
    }
    public void setRealType(String realType) 
    {
        this.realType = realType;
    }

    public String getRealType() 
    {
        return realType;
    }
    public void setRealChapterName(String realChapterName) 
    {
        this.realChapterName = realChapterName;
    }

    public String getRealChapterName() 
    {
        return realChapterName;
    }
    public void setRealChapterSubName(String realChapterSubName) 
    {
        this.realChapterSubName = realChapterSubName;
    }

    public String getRealChapterSubName() 
    {
        return realChapterSubName;
    }
    public void setRealPracticeName(String realPracticeName) 
    {
        this.realPracticeName = realPracticeName;
    }

    public String getRealPracticeName() 
    {
        return realPracticeName;
    }
    public void setIsEqual(String isEqual) 
    {
        this.isEqual = isEqual;
    }

    public String getIsEqual() 
    {
        return isEqual;
    }
    public void setNotEqualCause(String notEqualCause) 
    {
        this.notEqualCause = notEqualCause;
    }

    public String getNotEqualCause() 
    {
        return notEqualCause;
    }
    public void setMeetTrouble(String meetTrouble) 
    {
        this.meetTrouble = meetTrouble;
    }

    public String getMeetTrouble() 
    {
        return meetTrouble;
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
            .append("planMonitorId", getPlanMonitorId())
            .append("planId", getPlanId())
            .append("planSemester", getPlanSemester())
            .append("courseName", getCourseName())
            .append("planNo", getPlanNo())
            .append("weekNo", getWeekNo())
            .append("lectureTime", getLectureTime())
            .append("lectureType", getLectureType())
            .append("chapterName", getChapterName())
            .append("chapterSubName", getChapterSubName())
            .append("practiceName", getPracticeName())
            .append("realTime", getRealTime())
            .append("realType", getRealType())
            .append("realChapterName", getRealChapterName())
            .append("realChapterSubName", getRealChapterSubName())
            .append("realPracticeName", getRealPracticeName())
            .append("isEqual", getIsEqual())
            .append("notEqualCause", getNotEqualCause())
            .append("meetTrouble", getMeetTrouble())
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
