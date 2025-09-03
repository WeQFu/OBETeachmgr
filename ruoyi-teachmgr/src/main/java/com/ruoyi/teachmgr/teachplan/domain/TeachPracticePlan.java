package com.ruoyi.teachmgr.teachplan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实践环节对象 teach_practice_plan
 * 
 * @author jzg
 * @date 2023-06-13
 */
public class TeachPracticePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long practicePlanId;

    /** 学期 */
    @Excel(name = "学期")
    private String practiceSemester;

    /** 课程id */
    @Excel(name = "课程id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 章节id */
    @Excel(name = "章节id")
    private Long chapterId;

    /** 章节名称 */
    @Excel(name = "章节名称")
    private String chapterName;

    /** 课程目标id */
    @Excel(name = "课程目标id")
    private Long courseTargetId;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 课次 */
    @Excel(name = "课次")
    private Long planNo;

    /** 实践名称 */
    @Excel(name = "实践名称")
    private String practiceName;

    /** 实践类别-数据字典编码和作业 */
    @Excel(name = "实践类别-数据字典编码和作业")
    private Integer practiceType;

    /** 实践目的 */
    @Excel(name = "实践目的")
    private String practiceTarget;

    /** 实践内容 */
    @Excel(name = "实践内容")
    private String practiceDescription;

    /** 计划学时 */
    @Excel(name = "计划学时")
    private Long practiceDuring;

    /** 上课周1-22，数据字典 */
    @Excel(name = "上课周1-22，数据字典")
    private Integer weekNum;

    /** 周1-7数据字典 */
    @Excel(name = "周1-7数据字典")
    private Integer weekdayNum;

    /** 课次1-10数据字典 */
    @Excel(name = "课次1-10数据字典")
    private Integer clazzNum;

    /** 上课日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上课日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date clazzDay;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer orderNum;

    /** 实践权重 */
    @Excel(name = "实践权重")
    private Long practiceWeight;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPracticePlanId(Long practicePlanId) 
    {
        this.practicePlanId = practicePlanId;
    }

    public Long getPracticePlanId() 
    {
        return practicePlanId;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public void setPracticeSemester(String practiceSemester)
    {
        this.practiceSemester = practiceSemester;
    }

    public String getPracticeSemester()
    {
        return practiceSemester;
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
    public void setPlanNo(Long planNo) 
    {
        this.planNo = planNo;
    }

    public Long getPlanNo() 
    {
        return planNo;
    }
    public void setPracticeName(String practiceName) 
    {
        this.practiceName = practiceName;
    }

    public String getPracticeName() 
    {
        return practiceName;
    }
    public void setPracticeType(Integer practiceType) 
    {
        this.practiceType = practiceType;
    }

    public Integer getPracticeType() 
    {
        return practiceType;
    }
    public void setPracticeTarget(String practiceTarget) 
    {
        this.practiceTarget = practiceTarget;
    }

    public String getPracticeTarget() 
    {
        return practiceTarget;
    }
    public void setPracticeDescription(String practiceDescription) 
    {
        this.practiceDescription = practiceDescription;
    }

    public String getPracticeDescription() 
    {
        return practiceDescription;
    }
    public void setPracticeDuring(Long practiceDuring) 
    {
        this.practiceDuring = practiceDuring;
    }

    public Long getPracticeDuring() 
    {
        return practiceDuring;
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
    public void setPracticeWeight(Long practiceWeight) 
    {
        this.practiceWeight = practiceWeight;
    }

    public Long getPracticeWeight() 
    {
        return practiceWeight;
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
            .append("practicePlanId", getPracticePlanId())
            .append("practiceSemester", getPracticeSemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("chapterId", getChapterId())
            .append("chapterName", getChapterName())
            .append("courseTargetId", getCourseTargetId())
            .append("courseTargetName", getCourseTargetName())
            .append("planNo", getPlanNo())
            .append("practiceName", getPracticeName())
            .append("practiceType", getPracticeType())
            .append("practiceTarget", getPracticeTarget())
            .append("practiceDescription", getPracticeDescription())
            .append("practiceDuring", getPracticeDuring())
            .append("weekNum", getWeekNum())
            .append("weekdayNum", getWeekdayNum())
            .append("clazzNum", getClazzNum())
            .append("clazzDay", getClazzDay())
            .append("orderNum", getOrderNum())
            .append("practiceWeight", getPracticeWeight())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
