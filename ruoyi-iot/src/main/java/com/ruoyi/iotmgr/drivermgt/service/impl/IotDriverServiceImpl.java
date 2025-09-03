package com.ruoyi.iotmgr.drivermgt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iotmgr.drivermgt.mapper.IotDriverMapper;
import com.ruoyi.iotmgr.drivermgt.domain.IotDriver;
import com.ruoyi.iotmgr.drivermgt.service.IIotDriverService;

/**
 * 协议驱动Service业务层处理
 * 
 * @author jzq
 * @date 2023-10-11
 */
@Service
public class IotDriverServiceImpl implements IIotDriverService 
{
    @Autowired
    private IotDriverMapper iotDriverMapper;

    /**
     * 查询协议驱动
     * 
     * @param driverId 协议驱动主键
     * @return 协议驱动
     */
    @Override
    public IotDriver selectIotDriverByDriverId(Long driverId)
    {
        return iotDriverMapper.selectIotDriverByDriverId(driverId);
    }

    /**
     * 查询协议驱动列表
     * 
     * @param iotDriver 协议驱动
     * @return 协议驱动
     */
    @Override
    public List<IotDriver> selectIotDriverList(IotDriver iotDriver)
    {
        return iotDriverMapper.selectIotDriverList(iotDriver);
    }

    /**
     * 新增协议驱动
     * 
     * @param iotDriver 协议驱动
     * @return 结果
     */
    @Override
    public int insertIotDriver(IotDriver iotDriver)
    {
        iotDriver.setCreateTime(DateUtils.getNowDate());
        return iotDriverMapper.insertIotDriver(iotDriver);
    }

    /**
     * 修改协议驱动
     * 
     * @param iotDriver 协议驱动
     * @return 结果
     */
    @Override
    public int updateIotDriver(IotDriver iotDriver)
    {
        iotDriver.setUpdateTime(DateUtils.getNowDate());
        return iotDriverMapper.updateIotDriver(iotDriver);
    }

    /**
     * 批量删除协议驱动
     * 
     * @param driverIds 需要删除的协议驱动主键
     * @return 结果
     */
    @Override
    public int deleteIotDriverByDriverIds(Long[] driverIds)
    {
        return iotDriverMapper.deleteIotDriverByDriverIds(driverIds);
    }

    /**
     * 删除协议驱动信息
     * 
     * @param driverId 协议驱动主键
     * @return 结果
     */
    @Override
    public int deleteIotDriverByDriverId(Long driverId)
    {
        return iotDriverMapper.deleteIotDriverByDriverId(driverId);
    }
}
