package com.ruoyi.teachmgr.teachmonitor.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachExamMonitor;

/**
 * 考试监控Mapper接口
 * 
 * @author jzg
 * @date 2023-05-16
 */
public interface TeachExamMonitorMapper 
{
    /**
     * 查询考试监控
     * 
     * @param examMonitorId 考试监控主键
     * @return 考试监控
     */
    public TeachExamMonitor selectTeachExamMonitorByExamMonitorId(Long examMonitorId);

    /**
     * 查询考试监控列表
     * 
     * @param teachExamMonitor 考试监控
     * @return 考试监控集合
     */
    public List<TeachExamMonitor> selectTeachExamMonitorList(TeachExamMonitor teachExamMonitor);

    /**
     * 新增考试监控
     * 
     * @param teachExamMonitor 考试监控
     * @return 结果
     */
    public int insertTeachExamMonitor(TeachExamMonitor teachExamMonitor);

    /**
     * 修改考试监控
     * 
     * @param teachExamMonitor 考试监控
     * @return 结果
     */
    public int updateTeachExamMonitor(TeachExamMonitor teachExamMonitor);

    /**
     * 删除考试监控
     * 
     * @param examMonitorId 考试监控主键
     * @return 结果
     */
    public int deleteTeachExamMonitorByExamMonitorId(Long examMonitorId);

    /**
     * 批量删除考试监控
     * 
     * @param examMonitorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachExamMonitorByExamMonitorIds(Long[] examMonitorIds);
}
