package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachPlan;

/**
 * 教学计划Service接口
 * 
 * @author jzg
 * @date 2023-05-12
 */
public interface ITeachPlanService 
{
    /**
     * 查询教学计划
     * 
     * @param planId 教学计划主键
     * @return 教学计划
     */
    public TeachPlan selectTeachPlanByPlanId(Long planId);

    /**
     * 查询教学计划列表
     * 
     * @param teachPlan 教学计划
     * @return 教学计划集合
     */
    public List<TeachPlan> selectTeachPlanList(TeachPlan teachPlan);

    /**
     * 新增教学计划
     * 
     * @param teachPlan 教学计划
     * @return 结果
     */
    public int insertTeachPlan(TeachPlan teachPlan);

    /**
     * 修改教学计划
     * 
     * @param teachPlan 教学计划
     * @return 结果
     */
    public int updateTeachPlan(TeachPlan teachPlan);

    /**
     * 批量删除教学计划
     * 
     * @param planIds 需要删除的教学计划主键集合
     * @return 结果
     */
    public int deleteTeachPlanByPlanIds(Long[] planIds);

    /**
     * 删除教学计划信息
     * 
     * @param planId 教学计划主键
     * @return 结果
     */
    public int deleteTeachPlanByPlanId(Long planId);
}
