package com.ruoyi.iotmgr.drivermgt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 连接配置对象 iot_driver_attribute
 * 
 * @author jzq
 * @date 2023-10-11
 */
public class IotDriverAttribute extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long driverAttributeId;

    /** 显示名称 */
    @Excel(name = "显示名称")
    private String displayName;

    /** 名称 */
    @Excel(name = "名称")
    private String attributeName;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 默认值 */
    @Excel(name = "默认值")
    private String value;

    /** 驱动ID */
    @Excel(name = "驱动ID")
    private Long driverId;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 租户 */
    @Excel(name = "租户")
    private String tenant;

    /** 逻辑删标识 */
    @Excel(name = "逻辑删标识")
    private Integer deleted;

    public void setDriverAttributeId(Long driverAttributeId) 
    {
        this.driverAttributeId = driverAttributeId;
    }

    public Long getDriverAttributeId() 
    {
        return driverAttributeId;
    }
    public void setDisplayName(String displayName) 
    {
        this.displayName = displayName;
    }

    public String getDisplayName() 
    {
        return displayName;
    }
    public void setAttributeName(String attributeName) 
    {
        this.attributeName = attributeName;
    }

    public String getAttributeName() 
    {
        return attributeName;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getValue() 
    {
        return value;
    }
    public void setDriverId(Long driverId) 
    {
        this.driverId = driverId;
    }

    public Long getDriverId() 
    {
        return driverId;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setTenant(String tenant) 
    {
        this.tenant = tenant;
    }

    public String getTenant() 
    {
        return tenant;
    }
    public void setDeleted(Integer deleted) 
    {
        this.deleted = deleted;
    }

    public Integer getDeleted() 
    {
        return deleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("driverAttributeId", getDriverAttributeId())
            .append("displayName", getDisplayName())
            .append("attributeName", getAttributeName())
            .append("type", getType())
            .append("value", getValue())
            .append("driverId", getDriverId())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("tenant", getTenant())
            .append("deleted", getDeleted())
            .toString();
    }
}
