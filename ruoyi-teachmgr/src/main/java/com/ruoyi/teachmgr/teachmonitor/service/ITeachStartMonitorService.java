package com.ruoyi.teachmgr.teachmonitor.service;

import java.util.List;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachStartMonitor;

/**
 * 期初教学检查Service接口
 * 
 * @author jzg
 * @date 2023-06-08
 */
public interface ITeachStartMonitorService 
{
    /**
     * 查询期初教学检查
     * 
     * @param startMonitorId 期初教学检查主键
     * @return 期初教学检查
     */
    public TeachStartMonitor selectTeachStartMonitorByStartMonitorId(Long startMonitorId);

    /**
     * 查询期初教学检查列表
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 期初教学检查集合
     */
    public List<TeachStartMonitor> selectTeachStartMonitorList(TeachStartMonitor teachStartMonitor);

    /**
     * 新增期初教学检查
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 结果
     */
    public int insertTeachStartMonitor(TeachStartMonitor teachStartMonitor);

    /**
     * 修改期初教学检查
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 结果
     */
    public int updateTeachStartMonitor(TeachStartMonitor teachStartMonitor);

    /**
     * 批量删除期初教学检查
     * 
     * @param startMonitorIds 需要删除的期初教学检查主键集合
     * @return 结果
     */
    public int deleteTeachStartMonitorByStartMonitorIds(Long[] startMonitorIds);

    /**
     * 删除期初教学检查信息
     * 
     * @param startMonitorId 期初教学检查主键
     * @return 结果
     */
    public int deleteTeachStartMonitorByStartMonitorId(Long startMonitorId);
}
