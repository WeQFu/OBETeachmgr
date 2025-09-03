package com.ruoyi.teachmgr.teachmonitor.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考试监控对象 teach_exam_monitor
 * 
 * @author jzg
 * @date 2023-05-16
 */
public class TeachExamMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 监考id */
    private Long examMonitorId;

    /** 监控人ID（用户表） */
    private Long userId;

    /** 监控人部门ID（用户表） */
    private Long deptId;

    /** 监控人账号（用户表） */
    private String userName;

    /** 组卷id（组卷表） */
    private Long paperId;

    /** 组卷名（组卷表） */
    @Excel(name = "组卷名", readConverterExp = "组=卷表")
    private String paperName;

    /** 考试日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考试日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date examTime;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 违规人(真实姓名) */
    @Excel(name = "违规人(真实姓名)")
    private String cheaterName;

    /** 班违规人班级（用户表dept_id） */
    @Excel(name = "班违规人班级", readConverterExp = "用=户表dept_id")
    private Long clazzId;

    /** 违规人学号（用户表user_name） */
    @Excel(name = "违规人学号", readConverterExp = "用=户表user_name")
    private String studentNo;

    /** 违规详情 */
    @Excel(name = "违规详情")
    private String cheatDescription;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setExamMonitorId(Long examMonitorId) 
    {
        this.examMonitorId = examMonitorId;
    }

    public Long getExamMonitorId() 
    {
        return examMonitorId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setExamTime(Date examTime) 
    {
        this.examTime = examTime;
    }

    public Date getExamTime() 
    {
        return examTime;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setCheaterName(String cheaterName) 
    {
        this.cheaterName = cheaterName;
    }

    public String getCheaterName() 
    {
        return cheaterName;
    }
    public void setClazzId(Long clazzId) 
    {
        this.clazzId = clazzId;
    }

    public Long getClazzId() 
    {
        return clazzId;
    }
    public void setStudentNo(String studentNo) 
    {
        this.studentNo = studentNo;
    }

    public String getStudentNo() 
    {
        return studentNo;
    }
    public void setCheatDescription(String cheatDescription) 
    {
        this.cheatDescription = cheatDescription;
    }

    public String getCheatDescription() 
    {
        return cheatDescription;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("examMonitorId", getExamMonitorId())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("userName", getUserName())
            .append("paperId", getPaperId())
            .append("paperName", getPaperName())
            .append("examTime", getExamTime())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("cheaterName", getCheaterName())
            .append("clazzId", getClazzId())
            .append("studentNo", getStudentNo())
            .append("cheatDescription", getCheatDescription())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
