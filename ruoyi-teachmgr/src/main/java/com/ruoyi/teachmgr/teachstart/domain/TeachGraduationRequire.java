package com.ruoyi.teachmgr.teachstart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 毕业要求对象 teach_graduation_require
 * 
 * @author jzg
 * @date 2024-03-03
 */
public class TeachGraduationRequire extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 毕业要求id */
    private Long graduRequireId;

    /** 毕业要求名称 */
    @Excel(name = "毕业要求名称")
    private String graduRequireName;

    /** 毕业要求内容 */
    @Excel(name = "毕业要求内容")
    private String graduRequireContent;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setGraduRequireId(Long graduRequireId) 
    {
        this.graduRequireId = graduRequireId;
    }

    public Long getGraduRequireId() 
    {
        return graduRequireId;
    }
    public void setGraduRequireName(String graduRequireName) 
    {
        this.graduRequireName = graduRequireName;
    }

    public String getGraduRequireName() 
    {
        return graduRequireName;
    }
    public void setGraduRequireContent(String graduRequireContent) 
    {
        this.graduRequireContent = graduRequireContent;
    }

    public String getGraduRequireContent() 
    {
        return graduRequireContent;
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
            .append("graduRequireId", getGraduRequireId())
            .append("graduRequireName", getGraduRequireName())
            .append("graduRequireContent", getGraduRequireContent())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
