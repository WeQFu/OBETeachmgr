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
import com.ruoyi.teachmgr.teachquiz.domain.ExamQuestions;
import com.ruoyi.teachmgr.teachquiz.service.IExamQuestionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 试题库Controller
 * 
 * @author jzg
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/teachquiz/questions")
public class ExamQuestionsController extends BaseController
{
    @Autowired
    private IExamQuestionsService examQuestionsService;

    /**
     * 查询试题库列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamQuestions examQuestions)
    {
        startPage();
        List<ExamQuestions> list = examQuestionsService.selectExamQuestionsList(examQuestions);
        return getDataTable(list);
    }

    /**
     * 导出试题库列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:export')")
    @Log(title = "试题库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamQuestions examQuestions)
    {
        List<ExamQuestions> list = examQuestionsService.selectExamQuestionsList(examQuestions);
        ExcelUtil<ExamQuestions> util = new ExcelUtil<ExamQuestions>(ExamQuestions.class);
        util.exportExcel(response, list, "试题库数据");
    }

    /**
     * 获取试题库详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:query')")
    @GetMapping(value = "/{questionId}")
    public AjaxResult getInfo(@PathVariable("questionId") Long questionId)
    {
        return success(examQuestionsService.selectExamQuestionsByQuestionId(questionId));
    }

    /**
     * 新增试题库
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:add')")
    @Log(title = "试题库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamQuestions examQuestions)
    {
        return toAjax(examQuestionsService.insertExamQuestions(examQuestions));
    }

    /**
     * 修改试题库
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:edit')")
    @Log(title = "试题库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamQuestions examQuestions)
    {
        return toAjax(examQuestionsService.updateExamQuestions(examQuestions));
    }

    /**
     * 删除试题库
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:questions:remove')")
    @Log(title = "试题库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{questionIds}")
    public AjaxResult remove(@PathVariable Long[] questionIds)
    {
        return toAjax(examQuestionsService.deleteExamQuestionsByQuestionIds(questionIds));
    }
}
