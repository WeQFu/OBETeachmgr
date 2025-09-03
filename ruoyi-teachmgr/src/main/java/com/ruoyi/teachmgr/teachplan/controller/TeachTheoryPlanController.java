package com.ruoyi.teachmgr.teachplan.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;
import com.ruoyi.teachmgr.teachstart.service.ITeachBookContentService;
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
import com.ruoyi.teachmgr.teachplan.domain.TeachTheoryPlan;
import com.ruoyi.teachmgr.teachplan.service.ITeachTheoryPlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 理论计划Controller
 * 
 * @author jzg
 * @date 2023-09-09
 */
@RestController
@RequestMapping("/teachplan/theoryplan")
public class TeachTheoryPlanController extends BaseController
{
    @Autowired
    private ITeachTheoryPlanService teachTheoryPlanService;

    /////
    //解决树的选择
    @Resource
    private ITeachBookContentService teachBookContentService;
    ///////

    /**
     * 查询理论计划列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachTheoryPlan teachTheoryPlan)
    {
        startPage();
        List<TeachTheoryPlan> list = teachTheoryPlanService.selectTeachTheoryPlanList(teachTheoryPlan);
        return getDataTable(list);
    }

    /**
     * 导出理论计划列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:export')")
    @Log(title = "理论计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachTheoryPlan teachTheoryPlan)
    {
        List<TeachTheoryPlan> list = teachTheoryPlanService.selectTeachTheoryPlanList(teachTheoryPlan);
        ExcelUtil<TeachTheoryPlan> util = new ExcelUtil<TeachTheoryPlan>(TeachTheoryPlan.class);
        util.exportExcel(response, list, "理论计划数据");
    }

    /**
     * 获取理论计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:query')")
    @GetMapping(value = "/{theoryPlanId}")
    public AjaxResult getInfo(@PathVariable("theoryPlanId") Long theoryPlanId)
    {
        return success(teachTheoryPlanService.selectTeachTheoryPlanByTheoryPlanId(theoryPlanId));
    }

    /**
     * 新增理论计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:add')")
    @Log(title = "理论计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachTheoryPlan teachTheoryPlan)
    {
        return toAjax(teachTheoryPlanService.insertTeachTheoryPlan(teachTheoryPlan));
    }

    /**
     * 修改理论计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:edit')")
    @Log(title = "理论计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachTheoryPlan teachTheoryPlan)
    {
        return toAjax(teachTheoryPlanService.updateTeachTheoryPlan(teachTheoryPlan));
    }

    /**
     * 删除理论计划
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:remove')")
    @Log(title = "理论计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{theoryPlanIds}")
    public AjaxResult remove(@PathVariable Long[] theoryPlanIds)
    {
        return toAjax(teachTheoryPlanService.deleteTeachTheoryPlanByTheoryPlanIds(theoryPlanIds));
    }

////////
    /**
     * 获取neritic树列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:theoryplan:list')")
    @GetMapping("/bookChapterTree")
    public AjaxResult bookChapterTree(TeachBookContent bookContent)
    {
        return success(teachBookContentService.selectBookChapterTreeList(bookContent));
    }

}
