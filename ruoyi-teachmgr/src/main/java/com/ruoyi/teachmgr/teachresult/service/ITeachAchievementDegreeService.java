package com.ruoyi.teachmgr.teachresult.service;

import java.util.List;
import com.ruoyi.teachmgr.teachresult.domain.TeachAchievementDegree;

/**
 * 目标达成度Service接口
 * 
 * @author jzg
 * @date 2024-03-05
 */
public interface ITeachAchievementDegreeService 
{
    /**
     * 查询目标达成度
     * 
     * @param achievDegreeId 目标达成度主键
     * @return 目标达成度
     */
    public TeachAchievementDegree selectTeachAchievementDegreeByAchievDegreeId(Long achievDegreeId);

    /**
     * 查询目标达成度列表
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 目标达成度集合
     */
    public List<TeachAchievementDegree> selectTeachAchievementDegreeList(TeachAchievementDegree teachAchievementDegree);

    /**
     * 新增目标达成度
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 结果
     */
    public int insertTeachAchievementDegree(TeachAchievementDegree teachAchievementDegree);

    /**
     * 修改目标达成度
     * 
     * @param teachAchievementDegree 目标达成度
     * @return 结果
     */
    public int updateTeachAchievementDegree(TeachAchievementDegree teachAchievementDegree);

    /**
     * 批量删除目标达成度
     * 
     * @param achievDegreeIds 需要删除的目标达成度主键集合
     * @return 结果
     */
    public int deleteTeachAchievementDegreeByAchievDegreeIds(Long[] achievDegreeIds);

    /**
     * 删除目标达成度信息
     * 
     * @param achievDegreeId 目标达成度主键
     * @return 结果
     */
    public int deleteTeachAchievementDegreeByAchievDegreeId(Long achievDegreeId);
}
