package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TStudentMapper;
import com.ruoyi.system.domain.TStudent;
import com.ruoyi.system.service.ITStudentService;

/**
 * 学生Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
@Service
public class TStudentServiceImpl implements ITStudentService 
{
    @Autowired
    private TStudentMapper tStudentMapper;

    /**
     * 查询学生
     * 
     * @param stuId 学生主键
     * @return 学生
     */
    @Override
    public TStudent selectTStudentByStuId(Long stuId)
    {
        return tStudentMapper.selectTStudentByStuId(stuId);
    }

    /**
     * 查询学生列表
     * 
     * @param tStudent 学生
     * @return 学生
     */
    @Override
    public List<TStudent> selectTStudentList(TStudent tStudent)
    {
        return tStudentMapper.selectTStudentList(tStudent);
    }

    /**
     * 新增学生
     * 
     * @param tStudent 学生
     * @return 结果
     */
    @Override
    public int insertTStudent(TStudent tStudent)
    {
        return tStudentMapper.insertTStudent(tStudent);
    }

    /**
     * 修改学生
     * 
     * @param tStudent 学生
     * @return 结果
     */
    @Override
    public int updateTStudent(TStudent tStudent)
    {
        return tStudentMapper.updateTStudent(tStudent);
    }

    /**
     * 批量删除学生
     * 
     * @param stuIds 需要删除的学生主键
     * @return 结果
     */
    @Override
    public int deleteTStudentByStuIds(Long[] stuIds)
    {
        return tStudentMapper.deleteTStudentByStuIds(stuIds);
    }

    /**
     * 删除学生信息
     * 
     * @param stuId 学生主键
     * @return 结果
     */
    @Override
    public int deleteTStudentByStuId(Long stuId)
    {
        return tStudentMapper.deleteTStudentByStuId(stuId);
    }

    /**
     * 查询学生列表信息提供给分数管理
     *
     * @return
     */
    @Override
    public List<TStudent> toScoreStudentList() {
        List<TStudent> list = tStudentMapper.toScoreStudentList();
        return list;
    }
}
