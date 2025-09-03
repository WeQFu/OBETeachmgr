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
import com.ruoyi.teachmgr.teachexecute.domain.TeachQuizPublish;
import com.ruoyi.teachmgr.teachexecute.service.ITeachQuizPublishService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 考试发布Controller
 * 
 * @author jzg
 * @date 2023-05-28
 */
@RestController
@RequestMapping("/teachexecute/quizpublish")
public class TeachQuizPublishController extends BaseController
{
    @Autowired
    private ITeachQuizPublishService teachQuizPublishService;

    /**
     * 查询考试发布列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachQuizPublish teachQuizPublish)
    {
        startPage();
        List<TeachQuizPublish> list = teachQuizPublishService.selectTeachQuizPublishList(teachQuizPublish);
        return getDataTable(list);
    }

    /**
     * 导出考试发布列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:export')")
    @Log(title = "考试发布", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachQuizPublish teachQuizPublish)
    {
        List<TeachQuizPublish> list = teachQuizPublishService.selectTeachQuizPublishList(teachQuizPublish);
        ExcelUtil<TeachQuizPublish> util = new ExcelUtil<TeachQuizPublish>(TeachQuizPublish.class);
        util.exportExcel(response, list, "考试发布数据");
    }

    /**
     * 获取考试发布详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:query')")
    @GetMapping(value = "/{quizPublishId}")
    public AjaxResult getInfo(@PathVariable("quizPublishId") Long quizPublishId)
    {
        return success(teachQuizPublishService.selectTeachQuizPublishByQuizPublishId(quizPublishId));
    }

    /**
     * 新增考试发布
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:add')")
    @Log(title = "考试发布", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachQuizPublish teachQuizPublish)
    {
        return toAjax(teachQuizPublishService.insertTeachQuizPublish(teachQuizPublish));
    }

    /**
     * 修改考试发布
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:edit')")
    @Log(title = "考试发布", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachQuizPublish teachQuizPublish)
    {
        return toAjax(teachQuizPublishService.updateTeachQuizPublish(teachQuizPublish));
    }

    /**
     * 删除考试发布
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:quizpublish:remove')")
    @Log(title = "考试发布", businessType = BusinessType.DELETE)
	@DeleteMapping("/{quizPublishIds}")
    public AjaxResult remove(@PathVariable Long[] quizPublishIds)
    {
        return toAjax(teachQuizPublishService.deleteTeachQuizPublishByQuizPublishIds(quizPublishIds));
    }
}
