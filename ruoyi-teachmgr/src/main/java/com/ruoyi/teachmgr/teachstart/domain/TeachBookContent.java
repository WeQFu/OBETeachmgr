package com.ruoyi.teachmgr.teachstart.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
//import com.ruoyi.common.core.domain.TreeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 教材章节对象 teach_book_content
 * 
 * @author jzg
 * @date 2023-05-18
 */
public class TeachBookContent extends BaseEntity  //TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 子id */
    private Long bookChapterId;

    /** 父id */
    @Excel(name = "父id")
    private Long bookChapterPid;

    /** bookid(教材表） */
    @Excel(name = "bookid(教材表）")
    private Long bookId;

    /** 教材名称（教材表） */
    @Excel(name = "教材名称", readConverterExp = "教=材表")
    private String bookName;

    /** 章节名称 */
    @Excel(name = "章节名称")
    private String chapterName;

    /** 章节描述 */
    @Excel(name = "章节描述")
    private String chapterDescribe;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    //
    /** 祖级列表 */
    private String ancestors;

    /** 显示顺序 */
    private Integer orderNum;

    /** 子部门 */
    private List<TeachBookContent> children = new ArrayList<TeachBookContent>();

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public List<TeachBookContent> getChildren() {
        return children;
    }

    public void setChildren(List<TeachBookContent> children) {
        this.children = children;
    }

    public void setBookChapterId(Long bookChapterId)
    {
        this.bookChapterId = bookChapterId;
    }

    public Long getBookChapterId() 
    {
        return bookChapterId;
    }
    public void setBookChapterPid(Long bookChapterPid) 
    {
        this.bookChapterPid = bookChapterPid;
    }

    public Long getBookChapterPid() 
    {
        return bookChapterPid;
    }
    public void setBookId(Long bookId) 
    {
        this.bookId = bookId;
    }

    public Long getBookId() 
    {
        return bookId;
    }
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setChapterName(String chapterName) 
    {
        this.chapterName = chapterName;
    }

    public String getChapterName() 
    {
        return chapterName;
    }
    public void setChapterDescribe(String chapterDescribe) 
    {
        this.chapterDescribe = chapterDescribe;
    }

    public String getChapterDescribe() 
    {
        return chapterDescribe;
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
            .append("bookChapterId", getBookChapterId())
            .append("bookChapterPid", getBookChapterPid())
            .append("ancestors", getAncestors())
            .append("bookId", getBookId())
            .append("bookName", getBookName())
            .append("chapterName", getChapterName())
            .append("chapterDescribe", getChapterDescribe())
            .append("orderNum", getOrderNum())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
