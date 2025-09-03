package com.ruoyi.iotmgr.devicemgt.controller;

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
import com.ruoyi.iotmgr.devicemgt.domain.IotDevice;
import com.ruoyi.iotmgr.devicemgt.service.IIotDeviceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备信息Controller
 * 
 * @author jzq
 * @date 2023-10-11
 */
@RestController
@RequestMapping("/devicemgt/deviceinfo")
public class IotDeviceController extends BaseController
{
    @Autowired
    private IIotDeviceService iotDeviceService;

    /**
     * 查询设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(IotDevice iotDevice)
    {
        startPage();
        List<IotDevice> list = iotDeviceService.selectIotDeviceList(iotDevice);
        return getDataTable(list);
    }

    /**
     * 导出设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:export')")
    @Log(title = "设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IotDevice iotDevice)
    {
        List<IotDevice> list = iotDeviceService.selectIotDeviceList(iotDevice);
        ExcelUtil<IotDevice> util = new ExcelUtil<IotDevice>(IotDevice.class);
        util.exportExcel(response, list, "设备信息数据");
    }

    /**
     * 获取设备信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:query')")
    @GetMapping(value = "/{deviceId}")
    public AjaxResult getInfo(@PathVariable("deviceId") Long deviceId)
    {
        return success(iotDeviceService.selectIotDeviceByDeviceId(deviceId));
    }

    /**
     * 新增设备信息
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:add')")
    @Log(title = "设备信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IotDevice iotDevice)
    {
        return toAjax(iotDeviceService.insertIotDevice(iotDevice));
    }

    /**
     * 修改设备信息
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:edit')")
    @Log(title = "设备信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IotDevice iotDevice)
    {
        return toAjax(iotDeviceService.updateIotDevice(iotDevice));
    }

    /**
     * 删除设备信息
     */
    @PreAuthorize("@ss.hasPermi('devicemgt:deviceinfo:remove')")
    @Log(title = "设备信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deviceIds}")
    public AjaxResult remove(@PathVariable Long[] deviceIds)
    {
        return toAjax(iotDeviceService.deleteIotDeviceByDeviceIds(deviceIds));
    }
}
