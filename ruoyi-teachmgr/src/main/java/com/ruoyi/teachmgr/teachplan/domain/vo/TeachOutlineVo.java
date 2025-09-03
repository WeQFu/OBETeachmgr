package com.ruoyi.teachmgr.teachplan.domain.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.teachmgr.teachplan.domain.TeachOutline;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author jzg
 * @ClassName TeachOutlineVo
 * @description
 * @Version
 * @create: 2024-03-06
 */
public class TeachOutlineVo {
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

    public Long getOutlineId() {
        return outlineId;
    }

    public void setOutlineId(Long outlineId) {
        this.outlineId = outlineId;
    }

    public String getOutlineSemester() {
        return outlineSemester;
    }

    public void setOutlineSemester(String outlineSemester) {
        this.outlineSemester = outlineSemester;
    }

    public String getOutlineName() {
        return outlineName;
    }

    public void setOutlineName(String outlineName) {
        this.outlineName = outlineName;
    }

    public String getOutlineInfo() {
        return outlineInfo;
    }

    public void setOutlineInfo(String outlineInfo) {
        this.outlineInfo = outlineInfo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseIntroduce() {
        return courseIntroduce;
    }

    public void setCourseIntroduce(String courseIntroduce) {
        this.courseIntroduce = courseIntroduce;
    }

    public String getSelectPropose() {
        return selectPropose;
    }

    public void setSelectPropose(String selectPropose) {
        this.selectPropose = selectPropose;
    }

    public String getRequirementIds() {
        return requirementIds;
    }

    public void setRequirementIds(String requirementIds) {
        this.requirementIds = requirementIds;
    }

    public String getIndexIds() {
        return indexIds;
    }

    public void setIndexIds(String indexIds) {
        this.indexIds = indexIds;
    }

    public String getCourseTargetIds() {
        return courseTargetIds;
    }

    public void setCourseTargetIds(String courseTargetIds) {
        this.courseTargetIds = courseTargetIds;
    }

    public Long getEstWayId() {
        return estWayId;
    }

    public void setEstWayId(Long estWayId) {
        this.estWayId = estWayId;
    }

    public String getCourseChapterIds() {
        return courseChapterIds;
    }

    public void setCourseChapterIds(String courseChapterIds) {
        this.courseChapterIds = courseChapterIds;
    }

    public String getPracticeIds() {
        return practiceIds;
    }

    public void setPracticeIds(String practiceIds) {
        this.practiceIds = practiceIds;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }


}
