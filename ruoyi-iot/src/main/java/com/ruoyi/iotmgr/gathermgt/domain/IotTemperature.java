package com.ruoyi.iotmgr.gathermgt.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 温度采集对象 iot_temperature
 * 
 * @author jzq
 * @date 2023-10-11
 */
public class IotTemperature extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** tempid */
    private Long tempId;

    /** 采集温度 */
    @Excel(name = "采集温度")
    private Long tempValue;

    /** 设备id */
    @Excel(name = "设备id")
    private Long deviceId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 采集地区 */
    @Excel(name = "采集地区")
    private String gatherArea;

    /** 采集时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采集时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gatherTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setTempId(Long tempId) 
    {
        this.tempId = tempId;
    }

    public Long getTempId() 
    {
        return tempId;
    }
    public void setTempValue(Long tempValue) 
    {
        this.tempValue = tempValue;
    }

    public Long getTempValue() 
    {
        return tempValue;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setGatherArea(String gatherArea) 
    {
        this.gatherArea = gatherArea;
    }

    public String getGatherArea() 
    {
        return gatherArea;
    }
    public void setGatherTime(Date gatherTime) 
    {
        this.gatherTime = gatherTime;
    }

    public Date getGatherTime() 
    {
        return gatherTime;
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
            .append("tempId", getTempId())
            .append("tempValue", getTempValue())
            .append("deviceId", getDeviceId())
            .append("deviceName", getDeviceName())
            .append("gatherArea", getGatherArea())
            .append("gatherTime", getGatherTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
