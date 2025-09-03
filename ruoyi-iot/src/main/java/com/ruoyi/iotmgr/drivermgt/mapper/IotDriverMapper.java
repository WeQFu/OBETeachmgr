package com.ruoyi.iotmgr.drivermgt.mapper;

import java.util.List;
import com.ruoyi.iotmgr.drivermgt.domain.IotDriver;

/**
 * 协议驱动Mapper接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IotDriverMapper 
{
    /**
     * 查询协议驱动
     * 
     * @param driverId 协议驱动主键
     * @return 协议驱动
     */
    public IotDriver selectIotDriverByDriverId(Long driverId);

    /**
     * 查询协议驱动列表
     * 
     * @param iotDriver 协议驱动
     * @return 协议驱动集合
     */
    public List<IotDriver> selectIotDriverList(IotDriver iotDriver);

    /**
     * 新增协议驱动
     * 
     * @param iotDriver 协议驱动
     * @return 结果
     */
    public int insertIotDriver(IotDriver iotDriver);

    /**
     * 修改协议驱动
     * 
     * @param iotDriver 协议驱动
     * @return 结果
     */
    public int updateIotDriver(IotDriver iotDriver);

    /**
     * 删除协议驱动
     * 
     * @param driverId 协议驱动主键
     * @return 结果
     */
    public int deleteIotDriverByDriverId(Long driverId);

    /**
     * 批量删除协议驱动
     * 
     * @param driverIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotDriverByDriverIds(Long[] driverIds);
}
