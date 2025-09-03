package com.ruoyi.iotmgr.drivermgt.controller;

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
import com.ruoyi.iotmgr.drivermgt.domain.IotDriverAttribute;
import com.ruoyi.iotmgr.drivermgt.service.IIotDriverAttributeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 连接配置Controller
 * 
 * @author jzq
 * @date 2023-10-11
 */
@RestController
@RequestMapping("/drivermgt/driverattribute")
public class IotDriverAttributeController extends BaseController
{
    @Autowired
    private IIotDriverAttributeService iotDriverAttributeService;

    /**
     * 查询连接配置列表
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:list')")
    @GetMapping("/list")
    public TableDataInfo list(IotDriverAttribute iotDriverAttribute)
    {
        startPage();
        List<IotDriverAttribute> list = iotDriverAttributeService.selectIotDriverAttributeList(iotDriverAttribute);
        return getDataTable(list);
    }

    /**
     * 导出连接配置列表
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:export')")
    @Log(title = "连接配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IotDriverAttribute iotDriverAttribute)
    {
        List<IotDriverAttribute> list = iotDriverAttributeService.selectIotDriverAttributeList(iotDriverAttribute);
        ExcelUtil<IotDriverAttribute> util = new ExcelUtil<IotDriverAttribute>(IotDriverAttribute.class);
        util.exportExcel(response, list, "连接配置数据");
    }

    /**
     * 获取连接配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:query')")
    @GetMapping(value = "/{driverAttributeId}")
    public AjaxResult getInfo(@PathVariable("driverAttributeId") Long driverAttributeId)
    {
        return success(iotDriverAttributeService.selectIotDriverAttributeByDriverAttributeId(driverAttributeId));
    }

    /**
     * 新增连接配置
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:add')")
    @Log(title = "连接配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IotDriverAttribute iotDriverAttribute)
    {
        return toAjax(iotDriverAttributeService.insertIotDriverAttribute(iotDriverAttribute));
    }

    /**
     * 修改连接配置
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:edit')")
    @Log(title = "连接配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IotDriverAttribute iotDriverAttribute)
    {
        return toAjax(iotDriverAttributeService.updateIotDriverAttribute(iotDriverAttribute));
    }

    /**
     * 删除连接配置
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driverattribute:remove')")
    @Log(title = "连接配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{driverAttributeIds}")
    public AjaxResult remove(@PathVariable Long[] driverAttributeIds)
    {
        return toAjax(iotDriverAttributeService.deleteIotDriverAttributeByDriverAttributeIds(driverAttributeIds));
    }
}
