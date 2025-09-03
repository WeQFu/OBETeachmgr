package com.ruoyi.teachmgr.teachmonitor.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachPlanMonitor;

/**
 * 计划监控Mapper接口
 * 
 * @author jzg
 * @date 2023-05-16
 */
public interface TeachPlanMonitorMapper 
{
    /**
     * 查询计划监控
     * 
     * @param planMonitorId 计划监控主键
     * @return 计划监控
     */
    public TeachPlanMonitor selectTeachPlanMonitorByPlanMonitorId(Long planMonitorId);

    /**
     * 查询计划监控列表
     * 
     * @param teachPlanMonitor 计划监控
     * @return 计划监控集合
     */
    public List<TeachPlanMonitor> selectTeachPlanMonitorList(TeachPlanMonitor teachPlanMonitor);

    /**
     * 新增计划监控
     * 
     * @param teachPlanMonitor 计划监控
     * @return 结果
     */
    public int insertTeachPlanMonitor(TeachPlanMonitor teachPlanMonitor);

    /**
     * 修改计划监控
     * 
     * @param teachPlanMonitor 计划监控
     * @return 结果
     */
    public int updateTeachPlanMonitor(TeachPlanMonitor teachPlanMonitor);

    /**
     * 删除计划监控
     * 
     * @param planMonitorId 计划监控主键
     * @return 结果
     */
    public int deleteTeachPlanMonitorByPlanMonitorId(Long planMonitorId);

    /**
     * 批量删除计划监控
     * 
     * @param planMonitorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachPlanMonitorByPlanMonitorIds(Long[] planMonitorIds);
}
