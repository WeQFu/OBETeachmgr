package com.ruoyi.teachmgr.teachmonitor.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachmonitor.mapper.TeachPlanMonitorMapper;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachPlanMonitor;
import com.ruoyi.teachmgr.teachmonitor.service.ITeachPlanMonitorService;

/**
 * 计划监控Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-16
 */
@Service
public class TeachPlanMonitorServiceImpl implements ITeachPlanMonitorService 
{
    @Autowired
    private TeachPlanMonitorMapper teachPlanMonitorMapper;

    /**
     * 查询计划监控
     * 
     * @param planMonitorId 计划监控主键
     * @return 计划监控
     */
    @Override
    public TeachPlanMonitor selectTeachPlanMonitorByPlanMonitorId(Long planMonitorId)
    {
        return teachPlanMonitorMapper.selectTeachPlanMonitorByPlanMonitorId(planMonitorId);
    }

    /**
     * 查询计划监控列表
     * 
     * @param teachPlanMonitor 计划监控
     * @return 计划监控
     */
    @Override
    public List<TeachPlanMonitor> selectTeachPlanMonitorList(TeachPlanMonitor teachPlanMonitor)
    {
        return teachPlanMonitorMapper.selectTeachPlanMonitorList(teachPlanMonitor);
    }

    /**
     * 新增计划监控
     * 
     * @param teachPlanMonitor 计划监控
     * @return 结果
     */
    @Override
    public int insertTeachPlanMonitor(TeachPlanMonitor teachPlanMonitor)
    {
        teachPlanMonitor.setCreateTime(DateUtils.getNowDate());
        return teachPlanMonitorMapper.insertTeachPlanMonitor(teachPlanMonitor);
    }

    /**
     * 修改计划监控
     * 
     * @param teachPlanMonitor 计划监控
     * @return 结果
     */
    @Override
    public int updateTeachPlanMonitor(TeachPlanMonitor teachPlanMonitor)
    {
        teachPlanMonitor.setUpdateTime(DateUtils.getNowDate());
        return teachPlanMonitorMapper.updateTeachPlanMonitor(teachPlanMonitor);
    }

    /**
     * 批量删除计划监控
     * 
     * @param planMonitorIds 需要删除的计划监控主键
     * @return 结果
     */
    @Override
    public int deleteTeachPlanMonitorByPlanMonitorIds(Long[] planMonitorIds)
    {
        return teachPlanMonitorMapper.deleteTeachPlanMonitorByPlanMonitorIds(planMonitorIds);
    }

    /**
     * 删除计划监控信息
     * 
     * @param planMonitorId 计划监控主键
     * @return 结果
     */
    @Override
    public int deleteTeachPlanMonitorByPlanMonitorId(Long planMonitorId)
    {
        return teachPlanMonitorMapper.deleteTeachPlanMonitorByPlanMonitorId(planMonitorId);
    }
}
