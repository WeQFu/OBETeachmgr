package com.ruoyi.teachmgr.teachplan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.file.WordUtil;
import com.ruoyi.system.service.ISysDictDataService;
import com.ruoyi.teachmgr.teachplan.domain.vo.TeachOutlineVo;
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
import com.ruoyi.teachmgr.teachplan.domain.TeachOutline;
import com.ruoyi.teachmgr.teachplan.service.ITeachOutlineService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程大纲Controller
 * 
 * @author jzg
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/teachplan/teachoutline")
public class TeachOutlineController extends BaseController
{
    @Autowired
    private ITeachOutlineService teachOutlineService;

    @Resource
    private ISysDictDataService sysDictDataService;

    /**
     * 查询课程大纲列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachOutline teachOutline)
    {
        startPage();
        List<TeachOutline> list = teachOutlineService.selectTeachOutlineList(teachOutline);
        return getDataTable(list);
    }

    /**
     * 导出课程大纲列表
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:export')")
    @Log(title = "课程大纲", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachOutline teachOutline)
    {
        List<TeachOutline> list = teachOutlineService.selectTeachOutlineList(teachOutline);
        ExcelUtil<TeachOutline> util = new ExcelUtil<TeachOutline>(TeachOutline.class);
        util.exportExcel(response, list, "课程大纲数据");
    }

    /**
     * 获取课程大纲详细信息
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:query')")
    @GetMapping(value = "/{outlineId}")
    public AjaxResult getInfo(@PathVariable("outlineId") Long outlineId)
    {
        return success(teachOutlineService.selectTeachOutlineByOutlineId(outlineId));
    }

    /**
     * 新增课程大纲
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:add')")
    @Log(title = "课程大纲", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachOutline teachOutline)
    {
        return toAjax(teachOutlineService.insertTeachOutline(teachOutline));
    }

    /**
     * 修改课程大纲
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:edit')")
    @Log(title = "课程大纲", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachOutline teachOutline)
    {
        return toAjax(teachOutlineService.updateTeachOutline(teachOutline));
    }

    /**
     * 删除课程大纲
     */
    @PreAuthorize("@ss.hasPermi('teachplan:teachoutline:remove')")
    @Log(title = "课程大纲", businessType = BusinessType.DELETE)
	@DeleteMapping("/{outlineIds}")
    public AjaxResult remove(@PathVariable Long[] outlineIds)
    {
        return toAjax(teachOutlineService.deleteTeachOutlineByOutlineIds(outlineIds));
    }

//    @GetMapping("getList")
//    public List<SimulationMeasurepointData> getList(){
//        return this.simulationMeasurepointDateService.getList();
//    }

//    @PostMapping("/export/{ids}")
//    public void export(HttpServletResponse resp, HttpServletRequest req, @PathVariable Long[] ids)
//    {        //获取列表
//        List<TeachOutlineVo> list=teachOutlineService.selectTeachOutlineByIds(ids);
//        //获取字典
//        HashMap<String, ArrayList<SysDictData>> dictData=sysDictDataService.getAllDictDataMap();
//
//        //生成结果集
//        Map<String, Object> dataMap = new HashMap<String,Object>();
//        ArrayList<TeachOutline> resultList=new ArrayList<TeachOutline>();
//        for(TeachOutlineVo s:list){
//            resultList.add(new TeachOutline(s,dictData));
//        }
//        dataMap.put("schemeList",list);
//        //设置生成文件存储路径
//        String directory="/schemeList";
//        WordUtil.CheckDownloadPath(directory);
//        //生成文件
//        WordUtil.CreateWord(resp,req,dataMap,"ruoyi-teachmgr\\src\\main\\resources\\template\\teahoutlineschema","teachoutline.ftl"
//                , RuoYiConfig.getDownloadPath()+directory+"/teachoutline.doc");
//        //下载后删除生成文件
////        FileUtils.deleteFile(RuoYiConfig.getDownloadPath()+directory+"/BKJC-CX-007-2.doc");
//    }
    /**
     * 根据模板导出word
     */
    @Log(title = "根据模板导出word", businessType = BusinessType.IMPORT)
//    @PreAuthorize("@ss.hasPermi('occupation:basics:exportWord')")
    @GetMapping("/exportWord")
    public AjaxResult exportWord(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map = new HashMap<>();

        map.put("courseSemester", "2022-2023-1");
        map.put("code", "零件编码");
        map.put("name", "零件名称");
        map.put("quantity", "计划数");
        map.put("time", "计划工时");
        map.put("staff", "生产员工");
        map.put("seat", "生产机位");

        map.put("totalpreyear", "2660");//单条数据
        map.put("totalthisyear", "3400");//单条数据
        String str = "teachoutline.docx";
        //获取yml配置地址
        String tempDir = RuoYiConfig.getProfile() + "/download/";
        String name = WordUtil.easyPoiExport("templates/teachoutlinev1.docx", tempDir, str, map, request, response);
        return AjaxResult.success(name);
    }

}
