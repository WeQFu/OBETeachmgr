package com.ruoyi.teachmgr.teachstart.service;

import java.util.List;
import com.ruoyi.teachmgr.teachstart.domain.TeachBook;

/**
 * 教材管理Service接口
 * 
 * @author jzg
 * @date 2023-05-15
 */
public interface ITeachBookService 
{
    /**
     * 查询教材管理
     * 
     * @param bookId 教材管理主键
     * @return 教材管理
     */
    public TeachBook selectTeachBookByBookId(Long bookId);

    /**
     * 查询教材管理列表
     * 
     * @param teachBook 教材管理
     * @return 教材管理集合
     */
    public List<TeachBook> selectTeachBookList(TeachBook teachBook);

    /**
     * 新增教材管理
     * 
     * @param teachBook 教材管理
     * @return 结果
     */
    public int insertTeachBook(TeachBook teachBook);

    /**
     * 修改教材管理
     * 
     * @param teachBook 教材管理
     * @return 结果
     */
    public int updateTeachBook(TeachBook teachBook);

    /**
     * 批量删除教材管理
     * 
     * @param bookIds 需要删除的教材管理主键集合
     * @return 结果
     */
    public int deleteTeachBookByBookIds(Long[] bookIds);

    /**
     * 删除教材管理信息
     * 
     * @param bookId 教材管理主键
     * @return 结果
     */
    public int deleteTeachBookByBookId(Long bookId);
}
