package com.ruoyi.teachmgr.teachexecute.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataHead;

/**
 * 考试阅卷Mapper接口
 * 
 * @author jzg
 * @date 2023-06-06
 */
public interface TeachQuizDataHeadMapper 
{
    /**
     * 查询考试阅卷
     * 
     * @param quizDataHeadId 考试阅卷主键
     * @return 考试阅卷
     */
    public TeachQuizDataHead selectTeachQuizDataHeadByQuizDataHeadId(Long quizDataHeadId);

    /**
     * 查询考试阅卷列表
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 考试阅卷集合
     */
    public List<TeachQuizDataHead> selectTeachQuizDataHeadList(TeachQuizDataHead teachQuizDataHead);

    /**
     * 新增考试阅卷
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 结果
     */
    public int insertTeachQuizDataHead(TeachQuizDataHead teachQuizDataHead);

    /**
     * 修改考试阅卷
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 结果
     */
    public int updateTeachQuizDataHead(TeachQuizDataHead teachQuizDataHead);

    /**
     * 删除考试阅卷
     * 
     * @param quizDataHeadId 考试阅卷主键
     * @return 结果
     */
    public int deleteTeachQuizDataHeadByQuizDataHeadId(Long quizDataHeadId);

    /**
     * 批量删除考试阅卷
     * 
     * @param quizDataHeadIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachQuizDataHeadByQuizDataHeadIds(Long[] quizDataHeadIds);
}
