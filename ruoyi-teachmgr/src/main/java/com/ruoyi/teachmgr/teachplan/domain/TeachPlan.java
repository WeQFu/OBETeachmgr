package com.ruoyi.teachmgr.teachplan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教学计划对象 teach_plan
 * 
 * @author jzg
 * @date 2023-05-12
 */
public class TeachPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** plan_id */
    private Long planId;

    /** 学期 */
    @Excel(name = "学期")
    private String planSemester;

    /** 课程id */
    private Long courseId;

    /** 课程名（自动充填） */
    @Excel(name = "课程名", readConverterExp = "自=动充填")
    private String courseName;

    /** 课次 */
    @Excel(name = "课次")
    private Long planNo;

    /** 周次 */
    @Excel(name = "周次")
    private Long weekNo;

    /** 上课时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lectureTime;

    /** 上课类别（理论、实践、理论和实践） */
    @Excel(name = "上课类别", readConverterExp = "理=论、实践、理论和实践")
    private String lectureType;

    /** 理论章id（章节表） */
    private Long chapterId;

    /** 章名称（章节表） */
    private String chapterName;

    /** 节id（章节表） */
    private Long chapterSubId;

    /** 节名称（章节表） */
    @Excel(name = "节名称", readConverterExp = "章=节表")
    private String chapterSubName;

    /** 实践id（实践计划表） */
    private Long practiceId;

    /** 实践名称（实践计划表） */
    @Excel(name = "实践名称", readConverterExp = "实=践计划表")
    private String practiceName;

    /** 教学方法 */
    private String lectureMethod;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

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
    public void setChapterId(Long chapterId) 
    {
        this.chapterId = chapterId;
    }

    public Long getChapterId() 
    {
        return chapterId;
    }
    public void setChapterName(String chapterName) 
    {
        this.chapterName = chapterName;
    }

    public String getChapterName() 
    {
        return chapterName;
    }
    public void setChapterSubId(Long chapterSubId) 
    {
        this.chapterSubId = chapterSubId;
    }

    public Long getChapterSubId() 
    {
        return chapterSubId;
    }
    public void setChapterSubName(String chapterSubName) 
    {
        this.chapterSubName = chapterSubName;
    }

    public String getChapterSubName() 
    {
        return chapterSubName;
    }
    public void setPracticeId(Long practiceId) 
    {
        this.practiceId = practiceId;
    }

    public Long getPracticeId() 
    {
        return practiceId;
    }
    public void setPracticeName(String practiceName) 
    {
        this.practiceName = practiceName;
    }

    public String getPracticeName() 
    {
        return practiceName;
    }
    public void setLectureMethod(String lectureMethod) 
    {
        this.lectureMethod = lectureMethod;
    }

    public String getLectureMethod() 
    {
        return lectureMethod;
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
            .append("planId", getPlanId())
            .append("planSemester", getPlanSemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("planNo", getPlanNo())
            .append("weekNo", getWeekNo())
            .append("lectureTime", getLectureTime())
            .append("lectureType", getLectureType())
            .append("chapterId", getChapterId())
            .append("chapterName", getChapterName())
            .append("chapterSubId", getChapterSubId())
            .append("chapterSubName", getChapterSubName())
            .append("practiceId", getPracticeId())
            .append("practiceName", getPracticeName())
            .append("lectureMethod", getLectureMethod())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
