package com.ruoyi.teachmgr.teachmonitor.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachmonitor.mapper.TeachExamMonitorMapper;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachExamMonitor;
import com.ruoyi.teachmgr.teachmonitor.service.ITeachExamMonitorService;

/**
 * 考试监控Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-16
 */
@Service
public class TeachExamMonitorServiceImpl implements ITeachExamMonitorService 
{
    @Autowired
    private TeachExamMonitorMapper teachExamMonitorMapper;

    /**
     * 查询考试监控
     * 
     * @param examMonitorId 考试监控主键
     * @return 考试监控
     */
    @Override
    public TeachExamMonitor selectTeachExamMonitorByExamMonitorId(Long examMonitorId)
    {
        return teachExamMonitorMapper.selectTeachExamMonitorByExamMonitorId(examMonitorId);
    }

    /**
     * 查询考试监控列表
     * 
     * @param teachExamMonitor 考试监控
     * @return 考试监控
     */
    @Override
    public List<TeachExamMonitor> selectTeachExamMonitorList(TeachExamMonitor teachExamMonitor)
    {
        return teachExamMonitorMapper.selectTeachExamMonitorList(teachExamMonitor);
    }

    /**
     * 新增考试监控
     * 
     * @param teachExamMonitor 考试监控
     * @return 结果
     */
    @Override
    public int insertTeachExamMonitor(TeachExamMonitor teachExamMonitor)
    {
        teachExamMonitor.setCreateTime(DateUtils.getNowDate());
        return teachExamMonitorMapper.insertTeachExamMonitor(teachExamMonitor);
    }

    /**
     * 修改考试监控
     * 
     * @param teachExamMonitor 考试监控
     * @return 结果
     */
    @Override
    public int updateTeachExamMonitor(TeachExamMonitor teachExamMonitor)
    {
        teachExamMonitor.setUpdateTime(DateUtils.getNowDate());
        return teachExamMonitorMapper.updateTeachExamMonitor(teachExamMonitor);
    }

    /**
     * 批量删除考试监控
     * 
     * @param examMonitorIds 需要删除的考试监控主键
     * @return 结果
     */
    @Override
    public int deleteTeachExamMonitorByExamMonitorIds(Long[] examMonitorIds)
    {
        return teachExamMonitorMapper.deleteTeachExamMonitorByExamMonitorIds(examMonitorIds);
    }

    /**
     * 删除考试监控信息
     * 
     * @param examMonitorId 考试监控主键
     * @return 结果
     */
    @Override
    public int deleteTeachExamMonitorByExamMonitorId(Long examMonitorId)
    {
        return teachExamMonitorMapper.deleteTeachExamMonitorByExamMonitorId(examMonitorId);
    }
}
