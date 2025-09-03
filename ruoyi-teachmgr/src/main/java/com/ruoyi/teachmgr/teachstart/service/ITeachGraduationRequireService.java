package com.ruoyi.teachmgr.teachstart.service;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachGraduationRequire;

/**
 * 毕业要求Service接口
 * 
 * @author jzg
 * @date 2024-03-03
 */
public interface ITeachGraduationRequireService 
{
    /**
     * 查询毕业要求
     * 
     * @param graduRequireId 毕业要求主键
     * @return 毕业要求
     */
    public TeachGraduationRequire selectTeachGraduationRequireByGraduRequireId(Long graduRequireId);

    /**
     * 查询毕业要求列表
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 毕业要求集合
     */
    public List<TeachGraduationRequire> selectTeachGraduationRequireList(TeachGraduationRequire teachGraduationRequire);

    /**
     * 新增毕业要求
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 结果
     */
    public int insertTeachGraduationRequire(TeachGraduationRequire teachGraduationRequire);

    /**
     * 修改毕业要求
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 结果
     */
    public int updateTeachGraduationRequire(TeachGraduationRequire teachGraduationRequire);

    /**
     * 批量删除毕业要求
     * 
     * @param graduRequireIds 需要删除的毕业要求主键集合
     * @return 结果
     */
    public int deleteTeachGraduationRequireByGraduRequireIds(Long[] graduRequireIds);

    /**
     * 删除毕业要求信息
     * 
     * @param graduRequireId 毕业要求主键
     * @return 结果
     */
    public int deleteTeachGraduationRequireByGraduRequireId(Long graduRequireId);
}
