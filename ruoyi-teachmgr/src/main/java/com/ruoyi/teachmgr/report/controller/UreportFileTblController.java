package com.ruoyi.teachmgr.report.controller;

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
import com.ruoyi.teachmgr.report.domain.UreportFileTbl;
import com.ruoyi.teachmgr.report.service.IUreportFileTblService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报表清单Controller
 * 
 * @author jzg
 * @date 2023-05-31
 */
@RestController
@RequestMapping("/report/report")
public class UreportFileTblController extends BaseController
{
    @Autowired
    private IUreportFileTblService ureportFileTblService;

    /**
     * 查询报表清单列表
     */
    @PreAuthorize("@ss.hasPermi('report:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(UreportFileTbl ureportFileTbl)
    {
        startPage();
        List<UreportFileTbl> list = ureportFileTblService.selectUreportFileTblList(ureportFileTbl);
        return getDataTable(list);
    }

    /**
     * 导出报表清单列表
     */
    @PreAuthorize("@ss.hasPermi('report:report:export')")
    @Log(title = "报表清单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UreportFileTbl ureportFileTbl)
    {
        List<UreportFileTbl> list = ureportFileTblService.selectUreportFileTblList(ureportFileTbl);
        ExcelUtil<UreportFileTbl> util = new ExcelUtil<UreportFileTbl>(UreportFileTbl.class);
        util.exportExcel(response, list, "报表清单数据");
    }

    /**
     * 获取报表清单详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ureportFileTblService.selectUreportFileTblById(id));
    }

    /**
     * 新增报表清单
     */
    @PreAuthorize("@ss.hasPermi('report:report:add')")
    @Log(title = "报表清单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UreportFileTbl ureportFileTbl)
    {
        return toAjax(ureportFileTblService.insertUreportFileTbl(ureportFileTbl));
    }

    /**
     * 修改报表清单
     */
    @PreAuthorize("@ss.hasPermi('report:report:edit')")
    @Log(title = "报表清单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UreportFileTbl ureportFileTbl)
    {
        return toAjax(ureportFileTblService.updateUreportFileTbl(ureportFileTbl));
    }

    /**
     * 删除报表清单
     */
    @PreAuthorize("@ss.hasPermi('report:report:remove')")
    @Log(title = "报表清单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ureportFileTblService.deleteUreportFileTblByIds(ids));
    }
}
