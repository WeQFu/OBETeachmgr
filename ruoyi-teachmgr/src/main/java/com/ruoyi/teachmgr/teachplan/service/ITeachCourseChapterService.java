package com.ruoyi.teachmgr.teachplan.service;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapter;

/**
 * 章节内容Service接口
 * 
 * @author jzg
 * @date 2023-05-12
 */
public interface ITeachCourseChapterService 
{
    /**
     * 查询章节内容
     * 
     * @param courseChapterId 章节内容主键
     * @return 章节内容
     */
    public TeachCourseChapter selectTeachCourseChapterByCourseChapterId(Long courseChapterId);

    /**
     * 查询章节内容列表
     * 
     * @param teachCourseChapter 章节内容
     * @return 章节内容集合
     */
    public List<TeachCourseChapter> selectTeachCourseChapterList(TeachCourseChapter teachCourseChapter);

    /**
     * 新增章节内容
     * 
     * @param teachCourseChapter 章节内容
     * @return 结果
     */
    public int insertTeachCourseChapter(TeachCourseChapter teachCourseChapter);

    /**
     * 修改章节内容
     * 
     * @param teachCourseChapter 章节内容
     * @return 结果
     */
    public int updateTeachCourseChapter(TeachCourseChapter teachCourseChapter);

    /**
     * 批量删除章节内容
     * 
     * @param courseChapterIds 需要删除的章节内容主键集合
     * @return 结果
     */
    public int deleteTeachCourseChapterByCourseChapterIds(Long[] courseChapterIds);

    /**
     * 删除章节内容信息
     * 
     * @param courseChapterId 章节内容主键
     * @return 结果
     */
    public int deleteTeachCourseChapterByCourseChapterId(Long courseChapterId);
}
