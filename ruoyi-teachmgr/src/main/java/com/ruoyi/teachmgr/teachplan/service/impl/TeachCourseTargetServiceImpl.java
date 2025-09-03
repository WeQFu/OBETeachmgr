package com.ruoyi.teachmgr.teachplan.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachplan.mapper.TeachCourseTargetMapper;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseTarget;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseTargetService;

/**
 * 课程目标Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-12
 */
@Service
public class TeachCourseTargetServiceImpl implements ITeachCourseTargetService 
{
    @Autowired
    private TeachCourseTargetMapper teachCourseTargetMapper;

    /**
     * 查询课程目标
     * 
     * @param courseTargetId 课程目标主键
     * @return 课程目标
     */
    @Override
    public TeachCourseTarget selectTeachCourseTargetByCourseTargetId(Long courseTargetId)
    {
        return teachCourseTargetMapper.selectTeachCourseTargetByCourseTargetId(courseTargetId);
    }

    /**
     * 查询课程目标列表
     * 
     * @param teachCourseTarget 课程目标
     * @return 课程目标
     */
    @Override
    public List<TeachCourseTarget> selectTeachCourseTargetList(TeachCourseTarget teachCourseTarget)
    {
        return teachCourseTargetMapper.selectTeachCourseTargetList(teachCourseTarget);
    }

    /**
     * 新增课程目标
     * 
     * @param teachCourseTarget 课程目标
     * @return 结果
     */
    @Override
    public int insertTeachCourseTarget(TeachCourseTarget teachCourseTarget)
    {
        teachCourseTarget.setCreateTime(DateUtils.getNowDate());
        return teachCourseTargetMapper.insertTeachCourseTarget(teachCourseTarget);
    }

    /**
     * 修改课程目标
     * 
     * @param teachCourseTarget 课程目标
     * @return 结果
     */
    @Override
    public int updateTeachCourseTarget(TeachCourseTarget teachCourseTarget)
    {
        teachCourseTarget.setUpdateTime(DateUtils.getNowDate());
        return teachCourseTargetMapper.updateTeachCourseTarget(teachCourseTarget);
    }

    /**
     * 批量删除课程目标
     * 
     * @param courseTargetIds 需要删除的课程目标主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseTargetByCourseTargetIds(Long[] courseTargetIds)
    {
        return teachCourseTargetMapper.deleteTeachCourseTargetByCourseTargetIds(courseTargetIds);
    }

    /**
     * 删除课程目标信息
     * 
     * @param courseTargetId 课程目标主键
     * @return 结果
     */
    @Override
    public int deleteTeachCourseTargetByCourseTargetId(Long courseTargetId)
    {
        return teachCourseTargetMapper.deleteTeachCourseTargetByCourseTargetId(courseTargetId);
    }

    @Override
    public String importData(List<TeachCourseTarget> teachCourseTargetList, Boolean isUpdateSupport) {
        if (StringUtils.isNull(teachCourseTargetList) || teachCourseTargetList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        List<TeachCourseTarget> existList = selectTeachCourseTargetList(null);
        for (TeachCourseTarget importData : teachCourseTargetList)
        {
            try {

                boolean userFlag = false;
                for (TeachCourseTarget entry : existList) {
                    if (entry.getCourseTargetName().equals(importData.getCourseTargetName()) && entry.getCourseSemester().equals(importData.getCourseSemester())) {
                        userFlag = true;
                        break;
                    }
                }
                if (!userFlag) {
                    insertTeachCourseTarget(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getCourseTargetName() + " 导入成功");
                } else if (isUpdateSupport) {
                    updateTeachCourseTarget(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getCourseTargetName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getCourseTargetName() + " 已存在");
                }
            }catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、" + importData.getCourseTargetName() + " 导入失败：";
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
