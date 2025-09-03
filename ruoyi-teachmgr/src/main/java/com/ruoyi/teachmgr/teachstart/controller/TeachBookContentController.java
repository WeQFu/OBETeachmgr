package com.ruoyi.teachmgr.teachstart.controller;

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
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;
import com.ruoyi.teachmgr.teachstart.service.ITeachBookContentService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 教材章节Controller
 * 
 * @author jzg
 * @date 2023-05-18
 */
@RestController
@RequestMapping("/teachstart/bookcontent")
public class TeachBookContentController extends BaseController
{
    @Autowired
    private ITeachBookContentService teachBookContentService;

    /**
     * 查询教材章节列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:list')")
    @GetMapping("/list")
    public AjaxResult list(TeachBookContent teachBookContent)
    {
        List<TeachBookContent> list = teachBookContentService.selectTeachBookContentList(teachBookContent);
        return success(list);
    }

    /**
     * 导出教材章节列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:export')")
    @Log(title = "教材章节", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachBookContent teachBookContent)
    {
        List<TeachBookContent> list = teachBookContentService.selectTeachBookContentList(teachBookContent);
        ExcelUtil<TeachBookContent> util = new ExcelUtil<TeachBookContent>(TeachBookContent.class);
        util.exportExcel(response, list, "教材章节数据");
    }

    /**
     * 获取教材章节详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:query')")
    @GetMapping(value = "/{bookChapterId}")
    public AjaxResult getInfo(@PathVariable("bookChapterId") Long bookChapterId)
    {
        return success(teachBookContentService.selectTeachBookContentByBookChapterId(bookChapterId));
    }

    /**
     * 新增教材章节
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:add')")
    @Log(title = "教材章节", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachBookContent teachBookContent)
    {
        return toAjax(teachBookContentService.insertTeachBookContent(teachBookContent));
    }

    /**
     * 修改教材章节
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:edit')")
    @Log(title = "教材章节", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachBookContent teachBookContent)
    {
        return toAjax(teachBookContentService.updateTeachBookContent(teachBookContent));
    }

    /**
     * 删除教材章节
     */
    @PreAuthorize("@ss.hasPermi('teachstart:bookcontent:remove')")
    @Log(title = "教材章节", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bookChapterIds}")
    public AjaxResult remove(@PathVariable Long[] bookChapterIds)
    {
        return toAjax(teachBookContentService.deleteTeachBookContentByBookChapterIds(bookChapterIds));
    }
}
