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
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeCode;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeCodeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 编码实践Controller
 * 
 * @author jzg
 * @date 2023-05-13
 */
@RestController
@RequestMapping("/teachexecute/practicecode")
public class TeachPracticeCodeController extends BaseController
{
    @Autowired
    private ITeachPracticeCodeService teachPracticeCodeService;

    /**
     * 查询编码实践列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPracticeCode teachPracticeCode)
    {
        startPage();
        List<TeachPracticeCode> list = teachPracticeCodeService.selectTeachPracticeCodeList(teachPracticeCode);
        return getDataTable(list);
    }

    /**
     * 导出编码实践列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:export')")
    @Log(title = "编码实践", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPracticeCode teachPracticeCode)
    {
        List<TeachPracticeCode> list = teachPracticeCodeService.selectTeachPracticeCodeList(teachPracticeCode);
        ExcelUtil<TeachPracticeCode> util = new ExcelUtil<TeachPracticeCode>(TeachPracticeCode.class);
        util.exportExcel(response, list, "编码实践数据");
    }

    /**
     * 获取编码实践详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:query')")
    @GetMapping(value = "/{practiceCodeId}")
    public AjaxResult getInfo(@PathVariable("practiceCodeId") Long practiceCodeId)
    {
        return success(teachPracticeCodeService.selectTeachPracticeCodeByPracticeCodeId(practiceCodeId));
    }

    /**
     * 新增编码实践
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:add')")
    @Log(title = "编码实践", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPracticeCode teachPracticeCode)
    {
        return toAjax(teachPracticeCodeService.insertTeachPracticeCode(teachPracticeCode));
    }

    /**
     * 修改编码实践
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:edit')")
    @Log(title = "编码实践", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPracticeCode teachPracticeCode)
    {
        return toAjax(teachPracticeCodeService.updateTeachPracticeCode(teachPracticeCode));
    }

    /**
     * 删除编码实践
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicecode:remove')")
    @Log(title = "编码实践", businessType = BusinessType.DELETE)
	@DeleteMapping("/{practiceCodeIds}")
    public AjaxResult remove(@PathVariable Long[] practiceCodeIds)
    {
        return toAjax(teachPracticeCodeService.deleteTeachPracticeCodeByPracticeCodeIds(practiceCodeIds));
    }
}
