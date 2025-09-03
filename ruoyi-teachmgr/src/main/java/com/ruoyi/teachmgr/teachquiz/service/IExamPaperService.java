package com.ruoyi.teachmgr.teachquiz.service;

import java.util.List;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaper;

/**
 * 组卷信息Service接口
 * 
 * @author jzg
 * @date 2023-05-25
 */
public interface IExamPaperService 
{
    /**
     * 查询组卷信息
     * 
     * @param paperId 组卷信息主键
     * @return 组卷信息
     */
    public ExamPaper selectExamPaperByPaperId(Long paperId);

    /**
     * 查询组卷信息列表
     * 
     * @param examPaper 组卷信息
     * @return 组卷信息集合
     */
    public List<ExamPaper> selectExamPaperList(ExamPaper examPaper);

    /**
     * 新增组卷信息
     * 
     * @param examPaper 组卷信息
     * @return 结果
     */
    public int insertExamPaper(ExamPaper examPaper);

    /**
     * 修改组卷信息
     * 
     * @param examPaper 组卷信息
     * @return 结果
     */
    public int updateExamPaper(ExamPaper examPaper);

    /**
     * 批量删除组卷信息
     * 
     * @param paperIds 需要删除的组卷信息主键集合
     * @return 结果
     */
    public int deleteExamPaperByPaperIds(Long[] paperIds);

    /**
     * 删除组卷信息信息
     * 
     * @param paperId 组卷信息主键
     * @return 结果
     */
    public int deleteExamPaperByPaperId(Long paperId);
}
