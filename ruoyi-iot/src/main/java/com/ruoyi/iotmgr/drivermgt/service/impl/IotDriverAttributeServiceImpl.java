package com.ruoyi.iotmgr.drivermgt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iotmgr.drivermgt.mapper.IotDriverAttributeMapper;
import com.ruoyi.iotmgr.drivermgt.domain.IotDriverAttribute;
import com.ruoyi.iotmgr.drivermgt.service.IIotDriverAttributeService;

/**
 * 连接配置Service业务层处理
 * 
 * @author jzq
 * @date 2023-10-11
 */
@Service
public class IotDriverAttributeServiceImpl implements IIotDriverAttributeService 
{
    @Autowired
    private IotDriverAttributeMapper iotDriverAttributeMapper;

    /**
     * 查询连接配置
     * 
     * @param driverAttributeId 连接配置主键
     * @return 连接配置
     */
    @Override
    public IotDriverAttribute selectIotDriverAttributeByDriverAttributeId(Long driverAttributeId)
    {
        return iotDriverAttributeMapper.selectIotDriverAttributeByDriverAttributeId(driverAttributeId);
    }

    /**
     * 查询连接配置列表
     * 
     * @param iotDriverAttribute 连接配置
     * @return 连接配置
     */
    @Override
    public List<IotDriverAttribute> selectIotDriverAttributeList(IotDriverAttribute iotDriverAttribute)
    {
        return iotDriverAttributeMapper.selectIotDriverAttributeList(iotDriverAttribute);
    }

    /**
     * 新增连接配置
     * 
     * @param iotDriverAttribute 连接配置
     * @return 结果
     */
    @Override
    public int insertIotDriverAttribute(IotDriverAttribute iotDriverAttribute)
    {
        iotDriverAttribute.setCreateTime(DateUtils.getNowDate());
        return iotDriverAttributeMapper.insertIotDriverAttribute(iotDriverAttribute);
    }

    /**
     * 修改连接配置
     * 
     * @param iotDriverAttribute 连接配置
     * @return 结果
     */
    @Override
    public int updateIotDriverAttribute(IotDriverAttribute iotDriverAttribute)
    {
        iotDriverAttribute.setUpdateTime(DateUtils.getNowDate());
        return iotDriverAttributeMapper.updateIotDriverAttribute(iotDriverAttribute);
    }

    /**
     * 批量删除连接配置
     * 
     * @param driverAttributeIds 需要删除的连接配置主键
     * @return 结果
     */
    @Override
    public int deleteIotDriverAttributeByDriverAttributeIds(Long[] driverAttributeIds)
    {
        return iotDriverAttributeMapper.deleteIotDriverAttributeByDriverAttributeIds(driverAttributeIds);
    }

    /**
     * 删除连接配置信息
     * 
     * @param driverAttributeId 连接配置主键
     * @return 结果
     */
    @Override
    public int deleteIotDriverAttributeByDriverAttributeId(Long driverAttributeId)
    {
        return iotDriverAttributeMapper.deleteIotDriverAttributeByDriverAttributeId(driverAttributeId);
    }
}
