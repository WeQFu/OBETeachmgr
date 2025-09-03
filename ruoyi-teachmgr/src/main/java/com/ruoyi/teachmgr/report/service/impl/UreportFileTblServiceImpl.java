package com.ruoyi.teachmgr.report.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.report.mapper.UreportFileTblMapper;
import com.ruoyi.teachmgr.report.domain.UreportFileTbl;
import com.ruoyi.teachmgr.report.service.IUreportFileTblService;

/**
 * 报表清单Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-31
 */
@Service
public class UreportFileTblServiceImpl implements IUreportFileTblService 
{
    @Autowired
    private UreportFileTblMapper ureportFileTblMapper;

    /**
     * 查询报表清单
     * 
     * @param id 报表清单主键
     * @return 报表清单
     */
    @Override
    public UreportFileTbl selectUreportFileTblById(Long id)
    {
        return ureportFileTblMapper.selectUreportFileTblById(id);
    }

    /**
     * 查询报表清单列表
     * 
     * @param ureportFileTbl 报表清单
     * @return 报表清单
     */
    @Override
    public List<UreportFileTbl> selectUreportFileTblList(UreportFileTbl ureportFileTbl)
    {
        return ureportFileTblMapper.selectUreportFileTblList(ureportFileTbl);
    }

    /**
     * 新增报表清单
     * 
     * @param ureportFileTbl 报表清单
     * @return 结果
     */
    @Override
    public int insertUreportFileTbl(UreportFileTbl ureportFileTbl)
    {
        ureportFileTbl.setCreateTime(DateUtils.getNowDate());
        return ureportFileTblMapper.insertUreportFileTbl(ureportFileTbl);
    }

    /**
     * 修改报表清单
     * 
     * @param ureportFileTbl 报表清单
     * @return 结果
     */
    @Override
    public int updateUreportFileTbl(UreportFileTbl ureportFileTbl)
    {
        ureportFileTbl.setUpdateTime(DateUtils.getNowDate());
        return ureportFileTblMapper.updateUreportFileTbl(ureportFileTbl);
    }

    /**
     * 批量删除报表清单
     * 
     * @param ids 需要删除的报表清单主键
     * @return 结果
     */
    @Override
    public int deleteUreportFileTblByIds(Long[] ids)
    {
        return ureportFileTblMapper.deleteUreportFileTblByIds(ids);
    }

    /**
     * 删除报表清单信息
     * 
     * @param id 报表清单主键
     * @return 结果
     */
    @Override
    public int deleteUreportFileTblById(Long id)
    {
        return ureportFileTblMapper.deleteUreportFileTblById(id);
    }
}
