package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachGraduationRequireMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachGraduationRequire;
import com.ruoyi.teachmgr.teachstart.service.ITeachGraduationRequireService;

/**
 * 毕业要求Service业务层处理
 * 
 * @author jzg
 * @date 2024-03-03
 */
@Service
public class TeachGraduationRequireServiceImpl implements ITeachGraduationRequireService 
{
    @Autowired
    private TeachGraduationRequireMapper teachGraduationRequireMapper;

    /**
     * 查询毕业要求
     * 
     * @param graduRequireId 毕业要求主键
     * @return 毕业要求
     */
    @Override
    public TeachGraduationRequire selectTeachGraduationRequireByGraduRequireId(Long graduRequireId)
    {
        return teachGraduationRequireMapper.selectTeachGraduationRequireByGraduRequireId(graduRequireId);
    }

    /**
     * 查询毕业要求列表
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 毕业要求
     */
    @Override
    public List<TeachGraduationRequire> selectTeachGraduationRequireList(TeachGraduationRequire teachGraduationRequire)
    {
        return teachGraduationRequireMapper.selectTeachGraduationRequireList(teachGraduationRequire);
    }

    /**
     * 新增毕业要求
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 结果
     */
    @Override
    public int insertTeachGraduationRequire(TeachGraduationRequire teachGraduationRequire)
    {
        teachGraduationRequire.setCreateTime(DateUtils.getNowDate());
        return teachGraduationRequireMapper.insertTeachGraduationRequire(teachGraduationRequire);
    }

    /**
     * 修改毕业要求
     * 
     * @param teachGraduationRequire 毕业要求
     * @return 结果
     */
    @Override
    public int updateTeachGraduationRequire(TeachGraduationRequire teachGraduationRequire)
    {
        teachGraduationRequire.setUpdateTime(DateUtils.getNowDate());
        return teachGraduationRequireMapper.updateTeachGraduationRequire(teachGraduationRequire);
    }

    /**
     * 批量删除毕业要求
     * 
     * @param graduRequireIds 需要删除的毕业要求主键
     * @return 结果
     */
    @Override
    public int deleteTeachGraduationRequireByGraduRequireIds(Long[] graduRequireIds)
    {
        return teachGraduationRequireMapper.deleteTeachGraduationRequireByGraduRequireIds(graduRequireIds);
    }

    /**
     * 删除毕业要求信息
     * 
     * @param graduRequireId 毕业要求主键
     * @return 结果
     */
    @Override
    public int deleteTeachGraduationRequireByGraduRequireId(Long graduRequireId)
    {
        return teachGraduationRequireMapper.deleteTeachGraduationRequireByGraduRequireId(graduRequireId);
    }
}
