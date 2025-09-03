package com.ruoyi.teachmgr.teachexecute.service;

import java.util.List;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeData;

/**
 * 实践成果Service接口
 * 
 * @author jzg
 * @date 2023-05-15
 */
public interface ITeachPracticeDataService 
{
    /**
     * 查询实践成果
     * 
     * @param practiceDataId 实践成果主键
     * @return 实践成果
     */
    public TeachPracticeData selectTeachPracticeDataByPracticeDataId(Long practiceDataId);

    /**
     * 查询实践成果列表
     * 
     * @param teachPracticeData 实践成果
     * @return 实践成果集合
     */
    public List<TeachPracticeData> selectTeachPracticeDataList(TeachPracticeData teachPracticeData);

    /**
     * 新增实践成果
     * 
     * @param teachPracticeData 实践成果
     * @return 结果
     */
    public int insertTeachPracticeData(TeachPracticeData teachPracticeData);

    /**
     * 修改实践成果
     * 
     * @param teachPracticeData 实践成果
     * @return 结果
     */
    public int updateTeachPracticeData(TeachPracticeData teachPracticeData);

    /**
     * 批量删除实践成果
     * 
     * @param practiceDataIds 需要删除的实践成果主键集合
     * @return 结果
     */
    public int deleteTeachPracticeDataByPracticeDataIds(Long[] practiceDataIds);

    /**
     * 删除实践成果信息
     * 
     * @param practiceDataId 实践成果主键
     * @return 结果
     */
    public int deleteTeachPracticeDataByPracticeDataId(Long practiceDataId);

    /**
     * 导入用户数据
     *
     * @param teachPracticeDataList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importData(List<TeachPracticeData> teachPracticeDataList, Boolean isUpdateSupport);

}
