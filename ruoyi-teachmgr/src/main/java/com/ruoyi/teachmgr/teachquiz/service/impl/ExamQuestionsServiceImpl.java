package com.ruoyi.teachmgr.teachquiz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachquiz.mapper.ExamQuestionsMapper;
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestions;
import com.ruoyi.teachmgr.teachquiz.service.IExamQuestionsService;

/**
 * 试题库Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-15
 */
@Service
public class ExamQuestionsServiceImpl implements IExamQuestionsService 
{
    @Autowired
    private ExamQuestionsMapper examQuestionsMapper;

    /**
     * 查询试题库
     * 
     * @param questionId 试题库主键
     * @return 试题库
     */
    @Override
    public ExamQuestions selectExamQuestionsByQuestionId(Long questionId)
    {
        return examQuestionsMapper.selectExamQuestionsByQuestionId(questionId);
    }

    /**
     * 查询试题库列表
     * 
     * @param examQuestions 试题库
     * @return 试题库
     */
    @Override
    public List<ExamQuestions> selectExamQuestionsList(ExamQuestions examQuestions)
    {
        return examQuestionsMapper.selectExamQuestionsList(examQuestions);
    }

    /**
     * 新增试题库
     * 
     * @param examQuestions 试题库
     * @return 结果
     */
    @Override
    public int insertExamQuestions(ExamQuestions examQuestions)
    {
        examQuestions.setCreateTime(DateUtils.getNowDate());
        return examQuestionsMapper.insertExamQuestions(examQuestions);
    }

    /**
     * 修改试题库
     * 
     * @param examQuestions 试题库
     * @return 结果
     */
    @Override
    public int updateExamQuestions(ExamQuestions examQuestions)
    {
        examQuestions.setUpdateTime(DateUtils.getNowDate());
        return examQuestionsMapper.updateExamQuestions(examQuestions);
    }

    /**
     * 批量删除试题库
     * 
     * @param questionIds 需要删除的试题库主键
     * @return 结果
     */
    @Override
    public int deleteExamQuestionsByQuestionIds(Long[] questionIds)
    {
        return examQuestionsMapper.deleteExamQuestionsByQuestionIds(questionIds);
    }

    /**
     * 删除试题库信息
     * 
     * @param questionId 试题库主键
     * @return 结果
     */
    @Override
    public int deleteExamQuestionsByQuestionId(Long questionId)
    {
        return examQuestionsMapper.deleteExamQuestionsByQuestionId(questionId);
    }
}
