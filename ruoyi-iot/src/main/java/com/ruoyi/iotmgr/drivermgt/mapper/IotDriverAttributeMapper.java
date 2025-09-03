package com.ruoyi.iotmgr.drivermgt.mapper;

import java.util.List;
import com.ruoyi.iotmgr.drivermgt.domain.IotDriverAttribute;

/**
 * 连接配置Mapper接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IotDriverAttributeMapper 
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
     * 删除连接配置
     * 
     * @param driverAttributeId 连接配置主键
     * @return 结果
     */
    public int deleteIotDriverAttributeByDriverAttributeId(Long driverAttributeId);

    /**
     * 批量删除连接配置
     * 
     * @param driverAttributeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotDriverAttributeByDriverAttributeIds(Long[] driverAttributeIds);
}
