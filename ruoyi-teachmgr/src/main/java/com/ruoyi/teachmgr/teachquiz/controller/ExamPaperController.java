package com.ruoyi.teachmgr.teachquiz.controller;

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
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaper;
import com.ruoyi.teachmgr.teachquiz.service.IExamPaperService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 组卷信息Controller
 * 
 * @author jzg
 * @date 2023-05-25
 */
@RestController
@RequestMapping("/teachquiz/paper")
public class ExamPaperController extends BaseController
{
    @Autowired
    private IExamPaperService examPaperService;

    @Resource
    private ITeachBookContentService teachBookContentService;


    /**
     * 查询组卷信息列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamPaper examPaper)
    {
        startPage();
        List<ExamPaper> list = examPaperService.selectExamPaperList(examPaper);
        return getDataTable(list);
    }

    /**
     * 导出组卷信息列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:export')")
    @Log(title = "组卷信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamPaper examPaper)
    {
        List<ExamPaper> list = examPaperService.selectExamPaperList(examPaper);
        ExcelUtil<ExamPaper> util = new ExcelUtil<ExamPaper>(ExamPaper.class);
        util.exportExcel(response, list, "组卷信息数据");
    }

    /**
     * 获取组卷信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:query')")
    @GetMapping(value = "/{paperId}")
    public AjaxResult getInfo(@PathVariable("paperId") Long paperId)
    {
        return success(examPaperService.selectExamPaperByPaperId(paperId));
    }

    /**
     * 新增组卷信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:add')")
    @Log(title = "组卷信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamPaper examPaper)
    {
        return toAjax(examPaperService.insertExamPaper(examPaper));
    }

    /**
     * 修改组卷信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:edit')")
    @Log(title = "组卷信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamPaper examPaper)
    {
        return toAjax(examPaperService.updateExamPaper(examPaper));
    }

    /**
     * 删除组卷信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:paper:remove')")
    @Log(title = "组卷信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paperIds}")
    public AjaxResult remove(@PathVariable Long[] paperIds)
    {
        return toAjax(examPaperService.deleteExamPaperByPaperIds(paperIds));
    }

    /////
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
