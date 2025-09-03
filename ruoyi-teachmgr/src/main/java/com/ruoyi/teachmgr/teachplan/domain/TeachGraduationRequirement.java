package com.ruoyi.teachmgr.teachplan.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 毕业要求对象 teach_graduation_requirement
 * 
 * @author jzg
 * @date 2023-06-13
 */
public class TeachGraduationRequirement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 子要求id */
    private Long requirementId;

    /** 父要求id */
    @Excel(name = "父要求id")
    private Long requirementPid;

    /** 毕业要求名称 */
    @Excel(name = "毕业要求名称")
    private String requirementName;

    /** 培养目标 */
    @Excel(name = "培养目标")
    private String traintargetIds;

    /** 毕业要求内容 */
    @Excel(name = "毕业要求内容")
    private String requirementContent;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    ////
    /** 祖级列表 */
    private String ancestors;

    /** 显示顺序 */
    private Integer orderNum;

    /** 子要求 */
    private List<TeachGraduationRequirement> children = new ArrayList<TeachGraduationRequirement>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
////------start
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

    public List<TeachGraduationRequirement> getChildren() {
        return children;
    }

    public void setChildren(List<TeachGraduationRequirement> children) {
        this.children = children;
    }
//////---end
    public void setRequirementId(Long requirementId)
    {
        this.requirementId = requirementId;
    }

    public Long getRequirementId()
    {
        return requirementId;
    }
    public void setRequirementPid(Long requirementPid)
    {
        this.requirementPid = requirementPid;
    }

    public Long getRequirementPid()
    {
        return requirementPid;
    }
    public void setRequirementName(String requirementName)
    {
        this.requirementName = requirementName;
    }

    public String getRequirementName()
    {
        return requirementName;
    }
    public void setTraintargetIds(String traintargetIds)
    {
        this.traintargetIds = traintargetIds;
    }

    public String getTraintargetIds()
    {
        return traintargetIds;
    }
    public void setRequirementContent(String requirementContent)
    {
        this.requirementContent = requirementContent;
    }

    public String getRequirementContent()
    {
        return requirementContent;
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
                .append("requirementId", getRequirementId())
                .append("requirementPid", getRequirementPid())
                .append("ancestors", getAncestors())
                .append("requirementName", getRequirementName())
                .append("traintargetIds", getTraintargetIds())
                .append("requirementContent", getRequirementContent())
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
