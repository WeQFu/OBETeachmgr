package com.ruoyi.teachmgr.teachplan.controller;

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
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseChapter;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseChapterService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 章节内容Controller
 * 
 * @author jzg
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/teachplan/chaptercontent")
public class TeachCourseChapterController extends BaseController
{
    @Autowired
    private ITeachCourseChapterService teachCourseChapterService;

    /**
     * 查询章节内容列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachCourseChapter teachCourseChapter)
    {
        startPage();
        List<TeachCourseChapter> list = teachCourseChapterService.selectTeachCourseChapterList(teachCourseChapter);
        return getDataTable(list);
    }

    /**
     * 导出章节内容列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:export')")
    @Log(title = "章节内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachCourseChapter teachCourseChapter)
    {
        List<TeachCourseChapter> list = teachCourseChapterService.selectTeachCourseChapterList(teachCourseChapter);
        ExcelUtil<TeachCourseChapter> util = new ExcelUtil<TeachCourseChapter>(TeachCourseChapter.class);
        util.exportExcel(response, list, "章节内容数据");
    }

    /**
     * 获取章节内容详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:query')")
    @GetMapping(value = "/{courseChapterId}")
    public AjaxResult getInfo(@PathVariable("courseChapterId") Long courseChapterId)
    {
        return success(teachCourseChapterService.selectTeachCourseChapterByCourseChapterId(courseChapterId));
    }

    /**
     * 新增章节内容
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:add')")
    @Log(title = "章节内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachCourseChapter teachCourseChapter)
    {
        return toAjax(teachCourseChapterService.insertTeachCourseChapter(teachCourseChapter));
    }

    /**
     * 修改章节内容
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:edit')")
    @Log(title = "章节内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachCourseChapter teachCourseChapter)
    {
        return toAjax(teachCourseChapterService.updateTeachCourseChapter(teachCourseChapter));
    }

    /**
     * 删除章节内容
     */
    @PreAuthorize("@ss.hasPermi('teachplan:chaptercontent:remove')")
    @Log(title = "章节内容", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseChapterIds}")
    public AjaxResult remove(@PathVariable Long[] courseChapterIds)
    {
        return toAjax(teachCourseChapterService.deleteTeachCourseChapterByCourseChapterIds(courseChapterIds));
    }
}
