package com.ruoyi.iotmgr.controlmgt.mapper;

import java.util.List;
import com.ruoyi.iotmgr.controlmgt.domain.IotControl;

/**
 * 温度控制Mapper接口
 * 
 * @author jzq
 * @date 2023-10-11
 */
public interface IotControlMapper 
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
     * 删除温度控制
     * 
     * @param controlId 温度控制主键
     * @return 结果
     */
    public int deleteIotControlByControlId(Long controlId);

    /**
     * 批量删除温度控制
     * 
     * @param controlIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotControlByControlIds(Long[] controlIds);
}
