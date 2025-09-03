package com.ruoyi.iotmgr.controlmgt.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 温度控制对象 iot_control
 * 
 * @author jzq
 * @date 2023-10-11
 */
public class IotControl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** controlid */
    private Long controlId;

    /** 设备id */
    @Excel(name = "设备id")
    private Long deviceId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 采集频率 */
    @Excel(name = "采集频率")
    private Long gatherFreq;

    /** 采集地区 */
    @Excel(name = "采集地区")
    private String gatherArea;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setControlId(Long controlId) 
    {
        this.controlId = controlId;
    }

    public Long getControlId() 
    {
        return controlId;
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
    public void setGatherFreq(Long gatherFreq) 
    {
        this.gatherFreq = gatherFreq;
    }

    public Long getGatherFreq() 
    {
        return gatherFreq;
    }
    public void setGatherArea(String gatherArea) 
    {
        this.gatherArea = gatherArea;
    }

    public String getGatherArea() 
    {
        return gatherArea;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("controlId", getControlId())
            .append("deviceId", getDeviceId())
            .append("deviceName", getDeviceName())
            .append("gatherFreq", getGatherFreq())
            .append("gatherArea", getGatherArea())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
