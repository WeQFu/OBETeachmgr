package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachPlanMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachPlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachPlanService;

/**
 * 教学计划Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-12
 */
@Service
public class TeachPlanServiceImpl implements ITeachPlanService 
{
    @Autowired
    private TeachPlanMapper teachPlanMapper;

    /**
     * 查询教学计划
     * 
     * @param planId 教学计划主键
     * @return 教学计划
     */
    @Override
    public TeachPlan selectTeachPlanByPlanId(Long planId)
    {
        return teachPlanMapper.selectTeachPlanByPlanId(planId);
    }

    /**
     * 查询教学计划列表
     * 
     * @param teachPlan 教学计划
     * @return 教学计划
     */
    @Override
    public List<TeachPlan> selectTeachPlanList(TeachPlan teachPlan)
    {
        return teachPlanMapper.selectTeachPlanList(teachPlan);
    }

    /**
     * 新增教学计划
     * 
     * @param teachPlan 教学计划
     * @return 结果
     */
    @Override
    public int insertTeachPlan(TeachPlan teachPlan)
    {
        teachPlan.setCreateTime(DateUtils.getNowDate());
        return teachPlanMapper.insertTeachPlan(teachPlan);
    }

    /**
     * 修改教学计划
     * 
     * @param teachPlan 教学计划
     * @return 结果
     */
    @Override
    public int updateTeachPlan(TeachPlan teachPlan)
    {
        teachPlan.setUpdateTime(DateUtils.getNowDate());
        return teachPlanMapper.updateTeachPlan(teachPlan);
    }

    /**
     * 批量删除教学计划
     * 
     * @param planIds 需要删除的教学计划主键
     * @return 结果
     */
    @Override
    public int deleteTeachPlanByPlanIds(Long[] planIds)
    {
        return teachPlanMapper.deleteTeachPlanByPlanIds(planIds);
    }

    /**
     * 删除教学计划信息
     * 
     * @param planId 教学计划主键
     * @return 结果
     */
    @Override
    public int deleteTeachPlanByPlanId(Long planId)
    {
        return teachPlanMapper.deleteTeachPlanByPlanId(planId);
    }
}
