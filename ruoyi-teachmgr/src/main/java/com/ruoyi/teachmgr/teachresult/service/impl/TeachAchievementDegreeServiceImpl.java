package com.ruoyi.teachmgr.teachresult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachresult.mapper.TeachAchievementDegreeMapper;
import com.ruoyi.teachmgr.teachresult.domain.TeachAchievementDegree;
import com.ruoyi.teachmgr.teachresult.service.ITeachAchievementDegreeService;

/**
 * 目标达成度Service业务层处理
 * 
 * @author jzg
 * @date 2024-03-05
 */
@Service
public class TeachAchievementDegreeServiceImpl implements ITeachAchievementDegreeService 
{
    @Autowired
    private TeachAchievementDegreeMapper teachAchievementDegreeMapper;

    /**
     * 查询目标达成度
     * 
     * @param achievDegreeId 目标达成度主键
     * @return 目标达成度
     */
    @Override
    public TeachAchievementDegree selectTeachAchievementDegreeByAchievDegreeId(Long achievDegreeId)
    {
        return teachAchievementDegreeMapper.selectTeachAchievementDegreeByAchievDegreeId(achievDegreeId);
    }

    /**
     * 查询目标达成度列表
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 目标达成度
     */
    @Override
    public List<TeachAchievementDegree> selectTeachAchievementDegreeList(TeachAchievementDegree teachAchievementDegree)
    {
        return teachAchievementDegreeMapper.selectTeachAchievementDegreeList(teachAchievementDegree);
    }

    /**
     * 新增目标达成度
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 结果
     */
    @Override
    public int insertTeachAchievementDegree(TeachAchievementDegree teachAchievementDegree)
    {
        teachAchievementDegree.setCreateTime(DateUtils.getNowDate());
        return teachAchievementDegreeMapper.insertTeachAchievementDegree(teachAchievementDegree);
    }

    /**
     * 修改目标达成度
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 结果
     */
    @Override
    public int updateTeachAchievementDegree(TeachAchievementDegree teachAchievementDegree)
    {
        teachAchievementDegree.setUpdateTime(DateUtils.getNowDate());
        return teachAchievementDegreeMapper.updateTeachAchievementDegree(teachAchievementDegree);
    }

    /**
     * 批量删除目标达成度
     * 
     * @param achievDegreeIds 需要删除的目标达成度主键
     * @return 结果
     */
    @Override
    public int deleteTeachAchievementDegreeByAchievDegreeIds(Long[] achievDegreeIds)
    {
        return teachAchievementDegreeMapper.deleteTeachAchievementDegreeByAchievDegreeIds(achievDegreeIds);
    }

    /**
     * 删除目标达成度信息
     * 
     * @param achievDegreeId 目标达成度主键
     * @return 结果
     */
    @Override
    public int deleteTeachAchievementDegreeByAchievDegreeId(Long achievDegreeId)
    {
        return teachAchievementDegreeMapper.deleteTeachAchievementDegreeByAchievDegreeId(achievDegreeId);
    }
}
