package com.ruoyi.iotmgr.devicemgt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iotmgr.devicemgt.mapper.IotDeviceMapper;
import com.ruoyi.iotmgr.devicemgt.domain.IotDevice;
import com.ruoyi.iotmgr.devicemgt.service.IIotDeviceService;

/**
 * 设备信息Service业务层处理
 * 
 * @author jzq
 * @date 2023-10-11
 */
@Service
public class IotDeviceServiceImpl implements IIotDeviceService 
{
    @Autowired
    private IotDeviceMapper iotDeviceMapper;

    /**
     * 查询设备信息
     * 
     * @param deviceId 设备信息主键
     * @return 设备信息
     */
    @Override
    public IotDevice selectIotDeviceByDeviceId(Long deviceId)
    {
        return iotDeviceMapper.selectIotDeviceByDeviceId(deviceId);
    }

    /**
     * 查询设备信息列表
     * 
     * @param iotDevice 设备信息
     * @return 设备信息
     */
    @Override
    public List<IotDevice> selectIotDeviceList(IotDevice iotDevice)
    {
        return iotDeviceMapper.selectIotDeviceList(iotDevice);
    }

    /**
     * 新增设备信息
     * 
     * @param iotDevice 设备信息
     * @return 结果
     */
    @Override
    public int insertIotDevice(IotDevice iotDevice)
    {
        iotDevice.setCreateTime(DateUtils.getNowDate());
        return iotDeviceMapper.insertIotDevice(iotDevice);
    }

    /**
     * 修改设备信息
     * 
     * @param iotDevice 设备信息
     * @return 结果
     */
    @Override
    public int updateIotDevice(IotDevice iotDevice)
    {
        iotDevice.setUpdateTime(DateUtils.getNowDate());
        return iotDeviceMapper.updateIotDevice(iotDevice);
    }

    /**
     * 批量删除设备信息
     * 
     * @param deviceIds 需要删除的设备信息主键
     * @return 结果
     */
    @Override
    public int deleteIotDeviceByDeviceIds(Long[] deviceIds)
    {
        return iotDeviceMapper.deleteIotDeviceByDeviceIds(deviceIds);
    }

    /**
     * 删除设备信息信息
     * 
     * @param deviceId 设备信息主键
     * @return 结果
     */
    @Override
    public int deleteIotDeviceByDeviceId(Long deviceId)
    {
        return iotDeviceMapper.deleteIotDeviceByDeviceId(deviceId);
    }
}
