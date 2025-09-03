package com.ruoyi.teachmgr.teachexecute.controller;

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
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeHomework;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeHomeworkService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课后作业Controller
 * 
 * @author jzg
 * @date 2023-05-13
 */
@RestController
@RequestMapping("/teachexecute/homework")
public class TeachPracticeHomeworkController extends BaseController
{
    @Autowired
    private ITeachPracticeHomeworkService teachPracticeHomeworkService;

    /**
     * 查询课后作业列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPracticeHomework teachPracticeHomework)
    {
        startPage();
        List<TeachPracticeHomework> list = teachPracticeHomeworkService.selectTeachPracticeHomeworkList(teachPracticeHomework);
        return getDataTable(list);
    }

    /**
     * 导出课后作业列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:export')")
    @Log(title = "课后作业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPracticeHomework teachPracticeHomework)
    {
        List<TeachPracticeHomework> list = teachPracticeHomeworkService.selectTeachPracticeHomeworkList(teachPracticeHomework);
        ExcelUtil<TeachPracticeHomework> util = new ExcelUtil<TeachPracticeHomework>(TeachPracticeHomework.class);
        util.exportExcel(response, list, "课后作业数据");
    }

    /**
     * 获取课后作业详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:query')")
    @GetMapping(value = "/{homeworkId}")
    public AjaxResult getInfo(@PathVariable("homeworkId") Long homeworkId)
    {
        return success(teachPracticeHomeworkService.selectTeachPracticeHomeworkByHomeworkId(homeworkId));
    }

    /**
     * 新增课后作业
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:add')")
    @Log(title = "课后作业", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPracticeHomework teachPracticeHomework)
    {
        return toAjax(teachPracticeHomeworkService.insertTeachPracticeHomework(teachPracticeHomework));
    }

    /**
     * 修改课后作业
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:edit')")
    @Log(title = "课后作业", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPracticeHomework teachPracticeHomework)
    {
        return toAjax(teachPracticeHomeworkService.updateTeachPracticeHomework(teachPracticeHomework));
    }

    /**
     * 删除课后作业
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:homework:remove')")
    @Log(title = "课后作业", businessType = BusinessType.DELETE)
	@DeleteMapping("/{homeworkIds}")
    public AjaxResult remove(@PathVariable Long[] homeworkIds)
    {
        return toAjax(teachPracticeHomeworkService.deleteTeachPracticeHomeworkByHomeworkIds(homeworkIds));
    }
}
