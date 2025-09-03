package com.ruoyi.teachmgr.teachquiz.service;

import java.util.List;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaperTree;

/**
 * 树形组卷Service接口
 * 
 * @author jzg
 * @date 2023-05-30
 */
public interface IExamPaperTreeService 
{
    /**
     * 查询树形组卷
     * 
     * @param paperTreeId 树形组卷主键
     * @return 树形组卷
     */
    public ExamPaperTree selectExamPaperTreeByPaperTreeId(Long paperTreeId);

    /**
     * 查询树形组卷列表
     * 
     * @param examPaperTree 树形组卷
     * @return 树形组卷集合
     */
    public List<ExamPaperTree> selectExamPaperTreeList(ExamPaperTree examPaperTree);

    /**
     * 新增树形组卷
     * 
     * @param examPaperTree 树形组卷
     * @return 结果
     */
    public int insertExamPaperTree(ExamPaperTree examPaperTree);

    /**
     * 修改树形组卷
     * 
     * @param examPaperTree 树形组卷
     * @return 结果
     */
    public int updateExamPaperTree(ExamPaperTree examPaperTree);

    /**
     * 批量删除树形组卷
     * 
     * @param paperTreeIds 需要删除的树形组卷主键集合
     * @return 结果
     */
    public int deleteExamPaperTreeByPaperTreeIds(Long[] paperTreeIds);

    /**
     * 删除树形组卷信息
     * 
     * @param paperTreeId 树形组卷主键
     * @return 结果
     */
    public int deleteExamPaperTreeByPaperTreeId(Long paperTreeId);
}
