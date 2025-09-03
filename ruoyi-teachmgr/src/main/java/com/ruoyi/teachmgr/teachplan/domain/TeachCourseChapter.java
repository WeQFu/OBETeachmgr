package com.ruoyi.teachmgr.teachplan.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 章节内容对象 teach_course_chapter
 * 
 * @author jzg
 * @date 2023-05-12
 */
public class TeachCourseChapter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 章id */
    private Long courseChapterId;

    /** 学期 */
    @Excel(name = "学期")
    private String courseSemester;

    /** 所属课程id */
    @Excel(name = "所属课程id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程章名称 */
    @Excel(name = "课程章名称")
    private String courseChapterName;

    /** 课程章描述 */
    @Excel(name = "课程章描述")
    private String courseChapterDescribe;

    /** 课程目标id */
    @Excel(name = "课程目标id")
    private Long courseTargetId;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 计划学时 */
    @Excel(name = "计划学时")
    private Long planTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 章节内容信息 */
    private List<TeachCourseChapterSub> teachCourseChapterSubList;

    public void setCourseChapterId(Long courseChapterId) 
    {
        this.courseChapterId = courseChapterId;
    }

    public Long getCourseChapterId() 
    {
        return courseChapterId;
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
    public void setCourseChapterName(String courseChapterName) 
    {
        this.courseChapterName = courseChapterName;
    }

    public String getCourseChapterName() 
    {
        return courseChapterName;
    }
    public void setCourseChapterDescribe(String courseChapterDescribe) 
    {
        this.courseChapterDescribe = courseChapterDescribe;
    }

    public String getCourseChapterDescribe() 
    {
        return courseChapterDescribe;
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
    public void setPlanTime(Long planTime) 
    {
        this.planTime = planTime;
    }

    public Long getPlanTime() 
    {
        return planTime;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public List<TeachCourseChapterSub> getTeachCourseChapterSubList()
    {
        return teachCourseChapterSubList;
    }

    public void setTeachCourseChapterSubList(List<TeachCourseChapterSub> teachCourseChapterSubList)
    {
        this.teachCourseChapterSubList = teachCourseChapterSubList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("courseChapterId", getCourseChapterId())
            .append("courseSemester", getCourseSemester())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseChapterName", getCourseChapterName())
            .append("courseChapterDescribe", getCourseChapterDescribe())
            .append("courseTargetId", getCourseTargetId())
            .append("courseTargetName", getCourseTargetName())
            .append("planTime", getPlanTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("teachCourseChapterSubList", getTeachCourseChapterSubList())
            .toString();
    }
}
