package com.ruoyi.teachmgr.teachquiz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 试题库对象 exam_questions
 * 
 * @author jzg
 * @date 2023-05-15
 */
public class ExamQuestions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** question_id */
    private Long questionId;

    /** 课程分类id（题目分类表） */
    @Excel(name = "课程分类id", readConverterExp = "题=目分类表")
    private Long questionsTypeId;

    /** 课程分类名（题目分类表） */
    @Excel(name = "课程分类名", readConverterExp = "题=目分类表")
    private String questionTypeName;

    /** 课程名（题目分类表） */
    @Excel(name = "课程名", readConverterExp = "题=目分类表")
    private String courseName;

    /** 理论章id（章节表） */
    @Excel(name = "理论章id", readConverterExp = "章=节表")
    private Long chapterId;

    /** 章名称（章节表） */
    @Excel(name = "章名称", readConverterExp = "章=节表")
    private String chapterName;

    /** 节id（章节表） */
    @Excel(name = "节id", readConverterExp = "章=节表")
    private Long chapterSubId;

    /** 节名称（章节表） */
    @Excel(name = "节名称", readConverterExp = "章=节表")
    private String chapterSubName;

    /** 课程目标 */
    @Excel(name = "课程目标")
    private String courseTargetName;

    /** 题目类型（单选、多选、填空、判断、问答、设计、编码） */
    @Excel(name = "题目类型", readConverterExp = "单=选、多选、填空、判断、问答、设计、编码")
    private String questionType;

    /** 题干 */
    @Excel(name = "题干")
    private String questionContent;

    /** 评阅类型（主观、客观） */
    @Excel(name = "评阅类型", readConverterExp = "主=观、客观")
    private String evaluateType;

    /** 答案 */
    @Excel(name = "答案")
    private String questionAnswer;

    /** 题干说明 */
    @Excel(name = "题干说明")
    private String questionAdditional;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setQuestionId(Long questionId) 
    {
        this.questionId = questionId;
    }

    public Long getQuestionId() 
    {
        return questionId;
    }
    public void setQuestionsTypeId(Long questionsTypeId) 
    {
        this.questionsTypeId = questionsTypeId;
    }

    public Long getQuestionsTypeId() 
    {
        return questionsTypeId;
    }
    public void setQuestionTypeName(String questionTypeName) 
    {
        this.questionTypeName = questionTypeName;
    }

    public String getQuestionTypeName() 
    {
        return questionTypeName;
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
    public void setCourseTargetName(String courseTargetName) 
    {
        this.courseTargetName = courseTargetName;
    }

    public String getCourseTargetName() 
    {
        return courseTargetName;
    }
    public void setQuestionType(String questionType) 
    {
        this.questionType = questionType;
    }

    public String getQuestionType() 
    {
        return questionType;
    }
    public void setQuestionContent(String questionContent) 
    {
        this.questionContent = questionContent;
    }

    public String getQuestionContent() 
    {
        return questionContent;
    }
    public void setEvaluateType(String evaluateType) 
    {
        this.evaluateType = evaluateType;
    }

    public String getEvaluateType() 
    {
        return evaluateType;
    }
    public void setQuestionAnswer(String questionAnswer) 
    {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswer() 
    {
        return questionAnswer;
    }
    public void setQuestionAdditional(String questionAdditional) 
    {
        this.questionAdditional = questionAdditional;
    }

    public String getQuestionAdditional() 
    {
        return questionAdditional;
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
            .append("questionId", getQuestionId())
            .append("questionsTypeId", getQuestionsTypeId())
            .append("questionTypeName", getQuestionTypeName())
            .append("courseName", getCourseName())
            .append("chapterId", getChapterId())
            .append("chapterName", getChapterName())
            .append("chapterSubId", getChapterSubId())
            .append("chapterSubName", getChapterSubName())
            .append("courseTargetName", getCourseTargetName())
            .append("questionType", getQuestionType())
            .append("questionContent", getQuestionContent())
            .append("evaluateType", getEvaluateType())
            .append("questionAnswer", getQuestionAnswer())
            .append("questionAdditional", getQuestionAdditional())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
