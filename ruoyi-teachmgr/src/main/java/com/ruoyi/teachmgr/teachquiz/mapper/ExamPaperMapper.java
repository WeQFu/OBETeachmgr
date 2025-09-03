package com.ruoyi.teachmgr.teachquiz.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaper;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaperSub;

/**
 * 组卷信息Mapper接口
 * 
 * @author jzg
 * @date 2023-05-25
 */
public interface ExamPaperMapper 
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
     * 删除组卷信息
     * 
     * @param paperId 组卷信息主键
     * @return 结果
     */
    public int deleteExamPaperByPaperId(Long paperId);

    /**
     * 批量删除组卷信息
     * 
     * @param paperIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamPaperByPaperIds(Long[] paperIds);

    /**
     * 批量删除组卷详情
     * 
     * @param paperIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamPaperSubByPaperIds(Long[] paperIds);
    
    /**
     * 批量新增组卷详情
     * 
     * @param examPaperSubList 组卷详情列表
     * @return 结果
     */
    public int batchExamPaperSub(List<ExamPaperSub> examPaperSubList);
    

    /**
     * 通过组卷信息主键删除组卷详情信息
     * 
     * @param paperId 组卷信息ID
     * @return 结果
     */
    public int deleteExamPaperSubByPaperId(Long paperId);
}
