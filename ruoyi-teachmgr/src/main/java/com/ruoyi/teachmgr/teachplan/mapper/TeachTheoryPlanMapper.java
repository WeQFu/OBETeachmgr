package com.ruoyi.teachmgr.teachplan.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachTheoryPlan;

/**
 * 理论计划Mapper接口
 * 
 * @author jzg
 * @date 2023-09-09
 */
public interface TeachTheoryPlanMapper 
{
    /**
     * 查询理论计划
     * 
     * @param theoryPlanId 理论计划主键
     * @return 理论计划
     */
    public TeachTheoryPlan selectTeachTheoryPlanByTheoryPlanId(Long theoryPlanId);

    /**
     * 查询理论计划列表
     * 
     * @param teachTheoryPlan 理论计划
     * @return 理论计划集合
     */
    public List<TeachTheoryPlan> selectTeachTheoryPlanList(TeachTheoryPlan teachTheoryPlan);

    /**
     * 新增理论计划
     * 
     * @param teachTheoryPlan 理论计划
     * @return 结果
     */
    public int insertTeachTheoryPlan(TeachTheoryPlan teachTheoryPlan);

    /**
     * 修改理论计划
     * 
     * @param teachTheoryPlan 理论计划
     * @return 结果
     */
    public int updateTeachTheoryPlan(TeachTheoryPlan teachTheoryPlan);

    /**
     * 删除理论计划
     * 
     * @param theoryPlanId 理论计划主键
     * @return 结果
     */
    public int deleteTeachTheoryPlanByTheoryPlanId(Long theoryPlanId);

    /**
     * 批量删除理论计划
     * 
     * @param theoryPlanIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachTheoryPlanByTheoryPlanIds(Long[] theoryPlanIds);
}
