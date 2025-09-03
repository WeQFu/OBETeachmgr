package com.ruoyi.teachmgr.teachstart.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachTraintarget;

/**
 * 培养目标Mapper接口
 * 
 * @author jzg
 * @date 2024-03-03
 */
public interface TeachTraintargetMapper 
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
     * 删除培养目标
     * 
     * @param coursetargetId 培养目标主键
     * @return 结果
     */
    public int deleteTeachTraintargetByCoursetargetId(Long coursetargetId);

    /**
     * 批量删除培养目标
     * 
     * @param coursetargetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachTraintargetByCoursetargetIds(Long[] coursetargetIds);
}
