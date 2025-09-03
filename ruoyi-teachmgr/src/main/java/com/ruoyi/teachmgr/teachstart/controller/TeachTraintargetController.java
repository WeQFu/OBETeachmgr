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
import com.ruoyi.teachmgr.teachstart.domain.TeachTraintarget;
import com.ruoyi.teachmgr.teachstart.service.ITeachTraintargetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 培养目标Controller
 * 
 * @author jzg
 * @date 2024-03-03
 */
@RestController
@RequestMapping("/teachstart/traintarget")
public class TeachTraintargetController extends BaseController
{
    @Autowired
    private ITeachTraintargetService teachTraintargetService;

    /**
     * 查询培养目标列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachTraintarget teachTraintarget)
    {
        startPage();
        List<TeachTraintarget> list = teachTraintargetService.selectTeachTraintargetList(teachTraintarget);
        return getDataTable(list);
    }

    /**
     * 导出培养目标列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:export')")
    @Log(title = "培养目标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachTraintarget teachTraintarget)
    {
        List<TeachTraintarget> list = teachTraintargetService.selectTeachTraintargetList(teachTraintarget);
        ExcelUtil<TeachTraintarget> util = new ExcelUtil<TeachTraintarget>(TeachTraintarget.class);
        util.exportExcel(response, list, "培养目标数据");
    }

    /**
     * 获取培养目标详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:query')")
    @GetMapping(value = "/{coursetargetId}")
    public AjaxResult getInfo(@PathVariable("coursetargetId") Long coursetargetId)
    {
        return success(teachTraintargetService.selectTeachTraintargetByCoursetargetId(coursetargetId));
    }

    /**
     * 新增培养目标
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:add')")
    @Log(title = "培养目标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachTraintarget teachTraintarget)
    {
        return toAjax(teachTraintargetService.insertTeachTraintarget(teachTraintarget));
    }

    /**
     * 修改培养目标
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:edit')")
    @Log(title = "培养目标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachTraintarget teachTraintarget)
    {
        return toAjax(teachTraintargetService.updateTeachTraintarget(teachTraintarget));
    }

    /**
     * 删除培养目标
     */
    @PreAuthorize("@ss.hasPermi('teachstart:traintarget:remove')")
    @Log(title = "培养目标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{coursetargetIds}")
    public AjaxResult remove(@PathVariable Long[] coursetargetIds)
    {
        return toAjax(teachTraintargetService.deleteTeachTraintargetByCoursetargetIds(coursetargetIds));
    }

    ///导入数据
    @Log(title = "类别数据导入", businessType = BusinessType.IMPORT)
//    @RequiresPermissions("locationmgt:location:import")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TeachTraintarget> util = new ExcelUtil<TeachTraintarget>(TeachTraintarget.class);
        List<TeachTraintarget> teachTraintargetList = util.importExcel(file.getInputStream());
        String message = teachTraintargetService.importData(teachTraintargetList,updateSupport);
        return AjaxResult.success(message);
    }
    //下载模板
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TeachTraintarget> util = new ExcelUtil<TeachTraintarget>(TeachTraintarget.class);
        util.importTemplateExcel(response,"课程目标数据");
    }



}
