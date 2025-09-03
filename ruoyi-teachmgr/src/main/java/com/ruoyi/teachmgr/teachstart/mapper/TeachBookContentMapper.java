package com.ruoyi.teachmgr.teachstart.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;

/**
 * 教材章节Mapper接口
 * 
 * @author jzg
 * @date 2023-05-18
 */
public interface TeachBookContentMapper 
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
     * 删除教材章节
     * 
     * @param bookChapterId 教材章节主键
     * @return 结果
     */
    public int deleteTeachBookContentByBookChapterId(Long bookChapterId);

    /**
     * 批量删除教材章节
     * 
     * @param bookChapterIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachBookContentByBookChapterIds(Long[] bookChapterIds);
///
    /**
     * 是否存在子节点
     *
     * @param bookChapterId 内容（章节）ID
     * @return 结果
     */
    public int hasChildByBookChapterId(Long bookChapterId);
}
