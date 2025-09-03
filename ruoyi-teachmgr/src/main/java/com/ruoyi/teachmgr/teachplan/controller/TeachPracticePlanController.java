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
import com.ruoyi.teachmgr.teachplan.domain.TeachPracticePlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachPracticePlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实践环节Controller
 * 
 * @author jzg
 * @date 2023-06-13
 */
@RestController
@RequestMapping("/teachplan/practiceplan")
public class TeachPracticePlanController extends BaseController
{
    @Autowired
    private ITeachPracticePlanService teachPracticePlanService;

    /**
     * 查询实践环节列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPracticePlan teachPracticePlan)
    {
        startPage();
        List<TeachPracticePlan> list = teachPracticePlanService.selectTeachPracticePlanList(teachPracticePlan);
        return getDataTable(list);
    }

    /**
     * 导出实践环节列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:export')")
    @Log(title = "实践环节", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPracticePlan teachPracticePlan)
    {
        List<TeachPracticePlan> list = teachPracticePlanService.selectTeachPracticePlanList(teachPracticePlan);
        ExcelUtil<TeachPracticePlan> util = new ExcelUtil<TeachPracticePlan>(TeachPracticePlan.class);
        util.exportExcel(response, list, "实践环节数据");
    }

    /**
     * 获取实践环节详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:query')")
    @GetMapping(value = "/{practicePlanId}")
    public AjaxResult getInfo(@PathVariable("practicePlanId") Long practicePlanId)
    {
        return success(teachPracticePlanService.selectTeachPracticePlanByPracticePlanId(practicePlanId));
    }

    /**
     * 新增实践环节
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:add')")
    @Log(title = "实践环节", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPracticePlan teachPracticePlan)
    {
        return toAjax(teachPracticePlanService.insertTeachPracticePlan(teachPracticePlan));
    }

    /**
     * 修改实践环节
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:edit')")
    @Log(title = "实践环节", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPracticePlan teachPracticePlan)
    {
        return toAjax(teachPracticePlanService.updateTeachPracticePlan(teachPracticePlan));
    }

    /**
     * 删除实践环节
     */
    @PreAuthorize("@ss.hasPermi('teachplan:practiceplan:remove')")
    @Log(title = "实践环节", businessType = BusinessType.DELETE)
	@DeleteMapping("/{practicePlanIds}")
    public AjaxResult remove(@PathVariable Long[] practicePlanIds)
    {
        return toAjax(teachPracticePlanService.deleteTeachPracticePlanByPracticePlanIds(practicePlanIds));
    }
}
