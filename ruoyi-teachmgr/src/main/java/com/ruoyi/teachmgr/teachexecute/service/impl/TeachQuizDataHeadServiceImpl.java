package com.ruoyi.teachmgr.teachexecute.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachexecute.mapper.TeachQuizDataHeadMapper;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataHead;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizDataHeadService;

/**
 * 考试阅卷Service业务层处理
 * 
 * @author jzg
 * @date 2023-06-06
 */
@Service
public class TeachQuizDataHeadServiceImpl implements ITeachQuizDataHeadService 
{
    @Autowired
    private TeachQuizDataHeadMapper teachQuizDataHeadMapper;

    /**
     * 查询考试阅卷
     * 
     * @param quizDataHeadId 考试阅卷主键
     * @return 考试阅卷
     */
    @Override
    public TeachQuizDataHead selectTeachQuizDataHeadByQuizDataHeadId(Long quizDataHeadId)
    {
        return teachQuizDataHeadMapper.selectTeachQuizDataHeadByQuizDataHeadId(quizDataHeadId);
    }

    /**
     * 查询考试阅卷列表
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 考试阅卷
     */
    @Override
    public List<TeachQuizDataHead> selectTeachQuizDataHeadList(TeachQuizDataHead teachQuizDataHead)
    {
        return teachQuizDataHeadMapper.selectTeachQuizDataHeadList(teachQuizDataHead);
    }

    /**
     * 新增考试阅卷
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 结果
     */
    @Override
    public int insertTeachQuizDataHead(TeachQuizDataHead teachQuizDataHead)
    {
        teachQuizDataHead.setCreateTime(DateUtils.getNowDate());
        return teachQuizDataHeadMapper.insertTeachQuizDataHead(teachQuizDataHead);
    }

    /**
     * 修改考试阅卷
     * 
     * @param teachQuizDataHead 考试阅卷
     * @return 结果
     */
    @Override
    public int updateTeachQuizDataHead(TeachQuizDataHead teachQuizDataHead)
    {
        teachQuizDataHead.setUpdateTime(DateUtils.getNowDate());
        return teachQuizDataHeadMapper.updateTeachQuizDataHead(teachQuizDataHead);
    }

    /**
     * 批量删除考试阅卷
     * 
     * @param quizDataHeadIds 需要删除的考试阅卷主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizDataHeadByQuizDataHeadIds(Long[] quizDataHeadIds)
    {
        return teachQuizDataHeadMapper.deleteTeachQuizDataHeadByQuizDataHeadIds(quizDataHeadIds);
    }

    /**
     * 删除考试阅卷信息
     * 
     * @param quizDataHeadId 考试阅卷主键
     * @return 结果
     */
    @Override
    public int deleteTeachQuizDataHeadByQuizDataHeadId(Long quizDataHeadId)
    {
        return teachQuizDataHeadMapper.deleteTeachQuizDataHeadByQuizDataHeadId(quizDataHeadId);
    }

    @Override
    public String importData(List<TeachQuizDataHead> teachQuizDataHeadList, Boolean isUpdateSupport) {
        if (StringUtils.isNull(teachQuizDataHeadList) || teachQuizDataHeadList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        List<TeachQuizDataHead> existList = selectTeachQuizDataHeadList(null);
        for (TeachQuizDataHead importData : teachQuizDataHeadList)
        {
            try {

                boolean userFlag = false;
                for (TeachQuizDataHead entry : existList) {
                    if (entry.getPaperName().equals(importData.getPaperName())) {
                        userFlag = true;
                        break;
                    }
                }
                if (!userFlag) {
                    insertTeachQuizDataHead(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPaperName() + " 导入成功");
                } else if (isUpdateSupport) {
                    updateTeachQuizDataHead(importData);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、数据 " + importData.getPaperName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、数据 " + importData.getPaperName() + " 已存在");
                }
            }catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、" + importData.getPaperName() + " 导入失败：";
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
