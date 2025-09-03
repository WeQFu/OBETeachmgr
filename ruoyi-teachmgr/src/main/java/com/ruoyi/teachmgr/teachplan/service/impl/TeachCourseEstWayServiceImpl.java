package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachCourseEstWayMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseEstWay;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseEstWayService;

/**
 * 评价方式Service业务层处理
 * 
 * @author jzg
 * @date 2024-03-05
 */
@Service
public class TeachCourseEstWayServiceImpl implements ITeachCourseEstWayService 
{
    @Autowired
    private TeachCourseEstWayMapper teachCourseEstWayMapper;

    /**
     * 查询评价方式
     * 
     * @param estWayId 评价方式主键
     * @return 评价方式
     */
    @Override
    public TeachCourseEstWay selectTeachCourseEstWayByEstWayId(Long estWayId)
    {
        return teachCourseEstWayMapper.selectTeachCourseEstWayByEstWayId(estWayId);
    }

    /**
     * 查询评价方式列表
     * 
     * @param teachCourseEstWay 评价方式
     * @return 评价方式
     */
    @Override
    public List<TeachCourseEstWay> selectTeachCourseEstWayList(TeachCourseEstWay teachCourseEstWay)
    {
        return teachCourseEstWayMapper.selectTeachCourseEstWayList(teachCourseEstWay);
    }

    /**
     * 新增评价方式
     * 
     * @param teachCourseEstWay 评价方式
     * @return 结果
     */
    @Override
    public int insertTeachCourseEstWay(TeachCourseEstWay teachCourseEstWay)
    {
        teachCourseEstWay.setCreateTime(DateUtils.getNowDate());
        return teachCourseEstWayMapper.insertTeachCourseEstWay(teachCourseEstWay);
    }

    /**
     * 修改评价方式
     * 
     * @param teachCourseEstWay 评价方式
     * @return 结果
     */
    @Override
    public int updateTeachCourseEstWay(TeachCourseEstWay teachCourseEstWay)
    {
        teachCourseEstWay.setUpdateTime(DateUtils.getNowDate());
        return teachCourseEstWayMapper.updateTeachCourseEstWay(teachCourseEstWay);
    }

    /**
     * 批量删除评价方式
     * 
     * @param estWayIds 需要删除的评价方式主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseEstWayByEstWayIds(Long[] estWayIds)
    {
        return teachCourseEstWayMapper.deleteTeachCourseEstWayByEstWayIds(estWayIds);
    }

    /**
     * 删除评价方式信息
     * 
     * @param estWayId 评价方式主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseEstWayByEstWayId(Long estWayId)
    {
        return teachCourseEstWayMapper.deleteTeachCourseEstWayByEstWayId(estWayId);
    }

    /**
     * 数据导入
     * @param teachCourseEstWayList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return
     */
    @Override
    public String importData(List<TeachCourseEstWay> teachCourseEstWayList, Boolean isUpdateSupport) {
        if (StringUtils.isNull(teachCourseEstWayList) || teachCourseEstWayList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        List<TeachCourseEstWay> existList = selectTeachCourseEstWayList(null);
        for (TeachCourseEstWay importData : teachCourseEstWayList)
        {
            try {

                boolean userFlag = false;
                for (TeachCourseEstWay entry : existList) {
                    if (entry.getGraduationRequirementId().equals(importData.getGraduationRequirementId()) &&
                            entry.getGraduationRequirementSubId().equals(importData.getGraduationRequirementSubId()) &&
                            entry.getCourseTargetName().equals(importData.getCourseTargetName()) &&
                            entry.getEstWay().equals(importData.getEstWay())) {
                        userFlag = true;
                        break;
                    }
                }
                if (!userFlag) {
                    insertTeachCourseEstWay(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getEstWay() + " 导入成功");
                } else if (isUpdateSupport) {
                    updateTeachCourseEstWay(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getEstWay() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getEstWay() + " 已存在");
                }
            }catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、" + importData.getEstWay() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
//                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

}
