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
import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachplan.service.ITeachGraduationRequirementService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 毕业要求Controller
 * 
 * @author jzg
 * @date 2023-06-13
 */
@RestController
@RequestMapping("/teachplan/requirement")
public class TeachGraduationRequirementController extends BaseController
{
    @Autowired
    private ITeachGraduationRequirementService teachGraduationRequirementService;

    /**
     * 查询毕业要求列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:list')")
    @GetMapping("/list")
    public AjaxResult list(TeachGraduationRequirement teachGraduationRequirement)
    {
        List<TeachGraduationRequirement> list = teachGraduationRequirementService.selectTeachGraduationRequirementList(teachGraduationRequirement);
        return success(list);
    }

    /**
     * 导出毕业要求列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:export')")
    @Log(title = "毕业要求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachGraduationRequirement teachGraduationRequirement)
    {
        List<TeachGraduationRequirement> list = teachGraduationRequirementService.selectTeachGraduationRequirementList(teachGraduationRequirement);
        ExcelUtil<TeachGraduationRequirement> util = new ExcelUtil<TeachGraduationRequirement>(TeachGraduationRequirement.class);
        util.exportExcel(response, list, "毕业要求数据");
    }

    /**
     * 获取毕业要求详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:query')")
    @GetMapping(value = "/{requirementId}")
    public AjaxResult getInfo(@PathVariable("requirementId") Long requirementId)
    {
        return success(teachGraduationRequirementService.selectTeachGraduationRequirementByRequirementId(requirementId));
    }

    /**
     * 新增毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:add')")
    @Log(title = "毕业要求", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachGraduationRequirement teachGraduationRequirement)
    {
        return toAjax(teachGraduationRequirementService.insertTeachGraduationRequirement(teachGraduationRequirement));
    }

    /**
     * 修改毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:edit')")
    @Log(title = "毕业要求", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachGraduationRequirement teachGraduationRequirement)
    {
        return toAjax(teachGraduationRequirementService.updateTeachGraduationRequirement(teachGraduationRequirement));
    }

    /**
     * 删除毕业要求
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:remove')")
    @Log(title = "毕业要求", businessType = BusinessType.DELETE)
    @DeleteMapping("/{requirementIds}")
    public AjaxResult remove(@PathVariable Long[] requirementIds)
    {
        return toAjax(teachGraduationRequirementService.deleteTeachGraduationRequirementByRequirementIds(requirementIds));
    }
    ////--start
    /**
     * 获取树列表
     */
//    @PreAuthorize("@ss.hasPermi('teachplan:requirement:list')")
//    @GetMapping("/requirementTree")
//    public AjaxResult teachGraduationRequirementTree(TeachGraduationRequirement bookContent)
//    {
//        return success(teachGraduationRequirementService.selectTeachGraduationRequirementTreeList(bookContent));
//    }
    /////--end

}
