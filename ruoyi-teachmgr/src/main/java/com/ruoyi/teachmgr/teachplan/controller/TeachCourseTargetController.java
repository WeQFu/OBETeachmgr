package com.ruoyi.teachmgr.teachplan.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachplan.service.ITeachGraduationRequirementService;
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
import com.ruoyi.teachmgr.teachplan.domain.TeachCourseTarget;
import com.ruoyi.teachmgr.teachplan.service.ITeachCourseTargetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 课程目标Controller
 * 
 * @author jzg
 * @date 2023-06-12
 */
@RestController
@RequestMapping("/teachplan/teachtarget")
public class TeachCourseTargetController extends BaseController
{
    @Autowired
    private ITeachCourseTargetService teachCourseTargetService;

    @Resource
    private ITeachGraduationRequirementService teachGraduationRequirementService;

    /**
     * 查询课程目标列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachCourseTarget teachCourseTarget)
    {
        startPage();
        List<TeachCourseTarget> list = teachCourseTargetService.selectTeachCourseTargetList(teachCourseTarget);
        return getDataTable(list);
    }

    /**
     * 导出课程目标列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:export')")
    @Log(title = "课程目标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachCourseTarget teachCourseTarget)
    {
        List<TeachCourseTarget> list = teachCourseTargetService.selectTeachCourseTargetList(teachCourseTarget);
        ExcelUtil<TeachCourseTarget> util = new ExcelUtil<TeachCourseTarget>(TeachCourseTarget.class);
        util.exportExcel(response, list, "课程目标数据");
    }

    /**
     * 获取课程目标详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:query')")
    @GetMapping(value = "/{courseTargetId}")
    public AjaxResult getInfo(@PathVariable("courseTargetId") Long courseTargetId)
    {
        return success(teachCourseTargetService.selectTeachCourseTargetByCourseTargetId(courseTargetId));
    }

    /**
     * 新增课程目标
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:add')")
    @Log(title = "课程目标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachCourseTarget teachCourseTarget)
    {
        return toAjax(teachCourseTargetService.insertTeachCourseTarget(teachCourseTarget));
    }

    /**
     * 修改课程目标
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:edit')")
    @Log(title = "课程目标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachCourseTarget teachCourseTarget)
    {
        return toAjax(teachCourseTargetService.updateTeachCourseTarget(teachCourseTarget));
    }

    /**
     * 删除课程目标
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachtarget:remove')")
    @Log(title = "课程目标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseTargetIds}")
    public AjaxResult remove(@PathVariable Long[] courseTargetIds)
    {
        return toAjax(teachCourseTargetService.deleteTeachCourseTargetByCourseTargetIds(courseTargetIds));
    }
    ///--start
    /**
     * 获取树列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:requirement:list')")
    @GetMapping("/requirementTree")
    public AjaxResult teachGraduationRequirementTree(TeachGraduationRequirement bookContent)
    {
        return success(teachGraduationRequirementService.selectTeachGraduationRequirementTreeList(bookContent));
    }
    ////--end
///导入数据
    @Log(title = "类别数据导入", businessType = BusinessType.IMPORT)
//    @RequiresPermissions("locationmgt:location:import")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TeachCourseTarget> util = new ExcelUtil<TeachCourseTarget>(TeachCourseTarget.class);
        List<TeachCourseTarget> cepLocationTypeList = util.importExcel(file.getInputStream());
        String message = teachCourseTargetService.importData(cepLocationTypeList,updateSupport);
        return AjaxResult.success(message);
    }
    //下载模板
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TeachCourseTarget> util = new ExcelUtil<TeachCourseTarget>(TeachCourseTarget.class);
        util.importTemplateExcel(response,"达成途径数据");
    }


}
