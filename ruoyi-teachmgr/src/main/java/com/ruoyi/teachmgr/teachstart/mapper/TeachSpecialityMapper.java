package com.ruoyi.teachmgr.teachstart.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachSpeciality;

/**
 * 专业管理Mapper接口
 * 
 * @author jzg
 * @date 2023-05-10
 */
public interface TeachSpecialityMapper 
{
    /**
     * 查询专业管理
     * 
     * @param specialityId 专业管理主键
     * @return 专业管理
     */
    public TeachSpeciality selectTeachSpecialityBySpecialityId(Long specialityId);

    /**
     * 查询专业管理列表
     * 
     * @param teachSpeciality 专业管理
     * @return 专业管理集合
     */
    public List<TeachSpeciality> selectTeachSpecialityList(TeachSpeciality teachSpeciality);

    /**
     * 新增专业管理
     * 
     * @param teachSpeciality 专业管理
     * @return 结果
     */
    public int insertTeachSpeciality(TeachSpeciality teachSpeciality);

    /**
     * 修改专业管理
     * 
     * @param teachSpeciality 专业管理
     * @return 结果
     */
    public int updateTeachSpeciality(TeachSpeciality teachSpeciality);

    /**
     * 删除专业管理
     * 
     * @param specialityId 专业管理主键
     * @return 结果
     */
    public int deleteTeachSpecialityBySpecialityId(Long specialityId);

    /**
     * 批量删除专业管理
     * 
     * @param specialityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachSpecialityBySpecialityIds(Long[] specialityIds);
}
