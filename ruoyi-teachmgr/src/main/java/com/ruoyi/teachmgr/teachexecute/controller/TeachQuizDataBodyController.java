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
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizDataBody;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizDataBodyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考试答卷bodyController
 * 
 * @author jzg
 * @date 2023-05-28
 */
@RestController
@RequestMapping("/teachexecute/quizdatabody")
public class TeachQuizDataBodyController extends BaseController
{
    @Autowired
    private ITeachQuizDataBodyService teachQuizDataBodyService;

    /**
     * 查询考试答卷body列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachQuizDataBody teachQuizDataBody)
    {
        startPage();
        List<TeachQuizDataBody> list = teachQuizDataBodyService.selectTeachQuizDataBodyList(teachQuizDataBody);
        return getDataTable(list);
    }

    /**
     * 导出考试答卷body列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:export')")
    @Log(title = "考试答卷body", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachQuizDataBody teachQuizDataBody)
    {
        List<TeachQuizDataBody> list = teachQuizDataBodyService.selectTeachQuizDataBodyList(teachQuizDataBody);
        ExcelUtil<TeachQuizDataBody> util = new ExcelUtil<TeachQuizDataBody>(TeachQuizDataBody.class);
        util.exportExcel(response, list, "考试答卷body数据");
    }

    /**
     * 获取考试答卷body详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:query')")
    @GetMapping(value = "/{quizDataBodyId}")
    public AjaxResult getInfo(@PathVariable("quizDataBodyId") Long quizDataBodyId)
    {
        return success(teachQuizDataBodyService.selectTeachQuizDataBodyByQuizDataBodyId(quizDataBodyId));
    }

    /**
     * 新增考试答卷body
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:add')")
    @Log(title = "考试答卷body", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachQuizDataBody teachQuizDataBody)
    {
        return toAjax(teachQuizDataBodyService.insertTeachQuizDataBody(teachQuizDataBody));
    }

    /**
     * 修改考试答卷body
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:edit')")
    @Log(title = "考试答卷body", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachQuizDataBody teachQuizDataBody)
    {
        return toAjax(teachQuizDataBodyService.updateTeachQuizDataBody(teachQuizDataBody));
    }

    /**
     * 删除考试答卷body
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizdatabody:remove')")
    @Log(title = "考试答卷body", businessType = BusinessType.DELETE)
	@DeleteMapping("/{quizDataBodyIds}")
    public AjaxResult remove(@PathVariable Long[] quizDataBodyIds)
    {
        return toAjax(teachQuizDataBodyService.deleteTeachQuizDataBodyByQuizDataBodyIds(quizDataBodyIds));
    }
}
