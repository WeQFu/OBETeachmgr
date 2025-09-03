package com.ruoyi.teachmgr.teachstart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 培养目标对象 teach_traintarget
 * 
 * @author jzg
 * @date 2024-03-03
 */
public class TeachTraintarget extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long coursetargetId;

    /** 学院id */
    @Excel(name = "学院id")
    private Long instituteDeptId;

    /** 学院名称 */
    @Excel(name = "学院名称")
    private String instituteName;

    /** 专业id */
    @Excel(name = "专业id")
    private Long spelityDeptId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String specialityName;

    /** 一级目标id */
    @Excel(name = "一级目标id")
    private Long trainTarget1Id;

    /** 一级目标名称 */
    @Excel(name = "一级目标名称")
    private String trainTarget1Name;

    /** 二级目标id */
    @Excel(name = "二级目标id")
    private Long trainTarget2Id;

    /** 二级目标名称 */
    @Excel(name = "二级目标名称")
    private String trainTarget2Name;

    /** 课程id */
    @Excel(name = "课程id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 开课学期 */
    @Excel(name = "开课学期")
    private String courseSemester;

    /** 培养目标名称 */
    @Excel(name = "培养目标名称")
    private String coursetargetName;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setCoursetargetId(Long coursetargetId) 
    {
        this.coursetargetId = coursetargetId;
    }

    public Long getCoursetargetId() 
    {
        return coursetargetId;
    }
    public void setInstituteDeptId(Long instituteDeptId) 
    {
        this.instituteDeptId = instituteDeptId;
    }

    public Long getInstituteDeptId() 
    {
        return instituteDeptId;
    }
    public void setInstituteName(String instituteName) 
    {
        this.instituteName = instituteName;
    }

    public String getInstituteName() 
    {
        return instituteName;
    }
    public void setSpelityDeptId(Long spelityDeptId) 
    {
        this.spelityDeptId = spelityDeptId;
    }

    public Long getSpelityDeptId() 
    {
        return spelityDeptId;
    }
    public void setSpecialityName(String specialityName) 
    {
        this.specialityName = specialityName;
    }

    public String getSpecialityName() 
    {
        return specialityName;
    }
    public void setTrainTarget1Id(Long trainTarget1Id) 
    {
        this.trainTarget1Id = trainTarget1Id;
    }

    public Long getTrainTarget1Id() 
    {
        return trainTarget1Id;
    }
    public void setTrainTarget1Name(String trainTarget1Name) 
    {
        this.trainTarget1Name = trainTarget1Name;
    }

    public String getTrainTarget1Name() 
    {
        return trainTarget1Name;
    }
    public void setTrainTarget2Id(Long trainTarget2Id) 
    {
        this.trainTarget2Id = trainTarget2Id;
    }

    public Long getTrainTarget2Id() 
    {
        return trainTarget2Id;
    }
    public void setTrainTarget2Name(String trainTarget2Name) 
    {
        this.trainTarget2Name = trainTarget2Name;
    }

    public String getTrainTarget2Name() 
    {
        return trainTarget2Name;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseSemester(String courseSemester) 
    {
        this.courseSemester = courseSemester;
    }

    public String getCourseSemester() 
    {
        return courseSemester;
    }
    public void setCoursetargetName(String coursetargetName) 
    {
        this.coursetargetName = coursetargetName;
    }

    public String getCoursetargetName() 
    {
        return coursetargetName;
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
            .append("coursetargetId", getCoursetargetId())
            .append("instituteDeptId", getInstituteDeptId())
            .append("instituteName", getInstituteName())
            .append("spelityDeptId", getSpelityDeptId())
            .append("specialityName", getSpecialityName())
            .append("trainTarget1Id", getTrainTarget1Id())
            .append("trainTarget1Name", getTrainTarget1Name())
            .append("trainTarget2Id", getTrainTarget2Id())
            .append("trainTarget2Name", getTrainTarget2Name())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseSemester", getCourseSemester())
            .append("coursetargetName", getCoursetargetName())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
