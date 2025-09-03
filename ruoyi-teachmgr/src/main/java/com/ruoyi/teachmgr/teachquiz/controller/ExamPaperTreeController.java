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
import com.ruoyi.teachmgr.teachquiz.domain.ExamPaperTree;
import com.ruoyi.teachmgr.teachquiz.service.IExamPaperTreeService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 树形组卷Controller
 * 
 * @author jzg
 * @date 2023-05-30
 */
@RestController
@RequestMapping("/teachquiz/papertree")
public class ExamPaperTreeController extends BaseController
{
    @Autowired
    private IExamPaperTreeService examPaperTreeService;

    /**
     * 查询树形组卷列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:list')")
    @GetMapping("/list")
    public AjaxResult list(ExamPaperTree examPaperTree)
    {
        List<ExamPaperTree> list = examPaperTreeService.selectExamPaperTreeList(examPaperTree);
        return success(list);
    }

    /**
     * 导出树形组卷列表
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:export')")
    @Log(title = "树形组卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ExamPaperTree examPaperTree)
    {
        List<ExamPaperTree> list = examPaperTreeService.selectExamPaperTreeList(examPaperTree);
        ExcelUtil<ExamPaperTree> util = new ExcelUtil<ExamPaperTree>(ExamPaperTree.class);
        util.exportExcel(response, list, "树形组卷数据");
    }

    /**
     * 获取树形组卷详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:query')")
    @GetMapping(value = "/{paperTreeId}")
    public AjaxResult getInfo(@PathVariable("paperTreeId") Long paperTreeId)
    {
        return success(examPaperTreeService.selectExamPaperTreeByPaperTreeId(paperTreeId));
    }

    /**
     * 新增树形组卷
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:add')")
    @Log(title = "树形组卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamPaperTree examPaperTree)
    {
        return toAjax(examPaperTreeService.insertExamPaperTree(examPaperTree));
    }

    /**
     * 修改树形组卷
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:edit')")
    @Log(title = "树形组卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamPaperTree examPaperTree)
    {
        return toAjax(examPaperTreeService.updateExamPaperTree(examPaperTree));
    }

    /**
     * 删除树形组卷
     */
    @PreAuthorize("@ss.hasPermi('teachquiz:papertree:remove')")
    @Log(title = "树形组卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paperTreeIds}")
    public AjaxResult remove(@PathVariable Long[] paperTreeIds)
    {
        return toAjax(examPaperTreeService.deleteExamPaperTreeByPaperTreeIds(paperTreeIds));
    }
}
