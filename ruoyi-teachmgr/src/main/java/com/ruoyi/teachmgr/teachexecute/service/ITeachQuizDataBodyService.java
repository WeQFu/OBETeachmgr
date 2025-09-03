package com.ruoyi.teachmgr.teachexecute.service;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataBody;

/**
 * 考试答卷bodyService接口
 * 
 * @author jzg
 * @date 2023-05-28
 */
public interface ITeachQuizDataBodyService 
{
    /**
     * 查询考试答卷body
     * 
     * @param quizDataBodyId 考试答卷body主键
     * @return 考试答卷body
     */
    public TeachQuizDataBody selectTeachQuizDataBodyByQuizDataBodyId(Long quizDataBodyId);

    /**
     * 查询考试答卷body列表
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 考试答卷body集合
     */
    public List<TeachQuizDataBody> selectTeachQuizDataBodyList(TeachQuizDataBody teachQuizDataBody);

    /**
     * 新增考试答卷body
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 结果
     */
    public int insertTeachQuizDataBody(TeachQuizDataBody teachQuizDataBody);

    /**
     * 修改考试答卷body
     * 
     * @param teachQuizDataBody 考试答卷body
     * @return 结果
     */
    public int updateTeachQuizDataBody(TeachQuizDataBody teachQuizDataBody);

    /**
     * 批量删除考试答卷body
     * 
     * @param quizDataBodyIds 需要删除的考试答卷body主键集合
     * @return 结果
     */
    public int deleteTeachQuizDataBodyByQuizDataBodyIds(Long[] quizDataBodyIds);

    /**
     * 删除考试答卷body信息
     * 
     * @param quizDataBodyId 考试答卷body主键
     * @return 结果
     */
    public int deleteTeachQuizDataBodyByQuizDataBodyId(Long quizDataBodyId);
}
