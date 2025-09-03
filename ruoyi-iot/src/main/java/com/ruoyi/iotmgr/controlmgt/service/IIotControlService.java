package com.ruoyi.iotmgr.controlmgt.service;

import java.util.List;
import com.ruoyi.iotmgr.controlmgt.domain.IotControl;

/**
 * 温度控制Service接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IIotControlService 
{
    /**
     * 查询温度控制
     * 
     * @param controlId 温度控制主键
     * @return 温度控制
     */
    public IotControl selectIotControlByControlId(Long controlId);

    /**
     * 查询温度控制列表
     * 
     * @param iotControl 温度控制
     * @return 温度控制集合
     */
    public List<IotControl> selectIotControlList(IotControl iotControl);

    /**
     * 新增温度控制
     * 
     * @param iotControl 温度控制
     * @return 结果
     */
    public int insertIotControl(IotControl iotControl);

    /**
     * 修改温度控制
     * 
     * @param iotControl 温度控制
     * @return 结果
     */
    public int updateIotControl(IotControl iotControl);

    /**
     * 批量删除温度控制
     * 
     * @param controlIds 需要删除的温度控制主键集合
     * @return 结果
     */
    public int deleteIotControlByControlIds(Long[] controlIds);

    /**
     * 删除温度控制信息
     * 
     * @param controlId 温度控制主键
     * @return 结果
     */
    public int deleteIotControlByControlId(Long controlId);
}
