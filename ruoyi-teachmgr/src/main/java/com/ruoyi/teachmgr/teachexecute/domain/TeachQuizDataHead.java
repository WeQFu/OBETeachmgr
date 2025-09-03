package com.ruoyi.teachmgr.teachexecute.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考试阅卷对象 teach_quiz_data_head
 * 
 * @author jzg
 * @date 2023-06-06
 */
public class TeachQuizDataHead extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** quiz_data_head_id */
    private Long quizDataHeadId;

    /** 学生id */
    @Excel(name = "学生id")
    private Long userId;

    /** 学号 */
    @Excel(name = "学号")
    private String userName;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String nickName;

    /** 班级ID */
    @Excel(name = "班级ID")
    private Long deptId;

    /** 考试发布id */
    @Excel(name = "考试发布id")
    private Long quizPublishId;

    /** 学期 */
    @Excel(name = "学期")
    private String quizSemester;

    /** 组卷paper_id */
    @Excel(name = "组卷paper_id")
    private Long paperId;

    /** 组卷名称（xx考试，xx作业） */
    @Excel(name = "组卷名称", readConverterExp = "x=x考试，xx作业")
    private String paperName;

    /** 题干（题库表） */
    @Excel(name = "题干", readConverterExp = "题=库表")
    private String questionContent;

    /** 答案 */
    @Excel(name = "答案")
    private String questionAnswer;

    /** 本题得分 */
    @Excel(name = "本题得分")
    private Double questionScore;

    /** 整体权重 */
    @Excel(name = "整体权重")
    private Double paperWeight;

    /** 总分 */
    @Excel(name = "总分")
    private Double quizTotalScore;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 第一题得分 */
    @Excel(name = "第一题得分")
    private Double score1;

    /** 第二题得分 */
    @Excel(name = "第二题得分")
    private Double score2;

    /** 第三题得分 */
    @Excel(name = "第三题得分")
    private Double score3;

    /** 第四题得分 */
    @Excel(name = "第四题得分")
    private Double score4;

    public void setQuizDataHeadId(Long quizDataHeadId) 
    {
        this.quizDataHeadId = quizDataHeadId;
    }

    public Long getQuizDataHeadId() 
    {
        return quizDataHeadId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setQuizPublishId(Long quizPublishId) 
    {
        this.quizPublishId = quizPublishId;
    }

    public Long getQuizPublishId() 
    {
        return quizPublishId;
    }
    public void setQuizSemester(String quizSemester) 
    {
        this.quizSemester = quizSemester;
    }

    public String getQuizSemester() 
    {
        return quizSemester;
    }
    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setQuestionContent(String questionContent) 
    {
        this.questionContent = questionContent;
    }

    public String getQuestionContent() 
    {
        return questionContent;
    }
    public void setQuestionAnswer(String questionAnswer) 
    {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswer() 
    {
        return questionAnswer;
    }
    public void setQuestionScore(Double questionScore) 
    {
        this.questionScore = questionScore;
    }

    public Double getQuestionScore() 
    {
        return questionScore;
    }
    public void setPaperWeight(Double paperWeight) 
    {
        this.paperWeight = paperWeight;
    }

    public Double getPaperWeight() 
    {
        return paperWeight;
    }
    public void setQuizTotalScore(Double quizTotalScore) 
    {
        this.quizTotalScore = quizTotalScore;
    }

    public Double getQuizTotalScore() 
    {
        return quizTotalScore;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setScore1(Double score1) 
    {
        this.score1 = score1;
    }

    public Double getScore1() 
    {
        return score1;
    }
    public void setScore2(Double score2) 
    {
        this.score2 = score2;
    }

    public Double getScore2() 
    {
        return score2;
    }
    public void setScore3(Double score3) 
    {
        this.score3 = score3;
    }

    public Double getScore3() 
    {
        return score3;
    }
    public void setScore4(Double score4) 
    {
        this.score4 = score4;
    }

    public Double getScore4() 
    {
        return score4;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("quizDataHeadId", getQuizDataHeadId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("nickName", getNickName())
            .append("deptId", getDeptId())
            .append("quizPublishId", getQuizPublishId())
            .append("quizSemester", getQuizSemester())
            .append("paperId", getPaperId())
            .append("paperName", getPaperName())
            .append("questionContent", getQuestionContent())
            .append("questionAnswer", getQuestionAnswer())
            .append("questionScore", getQuestionScore())
            .append("paperWeight", getPaperWeight())
            .append("quizTotalScore", getQuizTotalScore())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("score1", getScore1())
            .append("score2", getScore2())
            .append("score3", getScore3())
            .append("score4", getScore4())
            .toString();
    }
}
