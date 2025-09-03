package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachQuizDataBodyMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataBody;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizDataBodyService;

/**
 * 考试答卷bodyService业务层处理
 * 
 * @author jzg
 * @date 2023-05-28
 */
@Service
public class TeachQuizDataBodyServiceImpl implements ITeachQuizDataBodyService 
{
    @Autowired
    private TeachQuizDataBodyMapper teachQuizDataBodyMapper;

    /**
     * 查询考试答卷body
     * 
     * @param quizDataBodyId 考试答卷body主键
     * @return 考试答卷body
     */
    @Override
    public TeachQuizDataBody selectTeachQuizDataBodyByQuizDataBodyId(Long quizDataBodyId)
    {
        return teachQuizDataBodyMapper.selectTeachQuizDataBodyByQuizDataBodyId(quizDataBodyId);
    }

    /**
     * 查询考试答卷body列表
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 考试答卷body
     */
    @Override
    public List<TeachQuizDataBody> selectTeachQuizDataBodyList(TeachQuizDataBody teachQuizDataBody)
    {
        return teachQuizDataBodyMapper.selectTeachQuizDataBodyList(teachQuizDataBody);
    }

    /**
     * 新增考试答卷body
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 结果
     */
    @Override
    public int insertTeachQuizDataBody(TeachQuizDataBody teachQuizDataBody)
    {
        teachQuizDataBody.setCreateTime(DateUtils.getNowDate());
        return teachQuizDataBodyMapper.insertTeachQuizDataBody(teachQuizDataBody);
    }

    /**
     * 修改考试答卷body
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 结果
     */
    @Override
    public int updateTeachQuizDataBody(TeachQuizDataBody teachQuizDataBody)
    {
        teachQuizDataBody.setUpdateTime(DateUtils.getNowDate());
        return teachQuizDataBodyMapper.updateTeachQuizDataBody(teachQuizDataBody);
    }

    /**
     * 批量删除考试答卷body
     * 
     * @param quizDataBodyIds 需要删除的考试答卷body主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizDataBodyByQuizDataBodyIds(Long[] quizDataBodyIds)
    {
        return teachQuizDataBodyMapper.deleteTeachQuizDataBodyByQuizDataBodyIds(quizDataBodyIds);
    }

    /**
     * 删除考试答卷body信息
     * 
     * @param quizDataBodyId 考试答卷body主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizDataBodyByQuizDataBodyId(Long quizDataBodyId)
    {
        return teachQuizDataBodyMapper.deleteTeachQuizDataBodyByQuizDataBodyId(quizDataBodyId);
    }
}
