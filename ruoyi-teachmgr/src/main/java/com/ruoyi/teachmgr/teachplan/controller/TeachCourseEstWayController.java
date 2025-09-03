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
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseEstWay;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseEstWayService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 评价方式Controller
 * 
 * @author jzg
 * @date 2024-03-05
 */
@RestController
@RequestMapping("/teachplan/courseestway")
public class TeachCourseEstWayController extends BaseController
{
    @Autowired
    private ITeachCourseEstWayService teachCourseEstWayService;

    /**
     * 查询评价方式列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachCourseEstWay teachCourseEstWay)
    {
        startPage();
        List<TeachCourseEstWay> list = teachCourseEstWayService.selectTeachCourseEstWayList(teachCourseEstWay);
        return getDataTable(list);
    }

    /**
     * 导出评价方式列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:export')")
    @Log(title = "评价方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachCourseEstWay teachCourseEstWay)
    {
        List<TeachCourseEstWay> list = teachCourseEstWayService.selectTeachCourseEstWayList(teachCourseEstWay);
        ExcelUtil<TeachCourseEstWay> util = new ExcelUtil<TeachCourseEstWay>(TeachCourseEstWay.class);
        util.exportExcel(response, list, "评价方式数据");
    }

    /**
     * 获取评价方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:query')")
    @GetMapping(value = "/{estWayId}")
    public AjaxResult getInfo(@PathVariable("estWayId") Long estWayId)
    {
        return success(teachCourseEstWayService.selectTeachCourseEstWayByEstWayId(estWayId));
    }

    /**
     * 新增评价方式
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:add')")
    @Log(title = "评价方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachCourseEstWay teachCourseEstWay)
    {
        return toAjax(teachCourseEstWayService.insertTeachCourseEstWay(teachCourseEstWay));
    }

    /**
     * 修改评价方式
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:edit')")
    @Log(title = "评价方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachCourseEstWay teachCourseEstWay)
    {
        return toAjax(teachCourseEstWayService.updateTeachCourseEstWay(teachCourseEstWay));
    }

    /**
     * 删除评价方式
     */
    @PreAuthorize("@ss.hasPermi('teachplan:courseestway:remove')")
    @Log(title = "评价方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{estWayIds}")
    public AjaxResult remove(@PathVariable Long[] estWayIds)
    {
        return toAjax(teachCourseEstWayService.deleteTeachCourseEstWayByEstWayIds(estWayIds));
    }

    ///导入数据
    @Log(title = "类别数据导入", businessType = BusinessType.IMPORT)
//    @RequiresPermissions("locationmgt:location:import")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TeachCourseEstWay> util = new ExcelUtil<TeachCourseEstWay>(TeachCourseEstWay.class);
        List<TeachCourseEstWay> cepLocationTypeList = util.importExcel(file.getInputStream());
        String message = teachCourseEstWayService.importData(cepLocationTypeList,updateSupport);
        return AjaxResult.success(message);
    }
    //下载模板
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TeachCourseEstWay> util = new ExcelUtil<TeachCourseEstWay>(TeachCourseEstWay.class);
        util.importTemplateExcel(response,"评价环节数据");
    }

}
