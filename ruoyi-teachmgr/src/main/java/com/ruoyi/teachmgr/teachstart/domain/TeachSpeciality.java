package com.ruoyi.teachmgr.teachstart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专业管理对象 teach_speciality
 * 
 * @author jzg
 * @date 2023-05-10
 */
public class TeachSpeciality extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long specialityId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String specialityName;

    /** 专业介绍 */
    @Excel(name = "专业介绍")
    private String specialityIntroduce;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSpecialityId(Long specialityId) 
    {
        this.specialityId = specialityId;
    }

    public Long getSpecialityId() 
    {
        return specialityId;
    }
    public void setSpecialityName(String specialityName) 
    {
        this.specialityName = specialityName;
    }

    public String getSpecialityName() 
    {
        return specialityName;
    }
    public void setSpecialityIntroduce(String specialityIntroduce) 
    {
        this.specialityIntroduce = specialityIntroduce;
    }

    public String getSpecialityIntroduce() 
    {
        return specialityIntroduce;
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
            .append("specialityId", getSpecialityId())
            .append("specialityName", getSpecialityName())
            .append("specialityIntroduce", getSpecialityIntroduce())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
