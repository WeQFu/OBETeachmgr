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
import com.ruoyi.teachmgr.teachstart.domain.TeachGraduationRequire;
import com.ruoyi.teachmgr.teachstart.service.ITeachGraduationRequireService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 毕业要求Controller
 * 
 * @author jzg
 * @date 2024-03-03
 */
@RestController
@RequestMapping("/teachstart/gradurequire")
public class TeachGraduationRequireController extends BaseController
{
    @Autowired
    private ITeachGraduationRequireService teachGraduationRequireService;

    /**
     * 查询毕业要求列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachGraduationRequire teachGraduationRequire)
    {
        startPage();
        List<TeachGraduationRequire> list = teachGraduationRequireService.selectTeachGraduationRequireList(teachGraduationRequire);
        return getDataTable(list);
    }

    /**
     * 导出毕业要求列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:export')")
    @Log(title = "毕业要求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachGraduationRequire teachGraduationRequire)
    {
        List<TeachGraduationRequire> list = teachGraduationRequireService.selectTeachGraduationRequireList(teachGraduationRequire);
        ExcelUtil<TeachGraduationRequire> util = new ExcelUtil<TeachGraduationRequire>(TeachGraduationRequire.class);
        util.exportExcel(response, list, "毕业要求数据");
    }

    /**
     * 获取毕业要求详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:query')")
    @GetMapping(value = "/{graduRequireId}")
    public AjaxResult getInfo(@PathVariable("graduRequireId") Long graduRequireId)
    {
        return success(teachGraduationRequireService.selectTeachGraduationRequireByGraduRequireId(graduRequireId));
    }

    /**
     * 新增毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:add')")
    @Log(title = "毕业要求", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachGraduationRequire teachGraduationRequire)
    {
        return toAjax(teachGraduationRequireService.insertTeachGraduationRequire(teachGraduationRequire));
    }

    /**
     * 修改毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:edit')")
    @Log(title = "毕业要求", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachGraduationRequire teachGraduationRequire)
    {
        return toAjax(teachGraduationRequireService.updateTeachGraduationRequire(teachGraduationRequire));
    }

    /**
     * 删除毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachstart:gradurequire:remove')")
    @Log(title = "毕业要求", businessType = BusinessType.DELETE)
	@DeleteMapping("/{graduRequireIds}")
    public AjaxResult remove(@PathVariable Long[] graduRequireIds)
    {
        return toAjax(teachGraduationRequireService.deleteTeachGraduationRequireByGraduRequireIds(graduRequireIds));
    }
}
