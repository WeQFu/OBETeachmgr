package com.ruoyi.teachmgr.teachexecute.mapper;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeCode;

/**
 * 编码实践Mapper接口
 * 
 * @author jzg
 * @date 2023-05-13
 */
public interface TeachPracticeCodeMapper 
{
    /**
     * 查询编码实践
     * 
     * @param practiceCodeId 编码实践主键
     * @return 编码实践
     */
    public TeachPracticeCode selectTeachPracticeCodeByPracticeCodeId(Long practiceCodeId);

    /**
     * 查询编码实践列表
     * 
     * @param teachPracticeCode 编码实践
     * @return 编码实践集合
     */
    public List<TeachPracticeCode> selectTeachPracticeCodeList(TeachPracticeCode teachPracticeCode);

    /**
     * 新增编码实践
     * 
     * @param teachPracticeCode 编码实践
     * @return 结果
     */
    public int insertTeachPracticeCode(TeachPracticeCode teachPracticeCode);

    /**
     * 修改编码实践
     * 
     * @param teachPracticeCode 编码实践
     * @return 结果
     */
    public int updateTeachPracticeCode(TeachPracticeCode teachPracticeCode);

    /**
     * 删除编码实践
     * 
     * @param practiceCodeId 编码实践主键
     * @return 结果
     */
    public int deleteTeachPracticeCodeByPracticeCodeId(Long practiceCodeId);

    /**
     * 批量删除编码实践
     * 
     * @param practiceCodeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachPracticeCodeByPracticeCodeIds(Long[] practiceCodeIds);
}
