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
import com.ruoyi.teachmgr.teachexecute.domain.TeachPracticeData;
import com.ruoyi.teachmgr.teachexecute.service.ITeachPracticeDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 实践成果Controller
 * 
 * @author jzg
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/teachexecute/practicedata")
public class TeachPracticeDataController extends BaseController
{
    @Autowired
    private ITeachPracticeDataService teachPracticeDataService;

    /**
     * 查询实践成果列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPracticeData teachPracticeData)
    {
        startPage();
        List<TeachPracticeData> list = teachPracticeDataService.selectTeachPracticeDataList(teachPracticeData);
        return getDataTable(list);
    }

    /**
     * 导出实践成果列表
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:export')")
    @Log(title = "实践成果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPracticeData teachPracticeData)
    {
        List<TeachPracticeData> list = teachPracticeDataService.selectTeachPracticeDataList(teachPracticeData);
        ExcelUtil<TeachPracticeData> util = new ExcelUtil<TeachPracticeData>(TeachPracticeData.class);
        util.exportExcel(response, list, "实践成果数据");
    }

    /**
     * 获取实践成果详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:query')")
    @GetMapping(value = "/{practiceDataId}")
    public AjaxResult getInfo(@PathVariable("practiceDataId") Long practiceDataId)
    {
        return success(teachPracticeDataService.selectTeachPracticeDataByPracticeDataId(practiceDataId));
    }

    /**
     * 新增实践成果
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:add')")
    @Log(title = "实践成果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPracticeData teachPracticeData)
    {
        return toAjax(teachPracticeDataService.insertTeachPracticeData(teachPracticeData));
    }

    /**
     * 修改实践成果
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:edit')")
    @Log(title = "实践成果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPracticeData teachPracticeData)
    {
        return toAjax(teachPracticeDataService.updateTeachPracticeData(teachPracticeData));
    }

    /**
     * 删除实践成果
     */
    @PreAuthorize("@ss.hasPermi('teachexecute:practicedata:remove')")
    @Log(title = "实践成果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{practiceDataIds}")
    public AjaxResult remove(@PathVariable Long[] practiceDataIds)
    {
        return toAjax(teachPracticeDataService.deleteTeachPracticeDataByPracticeDataIds(practiceDataIds));
    }
    ///导入数据
    @Log(title = "实验数据导入", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TeachPracticeData> util = new ExcelUtil<TeachPracticeData>(TeachPracticeData.class);
        List<TeachPracticeData> cepLocationTypeList = util.importExcel(file.getInputStream());
        String message = teachPracticeDataService.importData(cepLocationTypeList,updateSupport);
        return AjaxResult.success(message);
    }
    //下载模板
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TeachPracticeData> util = new ExcelUtil<TeachPracticeData>(TeachPracticeData.class);
        util.importTemplateExcel(response,"点位类型数据");
    }

    ///导入实验数据
//    @Log(title = "实验数据导入", businessType = BusinessType.IMPORT)
//    @PostMapping("/importData")
//    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
//    {
//        ExcelUtil<TeachPracticeData> util = new ExcelUtil<TeachPracticeData>(TeachPracticeData.class);
//        List<TeachPracticeData> cepLocationTypeList = util.importExcel(file.getInputStream());
//        String message = teachPracticeDataService.importData(cepLocationTypeList,updateSupport);
//        return AjaxResult.success(message);
//    }
//    //下载模板
//    @PostMapping("/importTemplate")
//    public void importTemplate(HttpServletResponse response)
//    {
//        ExcelUtil<TeachPracticeData> util = new ExcelUtil<TeachPracticeData>(TeachPracticeData.class);
//        util.importTemplateExcel(response,"实验数据");
//    }

}
