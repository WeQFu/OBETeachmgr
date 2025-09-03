package com.ruoyi.teachmgr.teachquiz.service;

import java.util.List;
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestions;

/**
 * 试题库Service接口
 * 
 * @author jzg
 * @date 2023-05-15
 */
public interface IExamQuestionsService 
{
    /**
     * 查询试题库
     * 
     * @param questionId 试题库主键
     * @return 试题库
     */
    public ExamQuestions selectExamQuestionsByQuestionId(Long questionId);

    /**
     * 查询试题库列表
     * 
     * @param examQuestions 试题库
     * @return 试题库集合
     */
    public List<ExamQuestions> selectExamQuestionsList(ExamQuestions examQuestions);

    /**
     * 新增试题库
     * 
     * @param examQuestions 试题库
     * @return 结果
     */
    public int insertExamQuestions(ExamQuestions examQuestions);

    /**
     * 修改试题库
     * 
     * @param examQuestions 试题库
     * @return 结果
     */
    public int updateExamQuestions(ExamQuestions examQuestions);

    /**
     * 批量删除试题库
     * 
     * @param questionIds 需要删除的试题库主键集合
     * @return 结果
     */
    public int deleteExamQuestionsByQuestionIds(Long[] questionIds);

    /**
     * 删除试题库信息
     * 
     * @param questionId 试题库主键
     * @return 结果
     */
    public int deleteExamQuestionsByQuestionId(Long questionId);
}
