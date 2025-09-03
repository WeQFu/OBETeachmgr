package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachPracticePlanMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachPracticePlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachPracticePlanService;

/**
 * 实践环节Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-13
 */
@Service
public class TeachPracticePlanServiceImpl implements ITeachPracticePlanService 
{
    @Autowired
    private TeachPracticePlanMapper teachPracticePlanMapper;

    /**
     * 查询实践环节
     * 
     * @param practicePlanId 实践环节主键
     * @return 实践环节
     */
    @Override
    public TeachPracticePlan selectTeachPracticePlanByPracticePlanId(Long practicePlanId)
    {
        return teachPracticePlanMapper.selectTeachPracticePlanByPracticePlanId(practicePlanId);
    }

    /**
     * 查询实践环节列表
     * 
     * @param teachPracticePlan 实践环节
     * @return 实践环节
     */
    @Override
    public List<TeachPracticePlan> selectTeachPracticePlanList(TeachPracticePlan teachPracticePlan)
    {
        //不清楚原因，没有这条冗余语句，返回结果不全
        List<TeachPracticePlan> teachPracticePlanList=teachPracticePlanMapper.selectTeachPracticePlanList(teachPracticePlan);
//        for(TeachPracticePlan plan:teachPracticePlanList){
//            System.out.println(plan.getCourseName()+"--"+plan.getPracticeName());

//        }
        return teachPracticePlanMapper.selectTeachPracticePlanList(teachPracticePlan);
    }

    /**
     * 新增实践环节
     * 
     * @param teachPracticePlan 实践环节
     * @return 结果
     */
    @Override
    public int insertTeachPracticePlan(TeachPracticePlan teachPracticePlan)
    {
        teachPracticePlan.setCreateTime(DateUtils.getNowDate());
        return teachPracticePlanMapper.insertTeachPracticePlan(teachPracticePlan);
    }

    /**
     * 修改实践环节
     * 
     * @param teachPracticePlan 实践环节
     * @return 结果
     */
    @Override
    public int updateTeachPracticePlan(TeachPracticePlan teachPracticePlan)
    {
        teachPracticePlan.setUpdateTime(DateUtils.getNowDate());
        return teachPracticePlanMapper.updateTeachPracticePlan(teachPracticePlan);
    }

    /**
     * 批量删除实践环节
     * 
     * @param practicePlanIds 需要删除的实践环节主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticePlanByPracticePlanIds(Long[] practicePlanIds)
    {
        return teachPracticePlanMapper.deleteTeachPracticePlanByPracticePlanIds(practicePlanIds);
    }

    /**
     * 删除实践环节信息
     * 
     * @param practicePlanId 实践环节主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticePlanByPracticePlanId(Long practicePlanId)
    {
        return teachPracticePlanMapper.deleteTeachPracticePlanByPracticePlanId(practicePlanId);
    }
}
