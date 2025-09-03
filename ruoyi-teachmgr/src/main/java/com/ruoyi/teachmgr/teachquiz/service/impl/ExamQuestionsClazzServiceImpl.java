package com.ruoyi.teachmgr.teachquiz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachquiz.mapper.ExamQuestionsClazzMapper;
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestionsClazz;
import com.ruoyi.teachmgr.teachquiz.service.IExamQuestionsClazzService;

/**
 * 题库分类Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-15
 */
@Service
public class ExamQuestionsClazzServiceImpl implements IExamQuestionsClazzService 
{
    @Autowired
    private ExamQuestionsClazzMapper examQuestionsClazzMapper;

    /**
     * 查询题库分类
     * 
     * @param questionsClazzId 题库分类主键
     * @return 题库分类
     */
    @Override
    public ExamQuestionsClazz selectExamQuestionsClazzByQuestionsClazzId(Long questionsClazzId)
    {
        return examQuestionsClazzMapper.selectExamQuestionsClazzByQuestionsClazzId(questionsClazzId);
    }

    /**
     * 查询题库分类列表
     * 
     * @param examQuestionsClazz 题库分类
     * @return 题库分类
     */
    @Override
    public List<ExamQuestionsClazz> selectExamQuestionsClazzList(ExamQuestionsClazz examQuestionsClazz)
    {
        return examQuestionsClazzMapper.selectExamQuestionsClazzList(examQuestionsClazz);
    }

    /**
     * 新增题库分类
     * 
     * @param examQuestionsClazz 题库分类
     * @return 结果
     */
    @Override
    public int insertExamQuestionsClazz(ExamQuestionsClazz examQuestionsClazz)
    {
        examQuestionsClazz.setCreateTime(DateUtils.getNowDate());
        return examQuestionsClazzMapper.insertExamQuestionsClazz(examQuestionsClazz);
    }

    /**
     * 修改题库分类
     * 
     * @param examQuestionsClazz 题库分类
     * @return 结果
     */
    @Override
    public int updateExamQuestionsClazz(ExamQuestionsClazz examQuestionsClazz)
    {
        examQuestionsClazz.setUpdateTime(DateUtils.getNowDate());
        return examQuestionsClazzMapper.updateExamQuestionsClazz(examQuestionsClazz);
    }

    /**
     * 批量删除题库分类
     * 
     * @param questionsClazzIds 需要删除的题库分类主键
     * @return 结果
     */
    @Override
    public int deleteExamQuestionsClazzByQuestionsClazzIds(Long[] questionsClazzIds)
    {
        return examQuestionsClazzMapper.deleteExamQuestionsClazzByQuestionsClazzIds(questionsClazzIds);
    }

    /**
     * 删除题库分类信息
     * 
     * @param questionsClazzId 题库分类主键
     * @return 结果
     */
    @Override
    public int deleteExamQuestionsClazzByQuestionsClazzId(Long questionsClazzId)
    {
        return examQuestionsClazzMapper.deleteExamQuestionsClazzByQuestionsClazzId(questionsClazzId);
    }
}
