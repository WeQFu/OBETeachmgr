package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapterSub;
import com.ruoyi.teachmgr.teachplan.mapper.TeachCourseChapterMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapter;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseChapterService;

/**
 * 章节内容Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-12
 */
@Service
public class TeachCourseChapterServiceImpl implements ITeachCourseChapterService 
{
    @Autowired
    private TeachCourseChapterMapper teachCourseChapterMapper;

    /**
     * 查询章节内容
     * 
     * @param courseChapterId 章节内容主键
     * @return 章节内容
     */
    @Override
    public TeachCourseChapter selectTeachCourseChapterByCourseChapterId(Long courseChapterId)
    {
        return teachCourseChapterMapper.selectTeachCourseChapterByCourseChapterId(courseChapterId);
    }

    /**
     * 查询章节内容列表
     * 
     * @param teachCourseChapter 章节内容
     * @return 章节内容
     */
    @Override
    public List<TeachCourseChapter> selectTeachCourseChapterList(TeachCourseChapter teachCourseChapter)
    {
        return teachCourseChapterMapper.selectTeachCourseChapterList(teachCourseChapter);
    }

    /**
     * 新增章节内容
     * 
     * @param teachCourseChapter 章节内容
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTeachCourseChapter(TeachCourseChapter teachCourseChapter)
    {
        teachCourseChapter.setCreateTime(DateUtils.getNowDate());
        int rows = teachCourseChapterMapper.insertTeachCourseChapter(teachCourseChapter);
        insertTeachCourseChapterSub(teachCourseChapter);
        return rows;
    }

    /**
     * 修改章节内容
     * 
     * @param teachCourseChapter 章节内容
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTeachCourseChapter(TeachCourseChapter teachCourseChapter)
    {
        teachCourseChapter.setUpdateTime(DateUtils.getNowDate());
        teachCourseChapterMapper.deleteTeachCourseChapterSubByChapterId(teachCourseChapter.getCourseChapterId());
        insertTeachCourseChapterSub(teachCourseChapter);
        return teachCourseChapterMapper.updateTeachCourseChapter(teachCourseChapter);
    }

    /**
     * 批量删除章节内容
     * 
     * @param courseChapterIds 需要删除的章节内容主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTeachCourseChapterByCourseChapterIds(Long[] courseChapterIds)
    {
        teachCourseChapterMapper.deleteTeachCourseChapterSubByChapterIds(courseChapterIds);
        return teachCourseChapterMapper.deleteTeachCourseChapterByCourseChapterIds(courseChapterIds);
    }

    /**
     * 删除章节内容信息
     * 
     * @param courseChapterId 章节内容主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTeachCourseChapterByCourseChapterId(Long courseChapterId)
    {
        teachCourseChapterMapper.deleteTeachCourseChapterSubByChapterId(courseChapterId);
        return teachCourseChapterMapper.deleteTeachCourseChapterByCourseChapterId(courseChapterId);
    }

    /**
     * 新增章节内容信息
     * 
     * @param teachCourseChapter 章节内容对象
     */
    public void insertTeachCourseChapterSub(TeachCourseChapter teachCourseChapter)
    {
        List<TeachCourseChapterSub> teachCourseChapterSubList = teachCourseChapter.getTeachCourseChapterSubList();
        Long courseChapterId = teachCourseChapter.getCourseChapterId();
        if (StringUtils.isNotNull(teachCourseChapterSubList))
        {
            List<TeachCourseChapterSub> list = new ArrayList<TeachCourseChapterSub>();
            for (TeachCourseChapterSub teachCourseChapterSub : teachCourseChapterSubList)
            {
                teachCourseChapterSub.setChapterId(courseChapterId);
                list.add(teachCourseChapterSub);
            }
            if (list.size() > 0)
            {
                teachCourseChapterMapper.batchTeachCourseChapterSub(list);
            }
        }
    }
}
