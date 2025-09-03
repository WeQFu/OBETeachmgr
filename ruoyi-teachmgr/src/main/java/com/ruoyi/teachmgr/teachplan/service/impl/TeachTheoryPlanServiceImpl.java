package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachTheoryPlanMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachTheoryPlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachTheoryPlanService;

/**
 * 理论计划Service业务层处理
 * 
 * @author jzg
 * @date 2023-09-09
 */
@Service
public class TeachTheoryPlanServiceImpl implements ITeachTheoryPlanService 
{
    @Autowired
    private TeachTheoryPlanMapper teachTheoryPlanMapper;

    /**
     * 查询理论计划
     * 
     * @param theoryPlanId 理论计划主键
     * @return 理论计划
     */
    @Override
    public TeachTheoryPlan selectTeachTheoryPlanByTheoryPlanId(Long theoryPlanId)
    {
        return teachTheoryPlanMapper.selectTeachTheoryPlanByTheoryPlanId(theoryPlanId);
    }

    /**
     * 查询理论计划列表
     * 
     * @param teachTheoryPlan 理论计划
     * @return 理论计划
     */
    @Override
    public List<TeachTheoryPlan> selectTeachTheoryPlanList(TeachTheoryPlan teachTheoryPlan)
    {
        return teachTheoryPlanMapper.selectTeachTheoryPlanList(teachTheoryPlan);
    }

    /**
     * 新增理论计划
     * 
     * @param teachTheoryPlan 理论计划
     * @return 结果
     */
    @Override
    public int insertTeachTheoryPlan(TeachTheoryPlan teachTheoryPlan)
    {
        teachTheoryPlan.setCreateTime(DateUtils.getNowDate());
        return teachTheoryPlanMapper.insertTeachTheoryPlan(teachTheoryPlan);
    }

    /**
     * 修改理论计划
     * 
     * @param teachTheoryPlan 理论计划
     * @return 结果
     */
    @Override
    public int updateTeachTheoryPlan(TeachTheoryPlan teachTheoryPlan)
    {
        teachTheoryPlan.setUpdateTime(DateUtils.getNowDate());
        return teachTheoryPlanMapper.updateTeachTheoryPlan(teachTheoryPlan);
    }

    /**
     * 批量删除理论计划
     * 
     * @param theoryPlanIds 需要删除的理论计划主键
     * @return 结果
     */
    @Override
    public int deleteTeachTheoryPlanByTheoryPlanIds(Long[] theoryPlanIds)
    {
        return teachTheoryPlanMapper.deleteTeachTheoryPlanByTheoryPlanIds(theoryPlanIds);
    }

    /**
     * 删除理论计划信息
     * 
     * @param theoryPlanId 理论计划主键
     * @return 结果
     */
    @Override
    public int deleteTeachTheoryPlanByTheoryPlanId(Long theoryPlanId)
    {
        return teachTheoryPlanMapper.deleteTeachTheoryPlanByTheoryPlanId(theoryPlanId);
    }
}
