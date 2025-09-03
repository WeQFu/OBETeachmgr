package com.ruoyi.teachmgr.teachquiz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 题库分类对象 exam_questions_clazz
 * 
 * @author jzg
 * @date 2023-05-15
 */
public class ExamQuestionsClazz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题库分类id */
    private Long questionsClazzId;

    /** courseid(课程表） */
    @Excel(name = "courseid(课程表）")
    private Long courseId;

    /** 课程名称（课程表） */
    @Excel(name = "课程名称", readConverterExp = "课=程表")
    private String courseName;

    /** 题库分类名 */
    @Excel(name = "题库分类名")
    private String questionsClazzName;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setQuestionsClazzId(Long questionsClazzId) 
    {
        this.questionsClazzId = questionsClazzId;
    }

    public Long getQuestionsClazzId() 
    {
        return questionsClazzId;
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
    public void setQuestionsClazzName(String questionsClazzName) 
    {
        this.questionsClazzName = questionsClazzName;
    }

    public String getQuestionsClazzName() 
    {
        return questionsClazzName;
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
            .append("questionsClazzId", getQuestionsClazzId())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("questionsClazzName", getQuestionsClazzName())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
