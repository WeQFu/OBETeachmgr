package com.ruoyi.iotmgr.devicemgt.mapper;

import java.util.List;
import com.ruoyi.iotmgr.devicemgt.domain.IotDevice;

/**
 * 设备信息Mapper接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IotDeviceMapper 
{
    /**
     * 查询设备信息
     * 
     * @param deviceId 设备信息主键
     * @return 设备信息
     */
    public IotDevice selectIotDeviceByDeviceId(Long deviceId);

    /**
     * 查询设备信息列表
     * 
     * @param iotDevice 设备信息
     * @return 设备信息集合
     */
    public List<IotDevice> selectIotDeviceList(IotDevice iotDevice);

    /**
     * 新增设备信息
     * 
     * @param iotDevice 设备信息
     * @return 结果
     */
    public int insertIotDevice(IotDevice iotDevice);

    /**
     * 修改设备信息
     * 
     * @param iotDevice 设备信息
     * @return 结果
     */
    public int updateIotDevice(IotDevice iotDevice);

    /**
     * 删除设备信息
     * 
     * @param deviceId 设备信息主键
     * @return 结果
     */
    public int deleteIotDeviceByDeviceId(Long deviceId);

    /**
     * 批量删除设备信息
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotDeviceByDeviceIds(Long[] deviceIds);
}
