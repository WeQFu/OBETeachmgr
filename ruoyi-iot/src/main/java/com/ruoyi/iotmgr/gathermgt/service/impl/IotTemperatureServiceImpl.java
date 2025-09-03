package com.ruoyi.iotmgr.gathermgt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iotmgr.gathermgt.mapper.IotTemperatureMapper;
import com.ruoyi.iotmgr.gathermgt.domain.IotTemperature;
import com.ruoyi.iotmgr.gathermgt.service.IIotTemperatureService;

/**
 * 温度采集Service业务层处理
 * 
 * @author jzq
 * @date 2023-10-11
 */
@Service
public class IotTemperatureServiceImpl implements IIotTemperatureService 
{
    @Autowired
    private IotTemperatureMapper iotTemperatureMapper;

    /**
     * 查询温度采集
     * 
     * @param tempId 温度采集主键
     * @return 温度采集
     */
    @Override
    public IotTemperature selectIotTemperatureByTempId(Long tempId)
    {
        return iotTemperatureMapper.selectIotTemperatureByTempId(tempId);
    }

    /**
     * 查询温度采集列表
     * 
     * @param iotTemperature 温度采集
     * @return 温度采集
     */
    @Override
    public List<IotTemperature> selectIotTemperatureList(IotTemperature iotTemperature)
    {
        return iotTemperatureMapper.selectIotTemperatureList(iotTemperature);
    }

    /**
     * 新增温度采集
     * 
     * @param iotTemperature 温度采集
     * @return 结果
     */
    @Override
    public int insertIotTemperature(IotTemperature iotTemperature)
    {
        iotTemperature.setCreateTime(DateUtils.getNowDate());
        return iotTemperatureMapper.insertIotTemperature(iotTemperature);
    }

    /**
     * 修改温度采集
     * 
     * @param iotTemperature 温度采集
     * @return 结果
     */
    @Override
    public int updateIotTemperature(IotTemperature iotTemperature)
    {
        iotTemperature.setUpdateTime(DateUtils.getNowDate());
        return iotTemperatureMapper.updateIotTemperature(iotTemperature);
    }

    /**
     * 批量删除温度采集
     * 
     * @param tempIds 需要删除的温度采集主键
     * @return 结果
     */
    @Override
    public int deleteIotTemperatureByTempIds(Long[] tempIds)
    {
        return iotTemperatureMapper.deleteIotTemperatureByTempIds(tempIds);
    }

    /**
     * 删除温度采集信息
     * 
     * @param tempId 温度采集主键
     * @return 结果
     */
    @Override
    public int deleteIotTemperatureByTempId(Long tempId)
    {
        return iotTemperatureMapper.deleteIotTemperatureByTempId(tempId);
    }
}
