package com.ruoyi.teachmgr.teachplan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 理论计划对象 teach_theory_plan
 * 
 * @author jzg
 * @date 2023-09-09
 */
public class TeachTheoryPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 理论课计划id */
    private Long theoryPlanId;

    /** 学期 */
    @Excel(name = "学期")
    private String theorySemester;

    /** 所属课程id */
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程章节id */
    private Long bookChapterId;

    /** 章节名称 */
    @Excel(name = "章节名称")
    private String chapterName;

    /** 课程目标id */
    private Long courseTargetId;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 章节描述 */
    private String courseChapterDescribe;

    /** 计划学时 */
    @Excel(name = "计划学时")
    private Long planTime;

    /** 上课周1-22，数据字典 */
    @Excel(name = "上课周1-22，数据字典")
    private Integer weekNum;

    /** 周1-7数据字典 */
    private Integer weekdayNum;

    /** 课次1-10数据字典 */
    private Integer clazzNum;

    /** 上课日期 */
    private Date clazzDay;

    /** 显示顺序 */
    private Integer orderNum;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setTheoryPlanId(Long theoryPlanId) 
    {
        this.theoryPlanId = theoryPlanId;
    }

    public Long getTheoryPlanId() 
    {
        return theoryPlanId;
    }
    public void setTheorySemester(String theorySemester) 
    {
        this.theorySemester = theorySemester;
    }

    public String getTheorySemester() 
    {
        return theorySemester;
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
    public void setBookChapterId(Long bookChapterId) 
    {
        this.bookChapterId = bookChapterId;
    }

    public Long getBookChapterId() 
    {
        return bookChapterId;
    }
    public void setChapterName(String chapterName) 
    {
        this.chapterName = chapterName;
    }

    public String getChapterName() 
    {
        return chapterName;
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
    public void setCourseChapterDescribe(String courseChapterDescribe) 
    {
        this.courseChapterDescribe = courseChapterDescribe;
    }

    public String getCourseChapterDescribe() 
    {
        return courseChapterDescribe;
    }
    public void setPlanTime(Long planTime) 
    {
        this.planTime = planTime;
    }

    public Long getPlanTime() 
    {
        return planTime;
    }
    public void setWeekNum(Integer weekNum) 
    {
        this.weekNum = weekNum;
    }

    public Integer getWeekNum() 
    {
        return weekNum;
    }
    public void setWeekdayNum(Integer weekdayNum) 
    {
        this.weekdayNum = weekdayNum;
    }

    public Integer getWeekdayNum() 
    {
        return weekdayNum;
    }
    public void setClazzNum(Integer clazzNum) 
    {
        this.clazzNum = clazzNum;
    }

    public Integer getClazzNum() 
    {
        return clazzNum;
    }
    public void setClazzDay(Date clazzDay) 
    {
        this.clazzDay = clazzDay;
    }

    public Date getClazzDay() 
    {
        return clazzDay;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
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
            .append("theoryPlanId", getTheoryPlanId())
            .append("theorySemester", getTheorySemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("bookChapterId", getBookChapterId())
            .append("chapterName", getChapterName())
            .append("courseTargetId", getCourseTargetId())
            .append("courseTargetName", getCourseTargetName())
            .append("courseChapterDescribe", getCourseChapterDescribe())
            .append("planTime", getPlanTime())
            .append("weekNum", getWeekNum())
            .append("weekdayNum", getWeekdayNum())
            .append("clazzNum", getClazzNum())
            .append("clazzDay", getClazzDay())
            .append("orderNum", getOrderNum())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
