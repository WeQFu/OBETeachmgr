package com.ruoyi.teachmgr.report.mapper;

import java.util.List;
import com.ruoyi.teachmgr.report.domain.UreportFileTbl;

/**
 * 报表清单Mapper接口
 * 
 * @author jzg
 * @date 2023-05-31
 */
public interface UreportFileTblMapper 
{
    /**
     * 查询报表清单
     * 
     * @param id 报表清单主键
     * @return 报表清单
     */
    public UreportFileTbl selectUreportFileTblById(Long id);

    /**
     * 查询报表清单列表
     * 
     * @param ureportFileTbl 报表清单
     * @return 报表清单集合
     */
    public List<UreportFileTbl> selectUreportFileTblList(UreportFileTbl ureportFileTbl);

    /**
     * 新增报表清单
     * 
     * @param ureportFileTbl 报表清单
     * @return 结果
     */
    public int insertUreportFileTbl(UreportFileTbl ureportFileTbl);

    /**
     * 修改报表清单
     * 
     * @param ureportFileTbl 报表清单
     * @return 结果
     */
    public int updateUreportFileTbl(UreportFileTbl ureportFileTbl);

    /**
     * 删除报表清单
     * 
     * @param id 报表清单主键
     * @return 结果
     */
    public int deleteUreportFileTblById(Long id);

    /**
     * 批量删除报表清单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUreportFileTblByIds(Long[] ids);
}
