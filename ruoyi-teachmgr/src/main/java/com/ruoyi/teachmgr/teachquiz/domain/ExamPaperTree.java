package com.ruoyi.teachmgr.teachquiz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 树形组卷对象 exam_paper_tree
 * 
 * @author jzg
 * @date 2023-05-30
 */
public class ExamPaperTree extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** paper_tree_id */
    private Long paperTreeId;

    /** paper_tree_pid */
    @Excel(name = "paper_tree_pid")
    private Long paperTreePid;

    /** 考题概览 */
    @Excel(name = "考题概览")
    private String papertreeleaf;

    /** 学期 */
    @Excel(name = "学期")
    private String paperSemester;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 试题id */
    @Excel(name = "试题id")
    private Long paperId;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPaperTreeId(Long paperTreeId) 
    {
        this.paperTreeId = paperTreeId;
    }

    public Long getPaperTreeId() 
    {
        return paperTreeId;
    }
    public void setPaperTreePid(Long paperTreePid) 
    {
        this.paperTreePid = paperTreePid;
    }

    public Long getPaperTreePid() 
    {
        return paperTreePid;
    }
    public void setPapertreeleaf(String papertreeleaf) 
    {
        this.papertreeleaf = papertreeleaf;
    }

    public String getPapertreeleaf() 
    {
        return papertreeleaf;
    }
    public void setPaperSemester(String paperSemester) 
    {
        this.paperSemester = paperSemester;
    }

    public String getPaperSemester() 
    {
        return paperSemester;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
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
            .append("paperTreeId", getPaperTreeId())
            .append("paperTreePid", getPaperTreePid())
            .append("papertreeleaf", getPapertreeleaf())
            .append("paperSemester", getPaperSemester())
            .append("courseName", getCourseName())
            .append("paperId", getPaperId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
