package com.ruoyi.teachmgr.teachquiz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 组卷详情对象 exam_paper_sub
 * 
 * @author jzg
 * @date 2023-05-25
 */
public class ExamPaperSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** paper_id */
    private Long paperSubId;

    /** paper_pid */
    @Excel(name = "paper_pid")
    private Long paperId;

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

    /** 评阅类型（题库表） */
    @Excel(name = "评阅类型", readConverterExp = "题=库表")
    private String evaluateType;

    /** 答案 */
    @Excel(name = "答案")
    private String questionAnswer;

    /** 小项权重 */
    @Excel(name = "小项权重")
    private double itemWeight;

    /** 分值 */
    @Excel(name = "分值")
    private double questionScore;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPaperSubId(Long paperSubId) 
    {
        this.paperSubId = paperSubId;
    }

    public Long getPaperSubId() 
    {
        return paperSubId;
    }
    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
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
    public void setItemWeight(double itemWeight)
    {
        this.itemWeight = itemWeight;
    }

    public double getItemWeight()
    {
        return itemWeight;
    }
    public void setQuestionScore(double questionScore)
    {
        this.questionScore = questionScore;
    }

    public double getQuestionScore()
    {
        return questionScore;
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
            .append("paperSubId", getPaperSubId())
            .append("paperId", getPaperId())
            .append("questionId", getQuestionId())
            .append("chapterName", getChapterName())
            .append("chapterSubName", getChapterSubName())
            .append("courseTargetName", getCourseTargetName())
            .append("questionType", getQuestionType())
            .append("questionContent", getQuestionContent())
            .append("evaluateType", getEvaluateType())
            .append("questionAnswer", getQuestionAnswer())
            .append("itemWeight", getItemWeight())
            .append("questionScore", getQuestionScore())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
