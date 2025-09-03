package com.ruoyi.teachmgr.teachmonitor.service;

import java.util.List;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachExamMonitor;

/**
 * 考试监控Service接口
 * 
 * @author jzg
 * @date 2023-05-16
 */
public interface ITeachExamMonitorService 
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
     * 批量删除考试监控
     * 
     * @param examMonitorIds 需要删除的考试监控主键集合
     * @return 结果
     */
    public int deleteTeachExamMonitorByExamMonitorIds(Long[] examMonitorIds);

    /**
     * 删除考试监控信息
     * 
     * @param examMonitorId 考试监控主键
     * @return 结果
     */
    public int deleteTeachExamMonitorByExamMonitorId(Long examMonitorId);
}
