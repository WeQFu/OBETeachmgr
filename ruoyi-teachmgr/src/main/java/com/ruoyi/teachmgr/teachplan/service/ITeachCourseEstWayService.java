package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseEstWay;

/**
 * 评价方式Service接口
 * 
 * @author jzg
 * @date 2024-03-05
 */
public interface ITeachCourseEstWayService 
{
    /**
     * 查询评价方式
     * 
     * @param estWayId 评价方式主键
     * @return 评价方式
     */
    public TeachCourseEstWay selectTeachCourseEstWayByEstWayId(Long estWayId);

    /**
     * 查询评价方式列表
     * 
     * @param teachCourseEstWay 评价方式
     * @return 评价方式集合
     */
    public List<TeachCourseEstWay> selectTeachCourseEstWayList(TeachCourseEstWay teachCourseEstWay);

    /**
     * 新增评价方式
     * 
     * @param teachCourseEstWay 评价方式
     * @return 结果
     */
    public int insertTeachCourseEstWay(TeachCourseEstWay teachCourseEstWay);

    /**
     * 修改评价方式
     * 
     * @param teachCourseEstWay 评价方式
     * @return 结果
     */
    public int updateTeachCourseEstWay(TeachCourseEstWay teachCourseEstWay);

    /**
     * 批量删除评价方式
     * 
     * @param estWayIds 需要删除的评价方式主键集合
     * @return 结果
     */
    public int deleteTeachCourseEstWayByEstWayIds(Long[] estWayIds);

    /**
     * 删除评价方式信息
     * 
     * @param estWayId 评价方式主键
     * @return 结果
     */
    public int deleteTeachCourseEstWayByEstWayId(Long estWayId);

    /**
     * 导入用户数据
     *
     * @param teachCourseEstWayList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importData(List<TeachCourseEstWay> teachCourseEstWayList, Boolean isUpdateSupport);

}
