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
import com.ruoyi.teachmgr.teachstart.domain.TeachBook;
import com.ruoyi.teachmgr.teachstart.service.ITeachBookService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教材管理Controller
 * 
 * @author jzg
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/teachstart/book")
public class TeachBookController extends BaseController
{
    @Autowired
    private ITeachBookService teachBookService;

    /**
     * 查询教材管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachBook teachBook)
    {
        startPage();
        List<TeachBook> list = teachBookService.selectTeachBookList(teachBook);
        return getDataTable(list);
    }

    /**
     * 导出教材管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:export')")
    @Log(title = "教材管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachBook teachBook)
    {
        List<TeachBook> list = teachBookService.selectTeachBookList(teachBook);
        ExcelUtil<TeachBook> util = new ExcelUtil<TeachBook>(TeachBook.class);
        util.exportExcel(response, list, "教材管理数据");
    }

    /**
     * 获取教材管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:query')")
    @GetMapping(value = "/{bookId}")
    public AjaxResult getInfo(@PathVariable("bookId") Long bookId)
    {
        return success(teachBookService.selectTeachBookByBookId(bookId));
    }

    /**
     * 新增教材管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:add')")
    @Log(title = "教材管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachBook teachBook)
    {
        return toAjax(teachBookService.insertTeachBook(teachBook));
    }

    /**
     * 修改教材管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:edit')")
    @Log(title = "教材管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachBook teachBook)
    {
        return toAjax(teachBookService.updateTeachBook(teachBook));
    }

    /**
     * 删除教材管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:book:remove')")
    @Log(title = "教材管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bookIds}")
    public AjaxResult remove(@PathVariable Long[] bookIds)
    {
        return toAjax(teachBookService.deleteTeachBookByBookIds(bookIds));
    }
}
