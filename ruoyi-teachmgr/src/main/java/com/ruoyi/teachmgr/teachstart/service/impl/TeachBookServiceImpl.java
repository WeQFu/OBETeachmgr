package com.ruoyi.teachmgr.teachstart.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teachmgr.teachstart.mapper.TeachBookMapper;
import com.ruoyi.teachmgr.teachstart.domain.TeachBook;
import com.ruoyi.teachmgr.teachstart.service.ITeachBookService;

/**
 * 教材管理Service业务层处理
 * 
 * @author jzg
 * @date 2023-05-15
 */
@Service
public class TeachBookServiceImpl implements ITeachBookService 
{
    @Autowired
    private TeachBookMapper teachBookMapper;

    /**
     * 查询教材管理
     * 
     * @param bookId 教材管理主键
     * @return 教材管理
     */
    @Override
    public TeachBook selectTeachBookByBookId(Long bookId)
    {
        return teachBookMapper.selectTeachBookByBookId(bookId);
    }

    /**
     * 查询教材管理列表
     * 
     * @param teachBook 教材管理
     * @return 教材管理
     */
    @Override
    public List<TeachBook> selectTeachBookList(TeachBook teachBook)
    {
        return teachBookMapper.selectTeachBookList(teachBook);
    }

    /**
     * 新增教材管理
     * 
     * @param teachBook 教材管理
     * @return 结果
     */
    @Override
    public int insertTeachBook(TeachBook teachBook)
    {
        teachBook.setCreateTime(DateUtils.getNowDate());
        return teachBookMapper.insertTeachBook(teachBook);
    }

    /**
     * 修改教材管理
     * 
     * @param teachBook 教材管理
     * @return 结果
     */
    @Override
    public int updateTeachBook(TeachBook teachBook)
    {
        teachBook.setUpdateTime(DateUtils.getNowDate());
        return teachBookMapper.updateTeachBook(teachBook);
    }

    /**
     * 批量删除教材管理
     * 
     * @param bookIds 需要删除的教材管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachBookByBookIds(Long[] bookIds)
    {
        return teachBookMapper.deleteTeachBookByBookIds(bookIds);
    }

    /**
     * 删除教材管理信息
     * 
     * @param bookId 教材管理主键
     * @return 结果
     */
    @Override
    public int deleteTeachBookByBookId(Long bookId)
    {
        return teachBookMapper.deleteTeachBookByBookId(bookId);
    }
}
