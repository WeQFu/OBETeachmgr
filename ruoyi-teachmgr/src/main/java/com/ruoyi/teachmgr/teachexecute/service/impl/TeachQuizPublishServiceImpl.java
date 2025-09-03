package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachQuizPublishMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizPublish;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizPublishService;

import javax.annotation.Resource;

/**
 * 考试发布Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-28
 */
@Service
public class TeachQuizPublishServiceImpl implements ITeachQuizPublishService 
{
    @Resource
    private TeachQuizPublishMapper teachQuizPublishMapper;

    /**
     * 查询考试发布
     * 
     * @param quizPublishId 考试发布主键
     * @return 考试发布
     */
    @Override
    public TeachQuizPublish selectTeachQuizPublishByQuizPublishId(Long quizPublishId)
    {
        return teachQuizPublishMapper.selectTeachQuizPublishByQuizPublishId(quizPublishId);
    }

    /**
     * 查询考试发布列表
     * 
     * @param teachQuizPublish 考试发布
     * @return 考试发布
     */
    @Override
    public List<TeachQuizPublish> selectTeachQuizPublishList(TeachQuizPublish teachQuizPublish)
    {
//        List<TeachQuizPublish> list=teachQuizPublishMapper.selectTeachQuizPublishList(teachQuizPublish);
//        System.out.println("ddddd");
//        for(TeachQuizPublish item: list){
//            System.out.println("eeeee");
//            System.out.println(item.getCourseName());
//        }
        return teachQuizPublishMapper.selectTeachQuizPublishList(teachQuizPublish);
    }

    /**
     * 新增考试发布
     * 
     * @param teachQuizPublish 考试发布
     * @return 结果
     */
    @Override
    public int insertTeachQuizPublish(TeachQuizPublish teachQuizPublish)
    {
        teachQuizPublish.setCreateTime(DateUtils.getNowDate());
        return teachQuizPublishMapper.insertTeachQuizPublish(teachQuizPublish);
    }

    /**
     * 修改考试发布
     * 
     * @param teachQuizPublish 考试发布
     * @return 结果
     */
    @Override
    public int updateTeachQuizPublish(TeachQuizPublish teachQuizPublish)
    {
        teachQuizPublish.setUpdateTime(DateUtils.getNowDate());
        return teachQuizPublishMapper.updateTeachQuizPublish(teachQuizPublish);
    }

    /**
     * 批量删除考试发布
     * 
     * @param quizPublishIds 需要删除的考试发布主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizPublishByQuizPublishIds(Long[] quizPublishIds)
    {
        return teachQuizPublishMapper.deleteTeachQuizPublishByQuizPublishIds(quizPublishIds);
    }

    /**
     * 删除考试发布信息
     * 
     * @param quizPublishId 考试发布主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizPublishByQuizPublishId(Long quizPublishId)
    {
        return teachQuizPublishMapper.deleteTeachQuizPublishByQuizPublishId(quizPublishId);
    }
}
