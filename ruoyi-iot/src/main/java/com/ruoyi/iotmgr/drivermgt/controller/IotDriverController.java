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
import com.ruoyi.iotmgr.drivermgt.domain.IotDriver;
import com.ruoyi.iotmgr.drivermgt.service.IIotDriverService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 协议驱动Controller
 * 
 * @author jzq
 * @date 2023-10-11
 */
@RestController
@RequestMapping("/drivermgt/driver")
public class IotDriverController extends BaseController
{
    @Autowired
    private IIotDriverService iotDriverService;

    /**
     * 查询协议驱动列表
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:list')")
    @GetMapping("/list")
    public TableDataInfo list(IotDriver iotDriver)
    {
        startPage();
        List<IotDriver> list = iotDriverService.selectIotDriverList(iotDriver);
        return getDataTable(list);
    }

    /**
     * 导出协议驱动列表
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:export')")
    @Log(title = "协议驱动", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IotDriver iotDriver)
    {
        List<IotDriver> list = iotDriverService.selectIotDriverList(iotDriver);
        ExcelUtil<IotDriver> util = new ExcelUtil<IotDriver>(IotDriver.class);
        util.exportExcel(response, list, "协议驱动数据");
    }

    /**
     * 获取协议驱动详细信息
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:query')")
    @GetMapping(value = "/{driverId}")
    public AjaxResult getInfo(@PathVariable("driverId") Long driverId)
    {
        return success(iotDriverService.selectIotDriverByDriverId(driverId));
    }

    /**
     * 新增协议驱动
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:add')")
    @Log(title = "协议驱动", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IotDriver iotDriver)
    {
        return toAjax(iotDriverService.insertIotDriver(iotDriver));
    }

    /**
     * 修改协议驱动
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:edit')")
    @Log(title = "协议驱动", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IotDriver iotDriver)
    {
        return toAjax(iotDriverService.updateIotDriver(iotDriver));
    }

    /**
     * 删除协议驱动
     */
    @PreAuthorize("@ss.hasPermi('drivermgt:driver:remove')")
    @Log(title = "协议驱动", businessType = BusinessType.DELETE)
	@DeleteMapping("/{driverIds}")
    public AjaxResult remove(@PathVariable Long[] driverIds)
    {
        return toAjax(iotDriverService.deleteIotDriverByDriverIds(driverIds));
    }
}
