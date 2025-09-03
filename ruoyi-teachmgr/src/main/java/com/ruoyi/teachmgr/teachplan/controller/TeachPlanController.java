package com.ruoyi.teachmgr.teachplan.controller;

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
import com.ruoyi.teachmgr.teachplan.domain.TeachPlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachPlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教学计划Controller
 * 
 * @author jzg
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/teachplan/teachplan")
public class TeachPlanController extends BaseController
{
    @Autowired
    private ITeachPlanService teachPlanService;

    /**
     * 查询教学计划列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPlan teachPlan)
    {
        startPage();
        List<TeachPlan> list = teachPlanService.selectTeachPlanList(teachPlan);
        return getDataTable(list);
    }

    /**
     * 导出教学计划列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:export')")
    @Log(title = "教学计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPlan teachPlan)
    {
        List<TeachPlan> list = teachPlanService.selectTeachPlanList(teachPlan);
        ExcelUtil<TeachPlan> util = new ExcelUtil<TeachPlan>(TeachPlan.class);
        util.exportExcel(response, list, "教学计划数据");
    }

    /**
     * 获取教学计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:query')")
    @GetMapping(value = "/{planId}")
    public AjaxResult getInfo(@PathVariable("planId") Long planId)
    {
        return success(teachPlanService.selectTeachPlanByPlanId(planId));
    }

    /**
     * 新增教学计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:add')")
    @Log(title = "教学计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPlan teachPlan)
    {
        return toAjax(teachPlanService.insertTeachPlan(teachPlan));
    }

    /**
     * 修改教学计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:edit')")
    @Log(title = "教学计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPlan teachPlan)
    {
        return toAjax(teachPlanService.updateTeachPlan(teachPlan));
    }

    /**
     * 删除教学计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachplan:remove')")
    @Log(title = "教学计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{planIds}")
    public AjaxResult remove(@PathVariable Long[] planIds)
    {
        return toAjax(teachPlanService.deleteTeachPlanByPlanIds(planIds));
    }
}
