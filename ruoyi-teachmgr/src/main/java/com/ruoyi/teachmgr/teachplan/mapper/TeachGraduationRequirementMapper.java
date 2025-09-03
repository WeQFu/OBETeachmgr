package com.ruoyi.teachmgr.teachplan.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;

/**
 * 毕业要求Mapper接口
 * 
 * @author jzg
 * @date 2023-06-13
 */
public interface TeachGraduationRequirementMapper 
{
    /**
     * 查询毕业要求
     *
     * @param requirementId 毕业要求主键
     * @return 毕业要求
     */
    public TeachGraduationRequirement selectTeachGraduationRequirementByRequirementId(Long requirementId);

    /**
     * 查询毕业要求列表
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 毕业要求集合
     */
    public List<TeachGraduationRequirement> selectTeachGraduationRequirementList(TeachGraduationRequirement teachGraduationRequirement);

    /**
     * 新增毕业要求
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 结果
     */
    public int insertTeachGraduationRequirement(TeachGraduationRequirement teachGraduationRequirement);

    /**
     * 修改毕业要求
     *
     * @param teachGraduationRequirement 毕业要求
     * @return 结果
     */
    public int updateTeachGraduationRequirement(TeachGraduationRequirement teachGraduationRequirement);

    /**
     * 删除毕业要求
     *
     * @param requirementId 毕业要求主键
     * @return 结果
     */
    public int deleteTeachGraduationRequirementByRequirementId(Long requirementId);

    /**
     * 批量删除毕业要求
     *
     * @param requirementIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachGraduationRequirementByRequirementIds(Long[] requirementIds);

    ////
    /**
     * 是否存在子节点
     *
     * @param requirementId 内容（章节）ID
     * @return 结果
     */
    public int hasChildByTeachGraduationRequirementId(Long requirementId);

}
