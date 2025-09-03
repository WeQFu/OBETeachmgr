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
import com.ruoyi.teachmgr.teachmonitor.domain.TeachPlanMonitor;
import com.ruoyi.teachmgr.teachmonitor.service.ITeachPlanMonitorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 计划监控Controller
 * 
 * @author jzg
 * @date 2023-05-16
 */
@RestController
@RequestMapping("/teachmonitor/monitor")
public class TeachPlanMonitorController extends BaseController
{
    @Autowired
    private ITeachPlanMonitorService teachPlanMonitorService;

    /**
     * 查询计划监控列表
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPlanMonitor teachPlanMonitor)
    {
        startPage();
        List<TeachPlanMonitor> list = teachPlanMonitorService.selectTeachPlanMonitorList(teachPlanMonitor);
        return getDataTable(list);
    }

    /**
     * 导出计划监控列表
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:export')")
    @Log(title = "计划监控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPlanMonitor teachPlanMonitor)
    {
        List<TeachPlanMonitor> list = teachPlanMonitorService.selectTeachPlanMonitorList(teachPlanMonitor);
        ExcelUtil<TeachPlanMonitor> util = new ExcelUtil<TeachPlanMonitor>(TeachPlanMonitor.class);
        util.exportExcel(response, list, "计划监控数据");
    }

    /**
     * 获取计划监控详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:query')")
    @GetMapping(value = "/{planMonitorId}")
    public AjaxResult getInfo(@PathVariable("planMonitorId") Long planMonitorId)
    {
        return success(teachPlanMonitorService.selectTeachPlanMonitorByPlanMonitorId(planMonitorId));
    }

    /**
     * 新增计划监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:add')")
    @Log(title = "计划监控", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPlanMonitor teachPlanMonitor)
    {
        return toAjax(teachPlanMonitorService.insertTeachPlanMonitor(teachPlanMonitor));
    }

    /**
     * 修改计划监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:edit')")
    @Log(title = "计划监控", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPlanMonitor teachPlanMonitor)
    {
        return toAjax(teachPlanMonitorService.updateTeachPlanMonitor(teachPlanMonitor));
    }

    /**
     * 删除计划监控
     */
    @PreAuthorize("@ss.hasPermi('teachmonitor:monitor:remove')")
    @Log(title = "计划监控", businessType = BusinessType.DELETE)
	@DeleteMapping("/{planMonitorIds}")
    public AjaxResult remove(@PathVariable Long[] planMonitorIds)
    {
        return toAjax(teachPlanMonitorService.deleteTeachPlanMonitorByPlanMonitorIds(planMonitorIds));
    }
}
