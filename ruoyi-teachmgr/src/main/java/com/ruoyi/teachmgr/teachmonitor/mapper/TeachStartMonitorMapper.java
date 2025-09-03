package com.ruoyi.teachmgr.teachmonitor.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachStartMonitor;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachStartMonitorSub;

/**
 * 期初教学检查Mapper接口
 * 
 * @author jzg
 * @date 2023-06-08
 */
public interface TeachStartMonitorMapper 
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
     * 删除期初教学检查
     * 
     * @param startMonitorId 期初教学检查主键
     * @return 结果
     */
    public int deleteTeachStartMonitorByStartMonitorId(Long startMonitorId);

    /**
     * 批量删除期初教学检查
     * 
     * @param startMonitorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachStartMonitorByStartMonitorIds(Long[] startMonitorIds);

    /**
     * 批量删除期初教学检查子
     * 
     * @param startMonitorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachStartMonitorSubByPidIds(Long[] startMonitorIds);
    
    /**
     * 批量新增期初教学检查子
     * 
     * @param teachStartMonitorSubList 期初教学检查子列表
     * @return 结果
     */
    public int batchTeachStartMonitorSub(List<TeachStartMonitorSub> teachStartMonitorSubList);
    

    /**
     * 通过期初教学检查主键删除期初教学检查子信息
     * 
     * @param startMonitorId 期初教学检查ID
     * @return 结果
     */
    public int deleteTeachStartMonitorSubByPidId(Long startMonitorId);
}
