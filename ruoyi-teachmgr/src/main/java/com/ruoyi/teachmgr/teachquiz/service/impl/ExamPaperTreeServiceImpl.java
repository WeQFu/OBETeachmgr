package com.ruoyi.teachmgr.teachquiz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachquiz.mapper.ExamPaperTreeMapper;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaperTree;
import com.ruoyi.teachmgr.teachquiz.service.IExamPaperTreeService;

/**
 * 树形组卷Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-30
 */
@Service
public class ExamPaperTreeServiceImpl implements IExamPaperTreeService 
{
    @Autowired
    private ExamPaperTreeMapper examPaperTreeMapper;

    /**
     * 查询树形组卷
     * 
     * @param paperTreeId 树形组卷主键
     * @return 树形组卷
     */
    @Override
    public ExamPaperTree selectExamPaperTreeByPaperTreeId(Long paperTreeId)
    {
        return examPaperTreeMapper.selectExamPaperTreeByPaperTreeId(paperTreeId);
    }

    /**
     * 查询树形组卷列表
     * 
     * @param examPaperTree 树形组卷
     * @return 树形组卷
     */
    @Override
    public List<ExamPaperTree> selectExamPaperTreeList(ExamPaperTree examPaperTree)
    {
        return examPaperTreeMapper.selectExamPaperTreeList(examPaperTree);
    }

    /**
     * 新增树形组卷
     * 
     * @param examPaperTree 树形组卷
     * @return 结果
     */
    @Override
    public int insertExamPaperTree(ExamPaperTree examPaperTree)
    {
        examPaperTree.setCreateTime(DateUtils.getNowDate());
        return examPaperTreeMapper.insertExamPaperTree(examPaperTree);
    }

    /**
     * 修改树形组卷
     * 
     * @param examPaperTree 树形组卷
     * @return 结果
     */
    @Override
    public int updateExamPaperTree(ExamPaperTree examPaperTree)
    {
        examPaperTree.setUpdateTime(DateUtils.getNowDate());
        return examPaperTreeMapper.updateExamPaperTree(examPaperTree);
    }

    /**
     * 批量删除树形组卷
     * 
     * @param paperTreeIds 需要删除的树形组卷主键
     * @return 结果
     */
    @Override
    public int deleteExamPaperTreeByPaperTreeIds(Long[] paperTreeIds)
    {
        return examPaperTreeMapper.deleteExamPaperTreeByPaperTreeIds(paperTreeIds);
    }

    /**
     * 删除树形组卷信息
     * 
     * @param paperTreeId 树形组卷主键
     * @return 结果
     */
    @Override
    public int deleteExamPaperTreeByPaperTreeId(Long paperTreeId)
    {
        return examPaperTreeMapper.deleteExamPaperTreeByPaperTreeId(paperTreeId);
    }
}
