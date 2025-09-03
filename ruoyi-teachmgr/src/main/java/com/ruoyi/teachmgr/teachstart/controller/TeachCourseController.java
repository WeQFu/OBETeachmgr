package com.ruoyi.teachmgr.teachstart.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.teachmgr.teachstart.domain.TeachCourse;
import com.ruoyi.teachmgr.teachstart.service.ITeachCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程管理Controller
 * 
 * @author jzg
 * @date 2023-06-08
 */
@RestController
@RequestMapping("/teachstart/course")
public class TeachCourseController extends BaseController
{
    @Autowired
    private ITeachCourseService teachCourseService;

    /**
     * 查询课程管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachCourse teachCourse)
    {
        startPage();
        List<TeachCourse> list = teachCourseService.selectTeachCourseList(teachCourse);
        return getDataTable(list);
    }

    /**
     * 导出课程管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:export')")
    @Log(title = "课程管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachCourse teachCourse)
    {
        List<TeachCourse> list = teachCourseService.selectTeachCourseList(teachCourse);
        ExcelUtil<TeachCourse> util = new ExcelUtil<TeachCourse>(TeachCourse.class);
        util.exportExcel(response, list, "课程管理数据");
    }

    /**
     * 获取课程管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:query')")
    @GetMapping(value = "/{courseId}")
    public AjaxResult getInfo(@PathVariable("courseId") Long courseId)
    {
        return success(teachCourseService.selectTeachCourseByCourseId(courseId));
    }

    /**
     * 新增课程管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:add')")
    @Log(title = "课程管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachCourse teachCourse)
    {
        return toAjax(teachCourseService.insertTeachCourse(teachCourse));
    }

    /**
     * 修改课程管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:edit')")
    @Log(title = "课程管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachCourse teachCourse)
    {
        return toAjax(teachCourseService.updateTeachCourse(teachCourse));
    }

    /**
     * 删除课程管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:course:remove')")
    @Log(title = "课程管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseIds}")
    public AjaxResult remove(@PathVariable Long[] courseIds)
    {
        return toAjax(teachCourseService.deleteTeachCourseByCourseIds(courseIds));
    }
}
