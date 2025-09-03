package com.ruoyi.iotmgr.gathermgt.mapper;

import java.util.List;
import com.ruoyi.iotmgr.gathermgt.domain.IotTemperature;

/**
 * 温度采集Mapper接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IotTemperatureMapper 
{
    /**
     * 查询温度采集
     * 
     * @param tempId 温度采集主键
     * @return 温度采集
     */
    public IotTemperature selectIotTemperatureByTempId(Long tempId);

    /**
     * 查询温度采集列表
     * 
     * @param iotTemperature 温度采集
     * @return 温度采集集合
     */
    public List<IotTemperature> selectIotTemperatureList(IotTemperature iotTemperature);

    /**
     * 新增温度采集
     * 
     * @param iotTemperature 温度采集
     * @return 结果
     */
    public int insertIotTemperature(IotTemperature iotTemperature);

    /**
     * 修改温度采集
     * 
     * @param iotTemperature 温度采集
     * @return 结果
     */
    public int updateIotTemperature(IotTemperature iotTemperature);

    /**
     * 删除温度采集
     * 
     * @param tempId 温度采集主键
     * @return 结果
     */
    public int deleteIotTemperatureByTempId(Long tempId);

    /**
     * 批量删除温度采集
     * 
     * @param tempIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotTemperatureByTempIds(Long[] tempIds);
}
