package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachOutline;
import com.ruoyi.teachmgr.teachplan.domain.vo.TeachOutlineVo;

/**
 * 课程大纲Service接口
 * 
 * @author jzg
 * @date 2023-05-12
 */
public interface ITeachOutlineService 
{
    /**
     * 查询课程大纲
     * 
     * @param outlineId 课程大纲主键
     * @return 课程大纲
     */
    public TeachOutline selectTeachOutlineByOutlineId(Long outlineId);

    /**
     * 查询课程大纲列表
     * 
     * @param teachOutline 课程大纲
     * @return 课程大纲集合
     */
    public List<TeachOutline> selectTeachOutlineList(TeachOutline teachOutline);

    /**
     * 新增课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    public int insertTeachOutline(TeachOutline teachOutline);

    /**
     * 修改课程大纲
     * 
     * @param teachOutline 课程大纲
     * @return 结果
     */
    public int updateTeachOutline(TeachOutline teachOutline);

    /**
     * 批量删除课程大纲
     * 
     * @param outlineIds 需要删除的课程大纲主键集合
     * @return 结果
     */
    public int deleteTeachOutlineByOutlineIds(Long[] outlineIds);

    /**
     * 删除课程大纲信息
     * 
     * @param outlineId 课程大纲主键
     * @return 结果
     */
    public int deleteTeachOutlineByOutlineId(Long outlineId);

    //
    /**
     * 根据ID数组查询仪器校准方案列表
     * @param ids 仪器设备检校方案主键集合
     * @return 仪器设备校准方案集合
     */
//    public List<TeachOutlineVo> selectTeachOutlineByIds(Long[] ids);

}
