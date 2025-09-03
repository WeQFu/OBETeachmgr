package com.ruoyi.teachmgr.teachquiz.controller;

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
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestionsClazz;
import com.ruoyi.teachmgr.teachquiz.service.IExamQuestionsClazzService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 题库分类Controller
 * 
 * @author jzg
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/teachquiz/questionclazz")
public class ExamQuestionsClazzController extends BaseController
{
    @Autowired
    private IExamQuestionsClazzService examQuestionsClazzService;

    /**
     * 查询题库分类列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamQuestionsClazz examQuestionsClazz)
    {
        startPage();
        List<ExamQuestionsClazz> list = examQuestionsClazzService.selectExamQuestionsClazzList(examQuestionsClazz);
        return getDataTable(list);
    }

    /**
     * 导出题库分类列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:export')")
    @Log(title = "题库分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamQuestionsClazz examQuestionsClazz)
    {
        List<ExamQuestionsClazz> list = examQuestionsClazzService.selectExamQuestionsClazzList(examQuestionsClazz);
        ExcelUtil<ExamQuestionsClazz> util = new ExcelUtil<ExamQuestionsClazz>(ExamQuestionsClazz.class);
        util.exportExcel(response, list, "题库分类数据");
    }

    /**
     * 获取题库分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:query')")
    @GetMapping(value = "/{questionsClazzId}")
    public AjaxResult getInfo(@PathVariable("questionsClazzId") Long questionsClazzId)
    {
        return success(examQuestionsClazzService.selectExamQuestionsClazzByQuestionsClazzId(questionsClazzId));
    }

    /**
     * 新增题库分类
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:add')")
    @Log(title = "题库分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamQuestionsClazz examQuestionsClazz)
    {
        return toAjax(examQuestionsClazzService.insertExamQuestionsClazz(examQuestionsClazz));
    }

    /**
     * 修改题库分类
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:edit')")
    @Log(title = "题库分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamQuestionsClazz examQuestionsClazz)
    {
        return toAjax(examQuestionsClazzService.updateExamQuestionsClazz(examQuestionsClazz));
    }

    /**
     * 删除题库分类
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questionclazz:remove')")
    @Log(title = "题库分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionsClazzIds}")
    public AjaxResult remove(@PathVariable Long[] questionsClazzIds)
    {
        return toAjax(examQuestionsClazzService.deleteExamQuestionsClazzByQuestionsClazzIds(questionsClazzIds));
    }
}
