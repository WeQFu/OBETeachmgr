package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;

/**
 * 毕业要求Service接口
 * 
 * @author jzg
 * @date 2023-06-13
 */
public interface ITeachGraduationRequirementService 
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
     * 批量删除毕业要求
     *
     * @param requirementIds 需要删除的毕业要求主键集合
     * @return 结果
     */
    public int deleteTeachGraduationRequirementByRequirementIds(Long[] requirementIds);

    /**
     * 删除毕业要求信息
     *
     * @param requirementId 毕业要求主键
     * @return 结果
     */
    public int deleteTeachGraduationRequirementByRequirementId(Long requirementId);

    ////
    /**
     * 是否存在内容章节的子节点
     *
     * @param requirementId 内容ID
     * @return 结果
     */
    public boolean hasChildByRequirementId(Long requirementId);

    /**
     * 查询理论课内容树结构信息
     *
     * @param bookContent 内容信息
     * @return 内容树信息集合
     */
    public List<TreeSelect> selectTeachGraduationRequirementTreeList(TeachGraduationRequirement bookContent);

    /**
     * 构建前端所需要树结构
     *
     * @param bookContents 内容列表
     * @return 树结构列表
     */
    public List<TeachGraduationRequirement> buildTeachGraduationRequirementTree(List<TeachGraduationRequirement> bookContents);

    /**
     * 构建前端所需要下拉树结构
     *
     * @param bookContents 内容列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildTeachGraduationRequirementTreeSelect(List<TeachGraduationRequirement> bookContents);

}
