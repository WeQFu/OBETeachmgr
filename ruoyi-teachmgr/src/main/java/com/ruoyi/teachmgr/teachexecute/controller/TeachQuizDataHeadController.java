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
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataHead;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizDataHeadService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 考试阅卷Controller
 * 
 * @author jzg
 * @date 2023-06-06
 */
@RestController
@RequestMapping("/teachexecute/quizdatahead")
public class TeachQuizDataHeadController extends BaseController
{
    @Autowired
    private ITeachQuizDataHeadService teachQuizDataHeadService;

    /**
     * 查询考试阅卷列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachQuizDataHead teachQuizDataHead)
    {
        startPage();
        List<TeachQuizDataHead> list = teachQuizDataHeadService.selectTeachQuizDataHeadList(teachQuizDataHead);
        return getDataTable(list);
    }

    /**
     * 导出考试阅卷列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:export')")
    @Log(title = "考试阅卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachQuizDataHead teachQuizDataHead)
    {
        List<TeachQuizDataHead> list = teachQuizDataHeadService.selectTeachQuizDataHeadList(teachQuizDataHead);
        ExcelUtil<TeachQuizDataHead> util = new ExcelUtil<TeachQuizDataHead>(TeachQuizDataHead.class);
        util.exportExcel(response, list, "考试阅卷数据");
    }

    /**
     * 获取考试阅卷详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:query')")
    @GetMapping(value = "/{quizDataHeadId}")
    public AjaxResult getInfo(@PathVariable("quizDataHeadId") Long quizDataHeadId)
    {
        return success(teachQuizDataHeadService.selectTeachQuizDataHeadByQuizDataHeadId(quizDataHeadId));
    }

    /**
     * 新增考试阅卷
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:add')")
    @Log(title = "考试阅卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachQuizDataHead teachQuizDataHead)
    {
        return toAjax(teachQuizDataHeadService.insertTeachQuizDataHead(teachQuizDataHead));
    }

    /**
     * 修改考试阅卷
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:edit')")
    @Log(title = "考试阅卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachQuizDataHead teachQuizDataHead)
    {
        return toAjax(teachQuizDataHeadService.updateTeachQuizDataHead(teachQuizDataHead));
    }

    /**
     * 删除考试阅卷
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatahead:remove')")
    @Log(title = "考试阅卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{quizDataHeadIds}")
    public AjaxResult remove(@PathVariable Long[] quizDataHeadIds)
    {
        return toAjax(teachQuizDataHeadService.deleteTeachQuizDataHeadByQuizDataHeadIds(quizDataHeadIds));
    }

    ///导入数据
    @Log(title = "类别数据导入", businessType = BusinessType.IMPORT)
//    @RequiresPermissions("locationmgt:location:import")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TeachQuizDataHead> util = new ExcelUtil<TeachQuizDataHead>(TeachQuizDataHead.class);
        List<TeachQuizDataHead> teachQuizDataHeadList = util.importExcel(file.getInputStream());
        String message = teachQuizDataHeadService.importData(teachQuizDataHeadList,updateSupport);
        return AjaxResult.success(message);
    }
    //下载模板
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TeachQuizDataHead> util = new ExcelUtil<TeachQuizDataHead>(TeachQuizDataHead.class);
        util.importTemplateExcel(response,"点位类型数据");
    }

}
