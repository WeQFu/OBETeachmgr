package com.ruoyi.teachmgr.teachquiz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaperSub;
import com.ruoyi.teachmgr.teachquiz.mapper.ExamPaperMapper;
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaper;
import com.ruoyi.teachmgr.teachquiz.service.IExamPaperService;

import javax.annotation.Resource;

/**
 * 组卷信息Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-25
 */
@Service
public class ExamPaperServiceImpl implements IExamPaperService 
{
    @Resource
    private ExamPaperMapper examPaperMapper;

    /**
     * 查询组卷信息
     * 
     * @param paperId 组卷信息主键
     * @return 组卷信息
     */
    @Override
    public ExamPaper selectExamPaperByPaperId(Long paperId)
    {
        return examPaperMapper.selectExamPaperByPaperId(paperId);
    }

    /**
     * 查询组卷信息列表
     * 
     * @param examPaper 组卷信息
     * @return 组卷信息
     */
    @Override
    public List<ExamPaper> selectExamPaperList(ExamPaper examPaper)
    {
        return examPaperMapper.selectExamPaperList(examPaper);
    }

    /**
     * 新增组卷信息
     * 
     * @param examPaper 组卷信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertExamPaper(ExamPaper examPaper)
    {
        examPaper.setCreateTime(DateUtils.getNowDate());
        int rows = examPaperMapper.insertExamPaper(examPaper);
        insertExamPaperSub(examPaper);
        return rows;
    }

    /**
     * 修改组卷信息
     * 
     * @param examPaper 组卷信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateExamPaper(ExamPaper examPaper)
    {
        examPaper.setUpdateTime(DateUtils.getNowDate());
        examPaperMapper.deleteExamPaperSubByPaperId(examPaper.getPaperId());
        insertExamPaperSub(examPaper);
        return examPaperMapper.updateExamPaper(examPaper);
    }

    /**
     * 批量删除组卷信息
     * 
     * @param paperIds 需要删除的组卷信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteExamPaperByPaperIds(Long[] paperIds)
    {
        examPaperMapper.deleteExamPaperSubByPaperIds(paperIds);
        return examPaperMapper.deleteExamPaperByPaperIds(paperIds);
    }

    /**
     * 删除组卷信息信息
     * 
     * @param paperId 组卷信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteExamPaperByPaperId(Long paperId)
    {
        examPaperMapper.deleteExamPaperSubByPaperId(paperId);
        return examPaperMapper.deleteExamPaperByPaperId(paperId);
    }

    /**
     * 新增组卷详情信息
     * 
     * @param examPaper 组卷信息对象
     */
    public void insertExamPaperSub(ExamPaper examPaper)
    {
        List<ExamPaperSub> examPaperSubList = examPaper.getExamPaperSubList();
        Long paperId = examPaper.getPaperId();
        if (StringUtils.isNotNull(examPaperSubList))
        {
            List<ExamPaperSub> list = new ArrayList<ExamPaperSub>();
            for (ExamPaperSub examPaperSub : examPaperSubList)
            {
                examPaperSub.setPaperId(paperId);
                list.add(examPaperSub);
            }
            if (list.size() > 0)
            {
                examPaperMapper.batchExamPaperSub(list);
            }
        }
    }
}
