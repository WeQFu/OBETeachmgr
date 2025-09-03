package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachPracticePlan;

/**
 * 实践环节Service接口
 * 
 * @author jzg
 * @date 2023-06-13
 */
public interface ITeachPracticePlanService 
{
    /**
     * 查询实践环节
     * 
     * @param practicePlanId 实践环节主键
     * @return 实践环节
     */
    public TeachPracticePlan selectTeachPracticePlanByPracticePlanId(Long practicePlanId);

    /**
     * 查询实践环节列表
     * 
     * @param teachPracticePlan 实践环节
     * @return 实践环节集合
     */
    public List<TeachPracticePlan> selectTeachPracticePlanList(TeachPracticePlan teachPracticePlan);

    /**
     * 新增实践环节
     * 
     * @param teachPracticePlan 实践环节
     * @return 结果
     */
    public int insertTeachPracticePlan(TeachPracticePlan teachPracticePlan);

    /**
     * 修改实践环节
     * 
     * @param teachPracticePlan 实践环节
     * @return 结果
     */
    public int updateTeachPracticePlan(TeachPracticePlan teachPracticePlan);

    /**
     * 批量删除实践环节
     * 
     * @param practicePlanIds 需要删除的实践环节主键集合
     * @return 结果
     */
    public int deleteTeachPracticePlanByPracticePlanIds(Long[] practicePlanIds);

    /**
     * 删除实践环节信息
     * 
     * @param practicePlanId 实践环节主键
     * @return 结果
     */
    public int deleteTeachPracticePlanByPracticePlanId(Long practicePlanId);
}
