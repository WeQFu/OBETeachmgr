package com.ruoyi.teachmgr.teachexecute.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考试答卷body对象 teach_quiz_data_body
 * 
 * @author jzg
 * @date 2023-05-28
 */
public class TeachQuizDataBody extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** quiz_data_body_id */
    private Long quizDataBodyId;

    /** 答卷头id */
    @Excel(name = "答卷头id")
    private Long quizDataHeadId;

    /** 题库id（题库表） */
    @Excel(name = "题库id", readConverterExp = "题=库表")
    private Long questionId;

    /** 章名称（题库表） */
    @Excel(name = "章名称", readConverterExp = "题=库表")
    private String chapterName;

    /** 节名称（题库表） */
    @Excel(name = "节名称", readConverterExp = "题=库表")
    private String chapterSubName;

    /** 课程目标（题库表） */
    @Excel(name = "课程目标", readConverterExp = "题=库表")
    private String courseTargetName;

    /** 题目类型（题库表） */
    @Excel(name = "题目类型", readConverterExp = "题=库表")
    private String questionType;

    /** 题干（题库表） */
    @Excel(name = "题干", readConverterExp = "题=库表")
    private String questionContent;

    /** 小项权重 */
    @Excel(name = "小项权重")
    private Double itemWeight;

    /** 分值（默认每小题100） */
    @Excel(name = "分值", readConverterExp = "默=认每小题100")
    private Double questionScore;

    /** 答案 */
    @Excel(name = "答案")
    private String questionAnswer;

    /** 评阅 */
    @Excel(name = "评阅")
    private String answerReview;

    /** 得分 */
    @Excel(name = "得分")
    private Double answerScore;

    /** 加权得分 */
    @Excel(name = "加权得分")
    private Double answerWeightScore;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setQuizDataBodyId(Long quizDataBodyId) 
    {
        this.quizDataBodyId = quizDataBodyId;
    }

    public Long getQuizDataBodyId() 
    {
        return quizDataBodyId;
    }
    public void setQuizDataHeadId(Long quizDataHeadId) 
    {
        this.quizDataHeadId = quizDataHeadId;
    }

    public Long getQuizDataHeadId() 
    {
        return quizDataHeadId;
    }
    public void setQuestionId(Long questionId) 
    {
        this.questionId = questionId;
    }

    public Long getQuestionId() 
    {
        return questionId;
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
    public void setItemWeight(Double itemWeight) 
    {
        this.itemWeight = itemWeight;
    }

    public Double getItemWeight() 
    {
        return itemWeight;
    }
    public void setQuestionScore(Double questionScore) 
    {
        this.questionScore = questionScore;
    }

    public Double getQuestionScore() 
    {
        return questionScore;
    }
    public void setQuestionAnswer(String questionAnswer) 
    {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswer() 
    {
        return questionAnswer;
    }
    public void setAnswerReview(String answerReview) 
    {
        this.answerReview = answerReview;
    }

    public String getAnswerReview() 
    {
        return answerReview;
    }
    public void setAnswerScore(Double answerScore) 
    {
        this.answerScore = answerScore;
    }

    public Double getAnswerScore() 
    {
        return answerScore;
    }
    public void setAnswerWeightScore(Double answerWeightScore) 
    {
        this.answerWeightScore = answerWeightScore;
    }

    public Double getAnswerWeightScore() 
    {
        return answerWeightScore;
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
            .append("quizDataBodyId", getQuizDataBodyId())
            .append("quizDataHeadId", getQuizDataHeadId())
            .append("questionId", getQuestionId())
            .append("chapterName", getChapterName())
            .append("chapterSubName", getChapterSubName())
            .append("courseTargetName", getCourseTargetName())
            .append("questionType", getQuestionType())
            .append("questionContent", getQuestionContent())
            .append("itemWeight", getItemWeight())
            .append("questionScore", getQuestionScore())
            .append("questionAnswer", getQuestionAnswer())
            .append("answerReview", getAnswerReview())
            .append("answerScore", getAnswerScore())
            .append("answerWeightScore", getAnswerWeightScore())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
