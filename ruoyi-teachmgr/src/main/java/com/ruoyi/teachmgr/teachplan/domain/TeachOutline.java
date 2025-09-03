package com.ruoyi.teachmgr.teachplan.domain;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.teachmgr.teachplan.domain.vo.TeachOutlineVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 课程大纲对象 teach_outline
 * 
 * @author jzg
 * @date 2024-03-06
 */
public class TeachOutline extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long outlineId;

    /** 学期 */
    @Excel(name = "学期")
    private String outlineSemester;

    /** 大纲名称 */
    @Excel(name = "大纲名称")
    private String outlineName;

    /** 基本信息 */
    @Excel(name = "基本信息")
    private String outlineInfo;

    /** 课程id */
    @Excel(name = "课程id")
    private Long courseId;

    /** 课程简介 */
    @Excel(name = "课程简介")
    private String courseIntroduce;

    /** 选课建议 */
    @Excel(name = "选课建议")
    private String selectPropose;

    /** 毕业要求ids */
    @Excel(name = "毕业要求ids")
    private String requirementIds;

    /** 毕业指标ids */
    @Excel(name = "毕业指标ids")
    private String indexIds;

    /** 课程目标ids */
    @Excel(name = "课程目标ids")
    private String courseTargetIds;

    /** 目标达成id */
    @Excel(name = "目标达成id")
    private Long estWayId;

    /** 章ids */
    @Excel(name = "章ids")
    private String courseChapterIds;

    /** 实践ids */
    @Excel(name = "实践ids")
    private String practiceIds;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setOutlineId(Long outlineId) 
    {
        this.outlineId = outlineId;
    }

    public Long getOutlineId() 
    {
        return outlineId;
    }
    public void setOutlineSemester(String outlineSemester) 
    {
        this.outlineSemester = outlineSemester;
    }

    public String getOutlineSemester() 
    {
        return outlineSemester;
    }
    public void setOutlineName(String outlineName) 
    {
        this.outlineName = outlineName;
    }

    public String getOutlineName() 
    {
        return outlineName;
    }
    public void setOutlineInfo(String outlineInfo) 
    {
        this.outlineInfo = outlineInfo;
    }

    public String getOutlineInfo() 
    {
        return outlineInfo;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseIntroduce(String courseIntroduce) 
    {
        this.courseIntroduce = courseIntroduce;
    }

    public String getCourseIntroduce() 
    {
        return courseIntroduce;
    }
    public void setSelectPropose(String selectPropose) 
    {
        this.selectPropose = selectPropose;
    }

    public String getSelectPropose() 
    {
        return selectPropose;
    }
    public void setRequirementIds(String requirementIds) 
    {
        this.requirementIds = requirementIds;
    }

    public String getRequirementIds() 
    {
        return requirementIds;
    }
    public void setIndexIds(String indexIds) 
    {
        this.indexIds = indexIds;
    }

    public String getIndexIds() 
    {
        return indexIds;
    }
    public void setCourseTargetIds(String courseTargetIds) 
    {
        this.courseTargetIds = courseTargetIds;
    }

    public String getCourseTargetIds() 
    {
        return courseTargetIds;
    }
    public void setEstWayId(Long estWayId) 
    {
        this.estWayId = estWayId;
    }

    public Long getEstWayId() 
    {
        return estWayId;
    }
    public void setCourseChapterIds(String courseChapterIds) 
    {
        this.courseChapterIds = courseChapterIds;
    }

    public String getCourseChapterIds() 
    {
        return courseChapterIds;
    }
    public void setPracticeIds(String practiceIds) 
    {
        this.practiceIds = practiceIds;
    }

    public String getPracticeIds() 
    {
        return practiceIds;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public TeachOutline() {
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("outlineId", getOutlineId())
            .append("outlineSemester", getOutlineSemester())
            .append("outlineName", getOutlineName())
            .append("outlineInfo", getOutlineInfo())
            .append("courseId", getCourseId())
            .append("courseIntroduce", getCourseIntroduce())
            .append("selectPropose", getSelectPropose())
            .append("requirementIds", getRequirementIds())
            .append("indexIds", getIndexIds())
            .append("courseTargetIds", getCourseTargetIds())
            .append("estWayId", getEstWayId())
            .append("courseChapterIds", getCourseChapterIds())
            .append("practiceIds", getPracticeIds())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }

//    public TeachOutline(TeachOutlineVo s, HashMap<String, ArrayList<SysDictData>> dictmap){
//        this.outlineId = s.getOutlineId();
//        this.outlineName = s.getOutlineName();
//        this.courseChapterIds = s.getCourseChapterIds();
//        this.courseIntroduce = s.getCourseIntroduce();
//        this.courseId = s.getCourseId();
//        this.requirementIds = s.getRequirementIds();
//        this.indexIds = s.getIndexIds();
//        this.courseTargetIds = s.getCourseTargetIds();
//        //处理学期字典
//        for( SysDictData dictData:dictmap.get("teachmgr_semester")){
//            if(dictData.getDictValue().equals(s.getOutlineSemester())){
//                this.outlineSemester =dictData.getDictLabel();
//                break;
//            }
//        }
//
//    }

}
