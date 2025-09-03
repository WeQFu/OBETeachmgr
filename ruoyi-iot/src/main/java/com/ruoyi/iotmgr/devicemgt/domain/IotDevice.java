package com.ruoyi.iotmgr.devicemgt.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备信息对象 iot_device
 * 
 * @author jzq
 * @date 2023-10-11
 */
public class IotDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** deviceid */
    private Long deviceId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备号 */
    @Excel(name = "设备号")
    private String deviceNo;

    /** 部署地区 */
    @Excel(name = "部署地区")
    private String deviceArea;

    /** 安装时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "安装时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date installTime;

    /** 设备管理者 */
    @Excel(name = "设备管理者")
    private String deviceMaker;

    /** 设备介绍 */
    @Excel(name = "设备介绍")
    private String deviceIntroduce;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

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
    public void setDeviceNo(String deviceNo) 
    {
        this.deviceNo = deviceNo;
    }

    public String getDeviceNo() 
    {
        return deviceNo;
    }
    public void setDeviceArea(String deviceArea) 
    {
        this.deviceArea = deviceArea;
    }

    public String getDeviceArea() 
    {
        return deviceArea;
    }
    public void setInstallTime(Date installTime) 
    {
        this.installTime = installTime;
    }

    public Date getInstallTime() 
    {
        return installTime;
    }
    public void setDeviceMaker(String deviceMaker) 
    {
        this.deviceMaker = deviceMaker;
    }

    public String getDeviceMaker() 
    {
        return deviceMaker;
    }
    public void setDeviceIntroduce(String deviceIntroduce) 
    {
        this.deviceIntroduce = deviceIntroduce;
    }

    public String getDeviceIntroduce() 
    {
        return deviceIntroduce;
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
            .append("deviceId", getDeviceId())
            .append("deviceName", getDeviceName())
            .append("deviceNo", getDeviceNo())
            .append("deviceArea", getDeviceArea())
            .append("installTime", getInstallTime())
            .append("deviceMaker", getDeviceMaker())
            .append("deviceIntroduce", getDeviceIntroduce())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
