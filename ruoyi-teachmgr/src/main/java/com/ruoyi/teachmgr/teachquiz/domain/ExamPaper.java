package com.ruoyi.teachmgr.teachquiz.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 组卷信息对象 exam_paper
 * 
 * @author jzg
 * @date 2023-05-25
 */
public class ExamPaper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** paper_id */
    private Long paperId;

    /** course_id */
    @Excel(name = "course_id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 学期 */
    @Excel(name = "学期")
    private String paperSemester;

    /** 组卷类型（考试、作业） */
    @Excel(name = "组卷类型", readConverterExp = "考=试、作业")
    private String paperType;

    /** 组卷名称（xx考试，xx作业） */
    @Excel(name = "组卷名称", readConverterExp = "x=x考试，xx作业")
    private String paperName;

    /** 整体权重 */
    @Excel(name = "整体权重")
    private double paperWeight;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 组卷详情信息 */
    private List<ExamPaperSub> examPaperSubList;

    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
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
    public void setPaperSemester(String paperSemester) 
    {
        this.paperSemester = paperSemester;
    }

    public String getPaperSemester() 
    {
        return paperSemester;
    }
    public void setPaperType(String paperType) 
    {
        this.paperType = paperType;
    }

    public String getPaperType() 
    {
        return paperType;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setPaperWeight(double paperWeight)
    {
        this.paperWeight = paperWeight;
    }

    public double getPaperWeight()
    {
        return paperWeight;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public List<ExamPaperSub> getExamPaperSubList()
    {
        return examPaperSubList;
    }

    public void setExamPaperSubList(List<ExamPaperSub> examPaperSubList)
    {
        this.examPaperSubList = examPaperSubList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paperId", getPaperId())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("paperSemester", getPaperSemester())
            .append("paperType", getPaperType())
            .append("paperName", getPaperName())
            .append("paperWeight", getPaperWeight())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("examPaperSubList", getExamPaperSubList())
            .toString();
    }
}
