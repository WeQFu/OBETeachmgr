package com.ruoyi.teachmgr.teachstart.service;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachTraintarget;

/**
 * 培养目标Service接口
 * 
 * @author jzg
 * @date 2024-03-03
 */
public interface ITeachTraintargetService 
{
    /**
     * 查询培养目标
     * 
     * @param coursetargetId 培养目标主键
     * @return 培养目标
     */
    public TeachTraintarget selectTeachTraintargetByCoursetargetId(Long coursetargetId);

    /**
     * 查询培养目标列表
     * 
     * @param teachTraintarget 培养目标
     * @return 培养目标集合
     */
    public List<TeachTraintarget> selectTeachTraintargetList(TeachTraintarget teachTraintarget);

    /**
     * 新增培养目标
     * 
     * @param teachTraintarget 培养目标
     * @return 结果
     */
    public int insertTeachTraintarget(TeachTraintarget teachTraintarget);

    /**
     * 修改培养目标
     * 
     * @param teachTraintarget 培养目标
     * @return 结果
     */
    public int updateTeachTraintarget(TeachTraintarget teachTraintarget);

    /**
     * 批量删除培养目标
     * 
     * @param coursetargetIds 需要删除的培养目标主键集合
     * @return 结果
     */
    public int deleteTeachTraintargetByCoursetargetIds(Long[] coursetargetIds);

    /**
     * 删除培养目标信息
     * 
     * @param coursetargetId 培养目标主键
     * @return 结果
     */
    public int deleteTeachTraintargetByCoursetargetId(Long coursetargetId);

    /**
     * 导入用户数据
     *
     * @param teachTraintargetList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importData(List<TeachTraintarget> teachTraintargetList, Boolean isUpdateSupport);

}
