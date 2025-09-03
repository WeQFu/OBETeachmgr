package com.ruoyi.teachmgr.teachstart.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教材管理对象 teach_book
 * 
 * @author jzg
 * @date 2023-05-15
 */
public class TeachBook extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** bookid */
    private Long bookId;

    /** 书籍名称 */
    @Excel(name = "书籍名称")
    private String bookName;

    /** 出版社 */
    @Excel(name = "出版社")
    private String bookPublisher;

    /** ISBN */
    @Excel(name = "ISBN")
    private String bookIsbn;

    /** 出版时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出版时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    /** 版本 */
    @Excel(name = "版本")
    private String bookVersion;

    /** 作者 */
    @Excel(name = "作者")
    private String bookAuthor;

    /** 内容介绍 */
    @Excel(name = "内容介绍")
    private String bookIntroduce;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

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
    public void setBookPublisher(String bookPublisher) 
    {
        this.bookPublisher = bookPublisher;
    }

    public String getBookPublisher() 
    {
        return bookPublisher;
    }
    public void setBookIsbn(String bookIsbn) 
    {
        this.bookIsbn = bookIsbn;
    }

    public String getBookIsbn() 
    {
        return bookIsbn;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
    }
    public void setBookVersion(String bookVersion) 
    {
        this.bookVersion = bookVersion;
    }

    public String getBookVersion() 
    {
        return bookVersion;
    }
    public void setBookAuthor(String bookAuthor) 
    {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() 
    {
        return bookAuthor;
    }
    public void setBookIntroduce(String bookIntroduce) 
    {
        this.bookIntroduce = bookIntroduce;
    }

    public String getBookIntroduce() 
    {
        return bookIntroduce;
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
            .append("bookId", getBookId())
            .append("bookName", getBookName())
            .append("bookPublisher", getBookPublisher())
            .append("bookIsbn", getBookIsbn())
            .append("publishTime", getPublishTime())
            .append("bookVersion", getBookVersion())
            .append("bookAuthor", getBookAuthor())
            .append("bookIntroduce", getBookIntroduce())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
