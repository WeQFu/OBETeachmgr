package com.ruoyi.iotmgr.gathermgt.controller;

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
import com.ruoyi.iotmgr.gathermgt.domain.IotTemperature;
import com.ruoyi.iotmgr.gathermgt.service.IIotTemperatureService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 温度采集Controller
 * 
 * @author jzq
 * @date 2023-10-11
 */
@RestController
@RequestMapping("/gathermgt/temperature")
public class IotTemperatureController extends BaseController
{
    @Autowired
    private IIotTemperatureService iotTemperatureService;

    /**
     * 查询温度采集列表
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:list')")
    @GetMapping("/list")
    public TableDataInfo list(IotTemperature iotTemperature)
    {
        startPage();
        List<IotTemperature> list = iotTemperatureService.selectIotTemperatureList(iotTemperature);
        return getDataTable(list);
    }

    /**
     * 导出温度采集列表
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:export')")
    @Log(title = "温度采集", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IotTemperature iotTemperature)
    {
        List<IotTemperature> list = iotTemperatureService.selectIotTemperatureList(iotTemperature);
        ExcelUtil<IotTemperature> util = new ExcelUtil<IotTemperature>(IotTemperature.class);
        util.exportExcel(response, list, "温度采集数据");
    }

    /**
     * 获取温度采集详细信息
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:query')")
    @GetMapping(value = "/{tempId}")
    public AjaxResult getInfo(@PathVariable("tempId") Long tempId)
    {
        return success(iotTemperatureService.selectIotTemperatureByTempId(tempId));
    }

    /**
     * 新增温度采集
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:add')")
    @Log(title = "温度采集", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IotTemperature iotTemperature)
    {
        return toAjax(iotTemperatureService.insertIotTemperature(iotTemperature));
    }

    /**
     * 修改温度采集
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:edit')")
    @Log(title = "温度采集", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IotTemperature iotTemperature)
    {
        return toAjax(iotTemperatureService.updateIotTemperature(iotTemperature));
    }

    /**
     * 删除温度采集
     */
    @PreAuthorize("@ss.hasPermi('gathermgt:temperature:remove')")
    @Log(title = "温度采集", businessType = BusinessType.DELETE)
	@DeleteMapping("/{tempIds}")
    public AjaxResult remove(@PathVariable Long[] tempIds)
    {
        return toAjax(iotTemperatureService.deleteIotTemperatureByTempIds(tempIds));
    }
}
