package com.ruoyi.iotmgr.controlmgt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iotmgr.controlmgt.mapper.IotControlMapper;
import com.ruoyi.iotmgr.controlmgt.domain.IotControl;
import com.ruoyi.iotmgr.controlmgt.service.IIotControlService;

/**
 * 温度控制Service业务层处理
 * 
 * @author jzq
 * @date 2023-10-11
 */
@Service
public class IotControlServiceImpl implements IIotControlService 
{
    @Autowired
    private IotControlMapper iotControlMapper;

    /**
     * 查询温度控制
     * 
     * @param controlId 温度控制主键
     * @return 温度控制
     */
    @Override
    public IotControl selectIotControlByControlId(Long controlId)
    {
        return iotControlMapper.selectIotControlByControlId(controlId);
    }

    /**
     * 查询温度控制列表
     * 
     * @param iotControl 温度控制
     * @return 温度控制
     */
    @Override
    public List<IotControl> selectIotControlList(IotControl iotControl)
    {
        return iotControlMapper.selectIotControlList(iotControl);
    }

    /**
     * 新增温度控制
     * 
     * @param iotControl 温度控制
     * @return 结果
     */
    @Override
    public int insertIotControl(IotControl iotControl)
    {
        iotControl.setCreateTime(DateUtils.getNowDate());
        return iotControlMapper.insertIotControl(iotControl);
    }

    /**
     * 修改温度控制
     * 
     * @param iotControl 温度控制
     * @return 结果
     */
    @Override
    public int updateIotControl(IotControl iotControl)
    {
        iotControl.setUpdateTime(DateUtils.getNowDate());
        return iotControlMapper.updateIotControl(iotControl);
    }

    /**
     * 批量删除温度控制
     * 
     * @param controlIds 需要删除的温度控制主键
     * @return 结果
     */
    @Override
    public int deleteIotControlByControlIds(Long[] controlIds)
    {
        return iotControlMapper.deleteIotControlByControlIds(controlIds);
    }

    /**
     * 删除温度控制信息
     * 
     * @param controlId 温度控制主键
     * @return 结果
     */
    @Override
    public int deleteIotControlByControlId(Long controlId)
    {
        return iotControlMapper.deleteIotControlByControlId(controlId);
    }
}
