package com.ruoyi.iotmgr.controlmgt.controller;

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
import com.ruoyi.iotmgr.controlmgt.domain.IotControl;
import com.ruoyi.iotmgr.controlmgt.service.IIotControlService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 温度控制Controller
 * 
 * @author jzq
 * @date 2023-10-11
 */
@RestController
@RequestMapping("/controlmgt/tempcontrol")
public class IotControlController extends BaseController
{
    @Autowired
    private IIotControlService iotControlService;

    /**
     * 查询温度控制列表
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:list')")
    @GetMapping("/list")
    public TableDataInfo list(IotControl iotControl)
    {
        startPage();
        List<IotControl> list = iotControlService.selectIotControlList(iotControl);
        return getDataTable(list);
    }

    /**
     * 导出温度控制列表
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:export')")
    @Log(title = "温度控制", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IotControl iotControl)
    {
        List<IotControl> list = iotControlService.selectIotControlList(iotControl);
        ExcelUtil<IotControl> util = new ExcelUtil<IotControl>(IotControl.class);
        util.exportExcel(response, list, "温度控制数据");
    }

    /**
     * 获取温度控制详细信息
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:query')")
    @GetMapping(value = "/{controlId}")
    public AjaxResult getInfo(@PathVariable("controlId") Long controlId)
    {
        return success(iotControlService.selectIotControlByControlId(controlId));
    }

    /**
     * 新增温度控制
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:add')")
    @Log(title = "温度控制", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IotControl iotControl)
    {
        return toAjax(iotControlService.insertIotControl(iotControl));
    }

    /**
     * 修改温度控制
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:edit')")
    @Log(title = "温度控制", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IotControl iotControl)
    {
        return toAjax(iotControlService.updateIotControl(iotControl));
    }

    /**
     * 删除温度控制
     */
    @PreAuthorize("@ss.hasPermi('controlmgt:tempcontrol:remove')")
    @Log(title = "温度控制", businessType = BusinessType.DELETE)
	@DeleteMapping("/{controlIds}")
    public AjaxResult remove(@PathVariable Long[] controlIds)
    {
        return toAjax(iotControlService.deleteIotControlByControlIds(controlIds));
    }
}
