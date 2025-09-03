package com.ruoyi.teachmgr.teachresult.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeData;
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataHead;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeDataService;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizDataHeadService;
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseEstWay;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseEstWayService;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseTargetService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.teachmgr.teachresult.domain.TeachAchievementDegree;
import com.ruoyi.teachmgr.teachresult.service.ITeachAchievementDegreeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 目标达成度Controller
 * 
 * @author jzg
 * @date 2024-03-05
 */
@RestController
@RequestMapping("/teachresult/teachanalysis")
public class TeachAchievementDegreeController extends BaseController
{
    @Autowired
    private ITeachAchievementDegreeService teachAchievementDegreeService;

    @Resource
    private ITeachCourseEstWayService teachCourseEstWayService;

    @Resource
    private ITeachQuizDataHeadService teachQuizDataHeadService;

    @Resource
    private ITeachPracticeDataService teachPracticeDataService;

    /**
     * 查询目标达成度列表
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachAchievementDegree teachAchievementDegree)
    {
        startPage();
        List<TeachAchievementDegree> list = teachAchievementDegreeService.selectTeachAchievementDegreeList(teachAchievementDegree);
        return getDataTable(list);
    }

    /**
     * 导出目标达成度列表
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:export')")
    @Log(title = "目标达成度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachAchievementDegree teachAchievementDegree)
    {
        List<TeachAchievementDegree> list = teachAchievementDegreeService.selectTeachAchievementDegreeList(teachAchievementDegree);
        ExcelUtil<TeachAchievementDegree> util = new ExcelUtil<TeachAchievementDegree>(TeachAchievementDegree.class);
        util.exportExcel(response, list, "目标达成度数据");
    }

    /**
     * 获取目标达成度详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:query')")
    @GetMapping(value = "/{achievDegreeId}")
    public AjaxResult getInfo(@PathVariable("achievDegreeId") Long achievDegreeId)
    {
        return success(teachAchievementDegreeService.selectTeachAchievementDegreeByAchievDegreeId(achievDegreeId));
    }

    /**
     * 新增目标达成度
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:add')")
    @Log(title = "目标达成度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachAchievementDegree teachAchievementDegree)
    {
        return toAjax(teachAchievementDegreeService.insertTeachAchievementDegree(teachAchievementDegree));
    }

    /**
     * 修改目标达成度
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:edit')")
    @Log(title = "目标达成度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachAchievementDegree teachAchievementDegree)
    {
        return toAjax(teachAchievementDegreeService.updateTeachAchievementDegree(teachAchievementDegree));
    }

    /**
     * 删除目标达成度
     */
    @PreAuthorize("@ss.hasPermi('teachresult:teachanalysis:remove')")
    @Log(title = "目标达成度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{achievDegreeIds}")
    public AjaxResult remove(@PathVariable Long[] achievDegreeIds)
    {
        return toAjax(teachAchievementDegreeService.deleteTeachAchievementDegreeByAchievDegreeIds(achievDegreeIds));
    }

    /**
     * 达成度计算规范：
     * 课程目标达成情况定量评价法的数据来源为课程教学大纲中支撑课程目标的各考核环节的考核结果，
     * 课程包含1-K 个考核环节，总分为 100分。若课程目标 i的达成度由 N个考核环节支撑，
     * 设第j个考核环节的总分为 Sj，学生平均分为Aj，考核环节占比为 Wj，
     * 那么课程目标i的达成度评价值按下式计算。
     * 课程目标i的达成度=(Aj*Wj之和)/(Sj*Wj之和)，其中：j为考核环节，范围为课程目标i的所有支撑环节
     *  1、查询teach_course_est_way，计算课程目标达成度分母
     *  2、查询teach_practice_data,计算实验环节得分
     *  3、查询teach_quiz_data_head,计算理论环节得分
     *  4、计算达成度
     *  查询条件中，包含学期、课程、毕业要求id、毕业指标id、课程目标id
     */
    @GetMapping("/listDegree")
    public TableDataInfo listDegree(TeachAchievementDegree teachAchievementDegree)
    {
        String semester=teachAchievementDegree.getCourseSemester();
        Long courseId=teachAchievementDegree.getCourseId();
        Long requireId=teachAchievementDegree.getGraduationRequirementId();
        Long indexId=teachAchievementDegree.getGraduationRequirementSubId();
        Long courseTargetId = teachAchievementDegree.getCourseTargetId();

        TeachCourseEstWay estWay= new TeachCourseEstWay();
        estWay.setCourseSemester(semester);
        estWay.setCourseId(courseId);
        estWay.setGraduationRequirementId(requireId);
        estWay.setGraduationRequirementSubId(indexId);
        estWay.setCourseTargetId(courseTargetId);
        List<TeachCourseEstWay> estWayList=getCourseEstWayList(estWay);

        TeachPracticeData practiceData=new TeachPracticeData();
        practiceData.setPracticeSemester(semester);
        practiceData.setCourseId(courseId);
        practiceData.setCourseTargertId(courseTargetId);
        List<TeachPracticeData> practiceDataList=teachPracticeDataService.selectTeachPracticeDataList(practiceData);

        TeachQuizDataHead quizDataHead=new TeachQuizDataHead();
        quizDataHead.setQuizSemester(semester);

        startPage();
        List<TeachAchievementDegree> list = teachAchievementDegreeService.selectTeachAchievementDegreeList(teachAchievementDegree);
        return getDataTable(list);
    }

    /**
     * 获取课程目标达成度教学计划数据
     * @param teachCourseEstWay
     * @return
     */
    public List<TeachCourseEstWay> getCourseEstWayList(TeachCourseEstWay teachCourseEstWay){
        return teachCourseEstWayService.selectTeachCourseEstWayList(teachCourseEstWay);
    }

    /**
     * 获取实验成绩数据
     * @param teachPracticeData
     * @return
     */
    public List<TeachPracticeData> getPracticeDataList(TeachPracticeData teachPracticeData){
        return teachPracticeDataService.selectTeachPracticeDataList(teachPracticeData);
    }

    /**
     * 获取理论考试成绩
     * @param teachQuizDataHead
     * @return
     */
    public List<TeachQuizDataHead> getQuizDataList(TeachQuizDataHead teachQuizDataHead){
        return teachQuizDataHeadService.selectTeachQuizDataHeadList(teachQuizDataHead);
    }

}
