package com.ruoyi.teachmgr.teachstart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程管理对象 teach_course
 * 
 * @author jzg
 * @date 2024-03-06
 */
public class TeachCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程代码 */
    @Excel(name = "课程代码")
    private String courseCode;

    /** 课程学分 */
    @Excel(name = "课程学分")
    private Double courseCredit;

    /** 课程学时 */
    @Excel(name = "课程学时")
    private Long coursePeriod;

    /** 开课学期 */
    @Excel(name = "开课学期")
    private String courseSemester;

    /** 课程介绍 */
    @Excel(name = "课程介绍")
    private String courseIntroduce;

    /** 英文介绍 */
    @Excel(name = "英文介绍")
    private String courseEnIntroduce;

    /** 课程类别（必须、限选、选修、基础） */
    @Excel(name = "课程类别", readConverterExp = "必=须、限选、选修、基础")
    private String courseType;

    /** 所属专业 */
    @Excel(name = "所属专业")
    private Long specialityId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String specialityName;

    /** 所选教材 */
    @Excel(name = "所选教材")
    private String choiceBooks;

    /** 参考教材 */
    @Excel(name = "参考教材")
    private String referenceBooks;

    /** 先修课程 */
    @Excel(name = "先修课程")
    private String aheadCourse;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

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
    public void setCourseCode(String courseCode) 
    {
        this.courseCode = courseCode;
    }

    public String getCourseCode() 
    {
        return courseCode;
    }
    public void setCourseCredit(Double courseCredit) 
    {
        this.courseCredit = courseCredit;
    }

    public Double getCourseCredit() 
    {
        return courseCredit;
    }
    public void setCoursePeriod(Long coursePeriod) 
    {
        this.coursePeriod = coursePeriod;
    }

    public Long getCoursePeriod() 
    {
        return coursePeriod;
    }
    public void setCourseSemester(String courseSemester) 
    {
        this.courseSemester = courseSemester;
    }

    public String getCourseSemester() 
    {
        return courseSemester;
    }
    public void setCourseIntroduce(String courseIntroduce) 
    {
        this.courseIntroduce = courseIntroduce;
    }

    public String getCourseIntroduce() 
    {
        return courseIntroduce;
    }
    public void setCourseEnIntroduce(String courseEnIntroduce) 
    {
        this.courseEnIntroduce = courseEnIntroduce;
    }

    public String getCourseEnIntroduce() 
    {
        return courseEnIntroduce;
    }
    public void setCourseType(String courseType) 
    {
        this.courseType = courseType;
    }

    public String getCourseType() 
    {
        return courseType;
    }
    public void setSpecialityId(Long specialityId) 
    {
        this.specialityId = specialityId;
    }

    public Long getSpecialityId() 
    {
        return specialityId;
    }
    public void setSpecialityName(String specialityName) 
    {
        this.specialityName = specialityName;
    }

    public String getSpecialityName() 
    {
        return specialityName;
    }
    public void setChoiceBooks(String choiceBooks) 
    {
        this.choiceBooks = choiceBooks;
    }

    public String getChoiceBooks() 
    {
        return choiceBooks;
    }
    public void setReferenceBooks(String referenceBooks) 
    {
        this.referenceBooks = referenceBooks;
    }

    public String getReferenceBooks() 
    {
        return referenceBooks;
    }
    public void setAheadCourse(String aheadCourse) 
    {
        this.aheadCourse = aheadCourse;
    }

    public String getAheadCourse() 
    {
        return aheadCourse;
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
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseCode", getCourseCode())
            .append("courseCredit", getCourseCredit())
            .append("coursePeriod", getCoursePeriod())
            .append("courseSemester", getCourseSemester())
            .append("courseIntroduce", getCourseIntroduce())
            .append("courseEnIntroduce", getCourseEnIntroduce())
            .append("courseType", getCourseType())
            .append("specialityId", getSpecialityId())
            .append("specialityName", getSpecialityName())
            .append("choiceBooks", getChoiceBooks())
            .append("referenceBooks", getReferenceBooks())
            .append("aheadCourse", getAheadCourse())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
