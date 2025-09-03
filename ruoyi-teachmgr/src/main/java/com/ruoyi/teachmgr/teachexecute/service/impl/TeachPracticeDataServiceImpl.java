package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachPracticeDataMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeData;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeDataService;

/**
 * 实践成果Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-15
 */
@Service
public class TeachPracticeDataServiceImpl implements ITeachPracticeDataService 
{
    @Autowired
    private TeachPracticeDataMapper teachPracticeDataMapper;

    /**
     * 查询实践成果
     * 
     * @param practiceDataId 实践成果主键
     * @return 实践成果
     */
    @Override
    public TeachPracticeData selectTeachPracticeDataByPracticeDataId(Long practiceDataId)
    {
        return teachPracticeDataMapper.selectTeachPracticeDataByPracticeDataId(practiceDataId);
    }

    /**
     * 查询实践成果列表
     * 
     * @param teachPracticeData 实践成果
     * @return 实践成果
     */
    @Override
    public List<TeachPracticeData> selectTeachPracticeDataList(TeachPracticeData teachPracticeData)
    {
        return teachPracticeDataMapper.selectTeachPracticeDataList(teachPracticeData);
    }

    /**
     * 新增实践成果
     * 
     * @param teachPracticeData 实践成果
     * @return 结果
     */
    @Override
    public int insertTeachPracticeData(TeachPracticeData teachPracticeData)
    {
        teachPracticeData.setCreateTime(DateUtils.getNowDate());
        return teachPracticeDataMapper.insertTeachPracticeData(teachPracticeData);
    }

    /**
     * 修改实践成果
     * 
     * @param teachPracticeData 实践成果
     * @return 结果
     */
    @Override
    public int updateTeachPracticeData(TeachPracticeData teachPracticeData)
    {
        teachPracticeData.setUpdateTime(DateUtils.getNowDate());
        return teachPracticeDataMapper.updateTeachPracticeData(teachPracticeData);
    }

    /**
     * 批量删除实践成果
     * 
     * @param practiceDataIds 需要删除的实践成果主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeDataByPracticeDataIds(Long[] practiceDataIds)
    {
        return teachPracticeDataMapper.deleteTeachPracticeDataByPracticeDataIds(practiceDataIds);
    }

    /**
     * 删除实践成果信息
     * 
     * @param practiceDataId 实践成果主键
     * @return 结果
     */
    @Override
    public int deleteTeachPracticeDataByPracticeDataId(Long practiceDataId)
    {
        return teachPracticeDataMapper.deleteTeachPracticeDataByPracticeDataId(practiceDataId);
    }

    @Override
    public String importData(List<TeachPracticeData> teachPracticeDataList, Boolean isUpdateSupport) {
        if (StringUtils.isNull(teachPracticeDataList) || teachPracticeDataList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        List<TeachPracticeData> existList = selectTeachPracticeDataList(null);
        for (TeachPracticeData importData : teachPracticeDataList) {
            insertTeachPracticeData(importData);
//            try {
//                boolean userFlag = false;
//                for (TeachPracticeData entry : existList) {
//                       if (entry.getPracticeName().equals(importData.getPracticeName()) &&
//                            entry.getCourseName().equals(importData.getCourseName()) &&
//                            entry.getPracticeSemester().equals(importData.getPracticeSemester()) &&
//                            entry.getUserName().equals(importData.getUserName())) {
//                        userFlag = true;
//                        break;
//                    }
//                }
//                if (!userFlag) {
//                    insertTeachPracticeData(importData);
//                    successNum++;
//                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPracticeName() + " 导入成功");
//                } else if (isUpdateSupport) {
//                    updateTeachPracticeData(importData);
//                    successNum++;
//                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPracticeName() + " 更新成功");
//                } else {
//                    failureNum++;
//                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getPracticeName() + " 已存在");
//                }
//            }catch (Exception e)
//            {
//                failureNum++;
//                String msg = "<br/>" + failureNum + "、" + importData.getPracticeName() + " 导入失败：";
//                failureMsg.append(msg + e.getMessage());
////                log.error(msg, e);
//            }
//        }
//        if (failureNum > 0)
//        {
//            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
//            throw new ServiceException(failureMsg.toString());
//        }
//        else
//        {
//            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
//        }
        }
        return successMsg.toString();

    }

//    @Override
//    public String importData(List<TeachPracticeData> practiceDataList, Boolean isUpdateSupport) {
//        if (StringUtils.isNull(practiceDataList) || practiceDataList.size() == 0)
//        {
//            throw new ServiceException("导入数据不能为空！");
//        }
//        int successNum = 0;
//        int failureNum = 0;
//        StringBuilder successMsg = new StringBuilder();
//        StringBuilder failureMsg = new StringBuilder();
//        List<TeachPracticeData> existList = selectTeachPracticeDataList(null);
//        for (TeachPracticeData importData : practiceDataList)
//        {
//            try {
//
//                boolean userFlag = false;
//                for (TeachPracticeData entry : existList) {
//                    if (entry.getPracticeName().equals(importData.getPracticeName()) &&
//                            entry.getCourseName().equals(importData.getCourseName()) &&
//                            entry.getPracticeSemester().equals(importData.getPracticeSemester()) &&
//                            entry.getUserName().equals(importData.getUserName())) {
//                        userFlag = true;
//                        break;
//                    }
//                }
//                if (!userFlag) {
//                    insertTeachPracticeData(importData);
//                    successNum++;
//                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPracticeName() + " 导入成功");
//                } else if (isUpdateSupport) {
//                    updateTeachPracticeData(importData);
//                    successNum++;
//                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPracticeName() + " 更新成功");
//                } else {
//                    failureNum++;
//                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getPracticeName() + " 已存在");
//                }
//            }catch (Exception e)
//            {
//                failureNum++;
//                String msg = "<br/>" + failureNum + "、" + importData.getPracticeName() + " 导入失败：";
//                failureMsg.append(msg + e.getMessage());
////                log.error(msg, e);
//            }
//        }
//        if (failureNum > 0)
//        {
//            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
//            throw new ServiceException(failureMsg.toString());
//        }
//        else
//        {
//            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
//        }
//        return successMsg.toString();
//    }

}
