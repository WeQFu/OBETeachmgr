package com.ruoyi.teachmgr.teachmonitor.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 期初教学检查对象 teach_start_monitor
 * 
 * @author jzg
 * @date 2023-06-08
 */
public class TeachStartMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long startMonitorId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String userName;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String nickName;

    /** 用户职称（教授、副教授、讲师、助教） */
    @Excel(name = "用户职称", readConverterExp = "教=授、副教授、讲师、助教")
    private String userTitle;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String email;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phonenumber;

    /** 用户性别（0男 1女 2未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 教学准备情况（新教案比例） */
    @Excel(name = "教学准备情况", readConverterExp = "新=教案比例")
    private Double prepareInfo;

    /** 进度计划是否拟定（0是 1否） */
    @Excel(name = "进度计划是否拟定", readConverterExp = "0=是,1=否")
    private String progressPlan;

    /** 每周作业量 */
    @Excel(name = "每周作业量")
    private Integer homeworkNum;

    /** 作业拟定批改比例 */
    @Excel(name = "作业拟定批改比例")
    private Double homeworkReviewRate;

    /** 拟定辅导时间地点和方式 */
    @Excel(name = "拟定辅导时间地点和方式")
    private String counselInfo;

    /** 考试形式（0开卷 1闭卷 2大作业） */
    @Excel(name = "考试形式", readConverterExp = "0=开卷,1=闭卷,2=大作业")
    private String quizForm;

    /** 教材名称出版社等级 */
    @Excel(name = "教材名称出版社等级")
    private String bookInfo;

    /** 建议 */
    @Excel(name = "建议")
    private String suggestion;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String verifyInfo;

    /** 审核人 */
    @Excel(name = "审核人")
    private String verifyPerson;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 期初教学检查子信息 */
    private List<TeachStartMonitorSub> teachStartMonitorSubList;

    public void setStartMonitorId(Long startMonitorId) 
    {
        this.startMonitorId = startMonitorId;
    }

    public Long getStartMonitorId() 
    {
        return startMonitorId;
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
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setUserTitle(String userTitle) 
    {
        this.userTitle = userTitle;
    }

    public String getUserTitle() 
    {
        return userTitle;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setPrepareInfo(Double prepareInfo) 
    {
        this.prepareInfo = prepareInfo;
    }

    public Double getPrepareInfo() 
    {
        return prepareInfo;
    }
    public void setProgressPlan(String progressPlan) 
    {
        this.progressPlan = progressPlan;
    }

    public String getProgressPlan() 
    {
        return progressPlan;
    }
    public void setHomeworkNum(Integer homeworkNum) 
    {
        this.homeworkNum = homeworkNum;
    }

    public Integer getHomeworkNum() 
    {
        return homeworkNum;
    }
    public void setHomeworkReviewRate(Double homeworkReviewRate) 
    {
        this.homeworkReviewRate = homeworkReviewRate;
    }

    public Double getHomeworkReviewRate() 
    {
        return homeworkReviewRate;
    }
    public void setCounselInfo(String counselInfo) 
    {
        this.counselInfo = counselInfo;
    }

    public String getCounselInfo() 
    {
        return counselInfo;
    }
    public void setQuizForm(String quizForm) 
    {
        this.quizForm = quizForm;
    }

    public String getQuizForm() 
    {
        return quizForm;
    }
    public void setBookInfo(String bookInfo) 
    {
        this.bookInfo = bookInfo;
    }

    public String getBookInfo() 
    {
        return bookInfo;
    }
    public void setSuggestion(String suggestion) 
    {
        this.suggestion = suggestion;
    }

    public String getSuggestion() 
    {
        return suggestion;
    }
    public void setVerifyInfo(String verifyInfo) 
    {
        this.verifyInfo = verifyInfo;
    }

    public String getVerifyInfo() 
    {
        return verifyInfo;
    }
    public void setVerifyPerson(String verifyPerson) 
    {
        this.verifyPerson = verifyPerson;
    }

    public String getVerifyPerson() 
    {
        return verifyPerson;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public List<TeachStartMonitorSub> getTeachStartMonitorSubList()
    {
        return teachStartMonitorSubList;
    }

    public void setTeachStartMonitorSubList(List<TeachStartMonitorSub> teachStartMonitorSubList)
    {
        this.teachStartMonitorSubList = teachStartMonitorSubList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("startMonitorId", getStartMonitorId())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("userName", getUserName())
            .append("nickName", getNickName())
            .append("userTitle", getUserTitle())
            .append("email", getEmail())
            .append("phonenumber", getPhonenumber())
            .append("sex", getSex())
            .append("prepareInfo", getPrepareInfo())
            .append("progressPlan", getProgressPlan())
            .append("homeworkNum", getHomeworkNum())
            .append("homeworkReviewRate", getHomeworkReviewRate())
            .append("counselInfo", getCounselInfo())
            .append("quizForm", getQuizForm())
            .append("bookInfo", getBookInfo())
            .append("suggestion", getSuggestion())
            .append("verifyInfo", getVerifyInfo())
            .append("verifyPerson", getVerifyPerson())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("teachStartMonitorSubList", getTeachStartMonitorSubList())
            .toString();
    }
}
