package com.ruoyi.teachmgr.teachexecute.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizPublish;

/**
 * 考试发布Mapper接口
 * 
 * @author jzg
 * @date 2023-05-28
 */
public interface TeachQuizPublishMapper 
{
    /**
     * 查询考试发布
     * 
     * @param quizPublishId 考试发布主键
     * @return 考试发布
     */
    public TeachQuizPublish selectTeachQuizPublishByQuizPublishId(Long quizPublishId);

    /**
     * 查询考试发布列表
     * 
     * @param teachQuizPublish 考试发布
     * @return 考试发布集合
     */
    public List<TeachQuizPublish> selectTeachQuizPublishList(TeachQuizPublish teachQuizPublish);

    /**
     * 新增考试发布
     * 
     * @param teachQuizPublish 考试发布
     * @return 结果
     */
    public int insertTeachQuizPublish(TeachQuizPublish teachQuizPublish);

    /**
     * 修改考试发布
     * 
     * @param teachQuizPublish 考试发布
     * @return 结果
     */
    public int updateTeachQuizPublish(TeachQuizPublish teachQuizPublish);

    /**
     * 删除考试发布
     * 
     * @param quizPublishId 考试发布主键
     * @return 结果
     */
    public int deleteTeachQuizPublishByQuizPublishId(Long quizPublishId);

    /**
     * 批量删除考试发布
     * 
     * @param quizPublishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachQuizPublishByQuizPublishIds(Long[] quizPublishIds);
}
