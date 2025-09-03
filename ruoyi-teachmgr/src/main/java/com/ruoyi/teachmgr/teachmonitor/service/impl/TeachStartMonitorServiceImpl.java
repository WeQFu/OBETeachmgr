package com.ruoyi.teachmgr.teachmonitor.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachStartMonitorSub;
import com.ruoyi.teachmgr.teachmonitor.mapper.TeachStartMonitorMapper;
import com.ruoyi.teachmgr.teachmonitor.domain.TeachStartMonitor;
import com.ruoyi.teachmgr.teachmonitor.service.ITeachStartMonitorService;

/**
 * 期初教学检查Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-08
 */
@Service
public class TeachStartMonitorServiceImpl implements ITeachStartMonitorService 
{
    @Autowired
    private TeachStartMonitorMapper teachStartMonitorMapper;

    /**
     * 查询期初教学检查
     * 
     * @param startMonitorId 期初教学检查主键
     * @return 期初教学检查
     */
    @Override
    public TeachStartMonitor selectTeachStartMonitorByStartMonitorId(Long startMonitorId)
    {
        return teachStartMonitorMapper.selectTeachStartMonitorByStartMonitorId(startMonitorId);
    }

    /**
     * 查询期初教学检查列表
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 期初教学检查
     */
    @Override
    public List<TeachStartMonitor> selectTeachStartMonitorList(TeachStartMonitor teachStartMonitor)
    {
        return teachStartMonitorMapper.selectTeachStartMonitorList(teachStartMonitor);
    }

    /**
     * 新增期初教学检查
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTeachStartMonitor(TeachStartMonitor teachStartMonitor)
    {
        teachStartMonitor.setCreateTime(DateUtils.getNowDate());
        int rows = teachStartMonitorMapper.insertTeachStartMonitor(teachStartMonitor);
        insertTeachStartMonitorSub(teachStartMonitor);
        return rows;
    }

    /**
     * 修改期初教学检查
     * 
     * @param teachStartMonitor 期初教学检查
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTeachStartMonitor(TeachStartMonitor teachStartMonitor)
    {
        teachStartMonitor.setUpdateTime(DateUtils.getNowDate());
        teachStartMonitorMapper.deleteTeachStartMonitorSubByPidId(teachStartMonitor.getStartMonitorId());
        insertTeachStartMonitorSub(teachStartMonitor);
        return teachStartMonitorMapper.updateTeachStartMonitor(teachStartMonitor);
    }

    /**
     * 批量删除期初教学检查
     * 
     * @param startMonitorIds 需要删除的期初教学检查主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTeachStartMonitorByStartMonitorIds(Long[] startMonitorIds)
    {
        teachStartMonitorMapper.deleteTeachStartMonitorSubByPidIds(startMonitorIds);
        return teachStartMonitorMapper.deleteTeachStartMonitorByStartMonitorIds(startMonitorIds);
    }

    /**
     * 删除期初教学检查信息
     * 
     * @param startMonitorId 期初教学检查主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTeachStartMonitorByStartMonitorId(Long startMonitorId)
    {
        teachStartMonitorMapper.deleteTeachStartMonitorSubByPidId(startMonitorId);
        return teachStartMonitorMapper.deleteTeachStartMonitorByStartMonitorId(startMonitorId);
    }

    /**
     * 新增期初教学检查子信息
     * 
     * @param teachStartMonitor 期初教学检查对象
     */
    public void insertTeachStartMonitorSub(TeachStartMonitor teachStartMonitor)
    {
        List<TeachStartMonitorSub> teachStartMonitorSubList = teachStartMonitor.getTeachStartMonitorSubList();
        Long startMonitorId = teachStartMonitor.getStartMonitorId();
        if (StringUtils.isNotNull(teachStartMonitorSubList))
        {
            List<TeachStartMonitorSub> list = new ArrayList<TeachStartMonitorSub>();
            for (TeachStartMonitorSub teachStartMonitorSub : teachStartMonitorSubList)
            {
                teachStartMonitorSub.setPidId(startMonitorId);
                list.add(teachStartMonitorSub);
            }
            if (list.size() > 0)
            {
                teachStartMonitorMapper.batchTeachStartMonitorSub(list);
            }
        }
    }
}
