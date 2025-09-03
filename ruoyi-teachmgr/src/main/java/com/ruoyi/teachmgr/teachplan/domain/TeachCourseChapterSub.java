package com.ruoyi.teachmgr.teachplan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 章节内容对象 teach_course_chapter_sub
 * 
 * @author jzg
 * @date 2023-05-12
 */
public class TeachCourseChapterSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** chaptersubid */
    @Excel(name = "chaptersubid")
    private Long chapterSubId;

    /** 章id */
    @Excel(name = "章id")
    private Long chapterId;

    /** 章名称 */
    @Excel(name = "章名称")
    private String chapterName;

    /** 节名称 */
    @Excel(name = "节名称")
    private String chapterSubName;

    /** 节描述 */
    @Excel(name = "节描述")
    private String chapterSubDescribe;

    /** 课程目标id */
    @Excel(name = "课程目标id")
    private Long courseTargetId;

    /** 课程目标名称 */
    @Excel(name = "课程目标名称")
    private String courseTargetName;

    /** 计划学时 */
    @Excel(name = "计划学时")
    private Long planTime;

    public void setChapterSubId(Long chapterSubId) 
    {
        this.chapterSubId = chapterSubId;
    }

    public Long getChapterSubId() 
    {
        return chapterSubId;
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
    public void setChapterSubName(String chapterSubName) 
    {
        this.chapterSubName = chapterSubName;
    }

    public String getChapterSubName() 
    {
        return chapterSubName;
    }
    public void setChapterSubDescribe(String chapterSubDescribe) 
    {
        this.chapterSubDescribe = chapterSubDescribe;
    }

    public String getChapterSubDescribe() 
    {
        return chapterSubDescribe;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chapterSubId", getChapterSubId())
            .append("chapterId", getChapterId())
            .append("chapterName", getChapterName())
            .append("chapterSubName", getChapterSubName())
            .append("chapterSubDescribe", getChapterSubDescribe())
            .append("courseTargetId", getCourseTargetId())
            .append("courseTargetName", getCourseTargetName())
            .append("planTime", getPlanTime())
            .toString();
    }
}
