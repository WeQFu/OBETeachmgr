package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachPracticeCodeMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeCode;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeCodeService;

/**
 * 编码实践Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-13
 */
@Service
public class TeachPracticeCodeServiceImpl implements ITeachPracticeCodeService 
{
    @Autowired
    private TeachPracticeCodeMapper teachPracticeCodeMapper;

    /**
     * 查询编码实践
     * 
     * @param practiceCodeId 编码实践主键
     * @return 编码实践
     */
    @Override
    public TeachPracticeCode selectTeachPracticeCodeByPracticeCodeId(Long practiceCodeId)
    {
        return teachPracticeCodeMapper.selectTeachPracticeCodeByPracticeCodeId(practiceCodeId);
    }

    /**
     * 查询编码实践列表
     * 
     * @param teachPracticeCode 编码实践
     * @return 编码实践
     */
    @Override
    public List<TeachPracticeCode> selectTeachPracticeCodeList(TeachPracticeCode teachPracticeCode)
    {
        return teachPracticeCodeMapper.selectTeachPracticeCodeList(teachPracticeCode);
    }

    /**
     * 新增编码实践
     * 
     * @param teachPracticeCode 编码实践
     * @return 结果
     */
    @Override
    public int insertTeachPracticeCode(TeachPracticeCode teachPracticeCode)
    {
        teachPracticeCode.setCreateTime(DateUtils.getNowDate());
        return teachPracticeCodeMapper.insertTeachPracticeCode(teachPracticeCode);
    }

    /**
     * 修改编码实践
     * 
     * @param teachPracticeCode 编码实践
     * @return 结果
     */
    @Override
    public int updateTeachPracticeCode(TeachPracticeCode teachPracticeCode)
    {
        teachPracticeCode.setUpdateTime(DateUtils.getNowDate());
        return teachPracticeCodeMapper.updateTeachPracticeCode(teachPracticeCode);
    }

    /**
     * 批量删除编码实践
     * 
     * @param practiceCodeIds 需要删除的编码实践主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeCodeByPracticeCodeIds(Long[] practiceCodeIds)
    {
        return teachPracticeCodeMapper.deleteTeachPracticeCodeByPracticeCodeIds(practiceCodeIds);
    }

    /**
     * 删除编码实践信息
     * 
     * @param practiceCodeId 编码实践主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeCodeByPracticeCodeId(Long practiceCodeId)
    {
        return teachPracticeCodeMapper.deleteTeachPracticeCodeByPracticeCodeId(practiceCodeId);
    }
}
