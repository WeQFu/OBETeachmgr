package com.ruoyi.iotmgr.drivermgt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 协议驱动对象 iot_driver
 * 
 * @author jzq
 * @date 2023-10-11
 */
public class IotDriver extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long driverId;

    /** 协议名称 */
    @Excel(name = "协议名称")
    private String driverName;

    /** 协议服务名称 */
    @Excel(name = "协议服务名称")
    private String serviceName;

    /** 主机IP */
    @Excel(name = "主机IP")
    private String host;

    /** 端口 */
    @Excel(name = "端口")
    private Long port;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 租户 */
    @Excel(name = "租户")
    private String tenant;

    /** 逻辑删标识 */
    @Excel(name = "逻辑删标识")
    private Integer deleted;

    public void setDriverId(Long driverId) 
    {
        this.driverId = driverId;
    }

    public Long getDriverId() 
    {
        return driverId;
    }
    public void setDriverName(String driverName) 
    {
        this.driverName = driverName;
    }

    public String getDriverName() 
    {
        return driverName;
    }
    public void setServiceName(String serviceName) 
    {
        this.serviceName = serviceName;
    }

    public String getServiceName() 
    {
        return serviceName;
    }
    public void setHost(String host) 
    {
        this.host = host;
    }

    public String getHost() 
    {
        return host;
    }
    public void setPort(Long port) 
    {
        this.port = port;
    }

    public Long getPort() 
    {
        return port;
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
            .append("driverId", getDriverId())
            .append("driverName", getDriverName())
            .append("serviceName", getServiceName())
            .append("host", getHost())
            .append("port", getPort())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("tenant", getTenant())
            .append("deleted", getDeleted())
            .toString();
    }
}
