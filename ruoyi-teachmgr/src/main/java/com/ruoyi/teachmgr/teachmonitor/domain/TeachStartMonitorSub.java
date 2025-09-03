package com.ruoyi.teachmgr.teachmonitor.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 期初教学检查子对象 teach_start_monitor_sub
 * 
 * @author jzg
 * @date 2023-06-08
 */
public class TeachStartMonitorSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 子ID */
    private Long startMonitorSubId;

    /** 父ID */
    @Excel(name = "父ID")
    private Long pidId;

    /** 任课班级ID */
    @Excel(name = "任课班级ID")
    private Long deptId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程类型（字典） */
    @Excel(name = "课程类型", readConverterExp = "字=典")
    private String courseType;

    /** 上课时间 */
    @Excel(name = "上课时间")
    private String lectureTime;

    /** 上课学时 */
    @Excel(name = "上课学时")
    private Integer lectureLong;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setStartMonitorSubId(Long startMonitorSubId) 
    {
        this.startMonitorSubId = startMonitorSubId;
    }

    public Long getStartMonitorSubId() 
    {
        return startMonitorSubId;
    }
    public void setPidId(Long pidId) 
    {
        this.pidId = pidId;
    }

    public Long getPidId() 
    {
        return pidId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseType(String courseType) 
    {
        this.courseType = courseType;
    }

    public String getCourseType() 
    {
        return courseType;
    }
    public void setLectureTime(String lectureTime) 
    {
        this.lectureTime = lectureTime;
    }

    public String getLectureTime() 
    {
        return lectureTime;
    }
    public void setLectureLong(Integer lectureLong) 
    {
        this.lectureLong = lectureLong;
    }

    public Integer getLectureLong() 
    {
        return lectureLong;
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
            .append("startMonitorSubId", getStartMonitorSubId())
            .append("pidId", getPidId())
            .append("deptId", getDeptId())
            .append("courseName", getCourseName())
            .append("courseType", getCourseType())
            .append("lectureTime", getLectureTime())
            .append("lectureLong", getLectureLong())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
