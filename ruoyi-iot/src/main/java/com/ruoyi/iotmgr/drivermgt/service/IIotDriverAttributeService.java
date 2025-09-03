package com.ruoyi.iotmgr.drivermgt.service;

import java.util.List;
import com.ruoyi.iotmgr.drivermgt.domain.IotDriverAttribute;

/**
 * 连接配置Service接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IIotDriverAttributeService 
{
    /**
     * 查询连接配置
     * 
     * @param driverAttributeId 连接配置主键
     * @return 连接配置
     */
    public IotDriverAttribute selectIotDriverAttributeByDriverAttributeId(Long driverAttributeId);

    /**
     * 查询连接配置列表
     * 
     * @param iotDriverAttribute 连接配置
     * @return 连接配置集合
     */
    public List<IotDriverAttribute> selectIotDriverAttributeList(IotDriverAttribute iotDriverAttribute);

    /**
     * 新增连接配置
     * 
     * @param iotDriverAttribute 连接配置
     * @return 结果
     */
    public int insertIotDriverAttribute(IotDriverAttribute iotDriverAttribute);

    /**
     * 修改连接配置
     * 
     * @param iotDriverAttribute 连接配置
     * @return 结果
     */
    public int updateIotDriverAttribute(IotDriverAttribute iotDriverAttribute);

    /**
     * 批量删除连接配置
     * 
     * @param driverAttributeIds 需要删除的连接配置主键集合
     * @return 结果
     */
    public int deleteIotDriverAttributeByDriverAttributeIds(Long[] driverAttributeIds);

    /**
     * 删除连接配置信息
     * 
     * @param driverAttributeId 连接配置主键
     * @return 结果
     */
    public int deleteIotDriverAttributeByDriverAttributeId(Long driverAttributeId);
}
