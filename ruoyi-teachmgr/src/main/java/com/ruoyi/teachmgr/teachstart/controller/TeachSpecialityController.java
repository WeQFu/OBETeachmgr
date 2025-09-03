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
import com.ruoyi.teachmgr.teachstart.domain.TeachSpeciality;
import com.ruoyi.teachmgr.teachstart.service.ITeachSpecialityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专业管理Controller
 * 
 * @author jzg
 * @date 2023-05-10
 */
@RestController
@RequestMapping("/teachstart/speciality")
public class TeachSpecialityController extends BaseController
{
    @Autowired
    private ITeachSpecialityService teachSpecialityService;

    /**
     * 查询专业管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachSpeciality teachSpeciality)
    {
        startPage();
        List<TeachSpeciality> list = teachSpecialityService.selectTeachSpecialityList(teachSpeciality);
        return getDataTable(list);
    }

    /**
     * 导出专业管理列表
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:export')")
    @Log(title = "专业管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachSpeciality teachSpeciality)
    {
        List<TeachSpeciality> list = teachSpecialityService.selectTeachSpecialityList(teachSpeciality);
        ExcelUtil<TeachSpeciality> util = new ExcelUtil<TeachSpeciality>(TeachSpeciality.class);
        util.exportExcel(response, list, "专业管理数据");
    }

    /**
     * 获取专业管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:query')")
    @GetMapping(value = "/{specialityId}")
    public AjaxResult getInfo(@PathVariable("specialityId") Long specialityId)
    {
        return success(teachSpecialityService.selectTeachSpecialityBySpecialityId(specialityId));
    }

    /**
     * 新增专业管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:add')")
    @Log(title = "专业管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachSpeciality teachSpeciality)
    {
        return toAjax(teachSpecialityService.insertTeachSpeciality(teachSpeciality));
    }

    /**
     * 修改专业管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:edit')")
    @Log(title = "专业管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachSpeciality teachSpeciality)
    {
        return toAjax(teachSpecialityService.updateTeachSpeciality(teachSpeciality));
    }

    /**
     * 删除专业管理
     */
    @PreAuthorize("@ss.hasPermi('teachstart:speciality:remove')")
    @Log(title = "专业管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{specialityIds}")
    public AjaxResult remove(@PathVariable Long[] specialityIds)
    {
        return toAjax(teachSpecialityService.deleteTeachSpecialityBySpecialityIds(specialityIds));
    }
}
