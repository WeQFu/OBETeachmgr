package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachSpecialityMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachSpeciality;
import com.ruoyi.teachmgr.teachstart.service.ITeachSpecialityService;

/**
 * 专业管理Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-10
 */
@Service
public class TeachSpecialityServiceImpl implements ITeachSpecialityService 
{
    @Autowired
    private TeachSpecialityMapper teachSpecialityMapper;

    /**
     * 查询专业管理
     * 
     * @param specialityId 专业管理主键
     * @return 专业管理
     */
    @Override
    public TeachSpeciality selectTeachSpecialityBySpecialityId(Long specialityId)
    {
        return teachSpecialityMapper.selectTeachSpecialityBySpecialityId(specialityId);
    }

    /**
     * 查询专业管理列表
     * 
     * @param teachSpeciality 专业管理
     * @return 专业管理
     */
    @Override
    public List<TeachSpeciality> selectTeachSpecialityList(TeachSpeciality teachSpeciality)
    {
        return teachSpecialityMapper.selectTeachSpecialityList(teachSpeciality);
    }

    /**
     * 新增专业管理
     * 
     * @param teachSpeciality 专业管理
     * @return 结果
     */
    @Override
    public int insertTeachSpeciality(TeachSpeciality teachSpeciality)
    {
        teachSpeciality.setCreateTime(DateUtils.getNowDate());
        return teachSpecialityMapper.insertTeachSpeciality(teachSpeciality);
    }

    /**
     * 修改专业管理
     * 
     * @param teachSpeciality 专业管理
     * @return 结果
     */
    @Override
    public int updateTeachSpeciality(TeachSpeciality teachSpeciality)
    {
        teachSpeciality.setUpdateTime(DateUtils.getNowDate());
        return teachSpecialityMapper.updateTeachSpeciality(teachSpeciality);
    }

    /**
     * 批量删除专业管理
     * 
     * @param specialityIds 需要删除的专业管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachSpecialityBySpecialityIds(Long[] specialityIds)
    {
        return teachSpecialityMapper.deleteTeachSpecialityBySpecialityIds(specialityIds);
    }

    /**
     * 删除专业管理信息
     * 
     * @param specialityId 专业管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachSpecialityBySpecialityId(Long specialityId)
    {
        return teachSpecialityMapper.deleteTeachSpecialityBySpecialityId(specialityId);
    }
}
