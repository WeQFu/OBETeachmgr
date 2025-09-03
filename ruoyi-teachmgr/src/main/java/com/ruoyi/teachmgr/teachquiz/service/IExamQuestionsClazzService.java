package com.ruoyi.teachmgr.teachquiz.service;

import java.util.List;
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestionsClazz;

/**
 * 题库分类Service接口
 * 
 * @author jzg
 * @date 2023-05-15
 */
public interface IExamQuestionsClazzService 
{
    /**
     * 查询题库分类
     * 
     * @param questionsClazzId 题库分类主键
     * @return 题库分类
     */
    public ExamQuestionsClazz selectExamQuestionsClazzByQuestionsClazzId(Long questionsClazzId);

    /**
     * 查询题库分类列表
     * 
     * @param examQuestionsClazz 题库分类
     * @return 题库分类集合
     */
    public List<ExamQuestionsClazz> selectExamQuestionsClazzList(ExamQuestionsClazz examQuestionsClazz);

    /**
     * 新增题库分类
     * 
     * @param examQuestionsClazz 题库分类
     * @return 结果
     */
    public int insertExamQuestionsClazz(ExamQuestionsClazz examQuestionsClazz);

    /**
     * 修改题库分类
     * 
     * @param examQuestionsClazz 题库分类
     * @return 结果
     */
    public int updateExamQuestionsClazz(ExamQuestionsClazz examQuestionsClazz);

    /**
     * 批量删除题库分类
     * 
     * @param questionsClazzIds 需要删除的题库分类主键集合
     * @return 结果
     */
    public int deleteExamQuestionsClazzByQuestionsClazzIds(Long[] questionsClazzIds);

    /**
     * 删除题库分类信息
     * 
     * @param questionsClazzId 题库分类主键
     * @return 结果
     */
    public int deleteExamQuestionsClazzByQuestionsClazzId(Long questionsClazzId);
}
