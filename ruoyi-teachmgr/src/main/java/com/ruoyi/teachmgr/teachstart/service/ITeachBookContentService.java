package com.ruoyi.teachmgr.teachstart.service;

import java.util.List;

import com.ruoyi.common.core.domain.TreeSelect;
//import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;

/**
 * 教材章节Service接口
 * 
 * @author jzg
 * @date 2023-05-18
 */
public interface ITeachBookContentService 
{
    /**
     * 查询教材章节
     * 
     * @param bookChapterId 教材章节主键
     * @return 教材章节
     */
    public TeachBookContent selectTeachBookContentByBookChapterId(Long bookChapterId);

    /**
     * 查询教材章节列表
     * 
     * @param teachBookContent 教材章节
     * @return 教材章节集合
     */
    public List<TeachBookContent> selectTeachBookContentList(TeachBookContent teachBookContent);

    /**
     * 新增教材章节
     * 
     * @param teachBookContent 教材章节
     * @return 结果
     */
    public int insertTeachBookContent(TeachBookContent teachBookContent);

    /**
     * 修改教材章节
     * 
     * @param teachBookContent 教材章节
     * @return 结果
     */
    public int updateTeachBookContent(TeachBookContent teachBookContent);

    /**
     * 批量删除教材章节
     * 
     * @param bookChapterIds 需要删除的教材章节主键集合
     * @return 结果
     */
    public int deleteTeachBookContentByBookChapterIds(Long[] bookChapterIds);

    /**
     * 删除教材章节信息
     * 
     * @param bookChapterId 教材章节主键
     * @return 结果
     */
    public int deleteTeachBookContentByBookChapterId(Long bookChapterId);
    ////
    /**
     * 是否存在内容章节的子节点
     *
     * @param bookChapterId 内容ID
     * @return 结果
     */
    public boolean hasChildByBookChapterId(Long bookChapterId);

    /**
     * 查询理论课内容树结构信息
     *
     * @param bookContent 内容信息
     * @return 内容树信息集合
     */
    public List<TreeSelect> selectBookChapterTreeList(TeachBookContent bookContent);

    /**
     * 构建前端所需要树结构
     *
     * @param bookContents 内容列表
     * @return 树结构列表
     */
    public List<TeachBookContent> buildBookChapterTree(List<TeachBookContent> bookContents);

    /**
     * 构建前端所需要下拉树结构
     *
     * @param bookContents 内容列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildBookChapterTreeSelect(List<TeachBookContent> bookContents);

}
