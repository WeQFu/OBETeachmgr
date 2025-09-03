package com.ruoyi.teachmgr.teachmonitor.controller;

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
import com.ruoyi.teachmgr.teachmonitor.domain.TeachExamMonitor;
import com.ruoyi.teachmgr.teachmonitor.service.ITeachExamMonitorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考试监控Controller
 * 
 * @author jzg
 * @date 2023-05-16
 */
@RestController
@RequestMapping("/teachmonitor/quizmonitor")
public class TeachExamMonitorController extends BaseController
{
    @Autowired
    private ITeachExamMonitorService teachExamMonitorService;

    /**
     * 查询考试监控列表
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachExamMonitor teachExamMonitor)
    {
        startPage();
        List<TeachExamMonitor> list = teachExamMonitorService.selectTeachExamMonitorList(teachExamMonitor);
        return getDataTable(list);
    }

    /**
     * 导出考试监控列表
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:export')")
    @Log(title = "考试监控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachExamMonitor teachExamMonitor)
    {
        List<TeachExamMonitor> list = teachExamMonitorService.selectTeachExamMonitorList(teachExamMonitor);
        ExcelUtil<TeachExamMonitor> util = new ExcelUtil<TeachExamMonitor>(TeachExamMonitor.class);
        util.exportExcel(response, list, "考试监控数据");
    }

    /**
     * 获取考试监控详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:query')")
    @GetMapping(value = "/{examMonitorId}")
    public AjaxResult getInfo(@PathVariable("examMonitorId") Long examMonitorId)
    {
        return success(teachExamMonitorService.selectTeachExamMonitorByExamMonitorId(examMonitorId));
    }

    /**
     * 新增考试监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:add')")
    @Log(title = "考试监控", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachExamMonitor teachExamMonitor)
    {
        return toAjax(teachExamMonitorService.insertTeachExamMonitor(teachExamMonitor));
    }

    /**
     * 修改考试监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:edit')")
    @Log(title = "考试监控", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachExamMonitor teachExamMonitor)
    {
        return toAjax(teachExamMonitorService.updateTeachExamMonitor(teachExamMonitor));
    }

    /**
     * 删除考试监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:quizmonitor:remove')")
    @Log(title = "考试监控", businessType = BusinessType.DELETE)
	@DeleteMapping("/{examMonitorIds}")
    public AjaxResult remove(@PathVariable Long[] examMonitorIds)
    {
        return toAjax(teachExamMonitorService.deleteTeachExamMonitorByExamMonitorIds(examMonitorIds));
    }
}
