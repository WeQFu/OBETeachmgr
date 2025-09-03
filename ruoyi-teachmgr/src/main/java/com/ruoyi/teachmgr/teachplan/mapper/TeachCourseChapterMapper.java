package com.ruoyi.teachmgr.teachplan.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapter;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapterSub;

/**
 * 章节内容Mapper接口
 * 
 * @author jzg
 * @date 2023-05-12
 */
public interface TeachCourseChapterMapper 
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
     * 删除章节内容
     * 
     * @param courseChapterId 章节内容主键
     * @return 结果
     */
    public int deleteTeachCourseChapterByCourseChapterId(Long courseChapterId);

    /**
     * 批量删除章节内容
     * 
     * @param courseChapterIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachCourseChapterByCourseChapterIds(Long[] courseChapterIds);

    /**
     * 批量删除章节内容
     * 
     * @param courseChapterIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachCourseChapterSubByChapterIds(Long[] courseChapterIds);
    
    /**
     * 批量新增章节内容
     * 
     * @param teachCourseChapterSubList 章节内容列表
     * @return 结果
     */
    public int batchTeachCourseChapterSub(List<TeachCourseChapterSub> teachCourseChapterSubList);
    

    /**
     * 通过章节内容主键删除章节内容信息
     * 
     * @param courseChapterId 章节内容ID
     * @return 结果
     */
    public int deleteTeachCourseChapterSubByChapterId(Long courseChapterId);
}
