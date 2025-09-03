package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachTraintargetMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachTraintarget;
import com.ruoyi.teachmgr.teachstart.service.ITeachTraintargetService;

/**
 * 培养目标Service业务层处理
 * 
 * @author jzg
 * @date 2024-03-03
 */
@Service
public class TeachTraintargetServiceImpl implements ITeachTraintargetService 
{
    @Autowired
    private TeachTraintargetMapper teachTraintargetMapper;

    /**
     * 查询培养目标
     * 
     * @param coursetargetId 培养目标主键
     * @return 培养目标
     */
    @Override
    public TeachTraintarget selectTeachTraintargetByCoursetargetId(Long coursetargetId)
    {
        return teachTraintargetMapper.selectTeachTraintargetByCoursetargetId(coursetargetId);
    }

    /**
     * 查询培养目标列表
     * 
     * @param teachTraintarget 培养目标
     * @return 培养目标
     */
    @Override
    public List<TeachTraintarget> selectTeachTraintargetList(TeachTraintarget teachTraintarget)
    {
        return teachTraintargetMapper.selectTeachTraintargetList(teachTraintarget);
    }

    /**
     * 新增培养目标
     * 
     * @param teachTraintarget 培养目标
     * @return 结果
     */
    @Override
    public int insertTeachTraintarget(TeachTraintarget teachTraintarget)
    {
        teachTraintarget.setCreateTime(DateUtils.getNowDate());
        return teachTraintargetMapper.insertTeachTraintarget(teachTraintarget);
    }

    /**
     * 修改培养目标
     * 
     * @param teachTraintarget 培养目标
     * @return 结果
     */
    @Override
    public int updateTeachTraintarget(TeachTraintarget teachTraintarget)
    {
        teachTraintarget.setUpdateTime(DateUtils.getNowDate());
        return teachTraintargetMapper.updateTeachTraintarget(teachTraintarget);
    }

    /**
     * 批量删除培养目标
     * 
     * @param coursetargetIds 需要删除的培养目标主键
     * @return 结果
     */
    @Override
    public int deleteTeachTraintargetByCoursetargetIds(Long[] coursetargetIds)
    {
        return teachTraintargetMapper.deleteTeachTraintargetByCoursetargetIds(coursetargetIds);
    }

    /**
     * 删除培养目标信息
     * 
     * @param coursetargetId 培养目标主键
     * @return 结果
     */
    @Override
    public int deleteTeachTraintargetByCoursetargetId(Long coursetargetId)
    {
        return teachTraintargetMapper.deleteTeachTraintargetByCoursetargetId(coursetargetId);
    }

//导入数据
    @Override
    public String importData(List<TeachTraintarget> teachTraintargetList, Boolean isUpdateSupport) {
        if (StringUtils.isNull(teachTraintargetList) || teachTraintargetList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        List<TeachTraintarget> existList = selectTeachTraintargetList(null);
        for (TeachTraintarget importData : teachTraintargetList)
        {
            try {

                boolean userFlag = false;
                for (TeachTraintarget entry : existList) {
                    if (entry.getCoursetargetName().equals(importData.getCoursetargetName())) {
                        userFlag = true;
                        break;
                    }
                }
                if (!userFlag) {
                    insertTeachTraintarget(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getCoursetargetName() + " 导入成功");
                } else if (isUpdateSupport) {
                    updateTeachTraintarget(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getCoursetargetName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getCoursetargetName() + " 已存在");
                }
            }catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、" + importData.getCoursetargetName() + " 导入失败：";
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
