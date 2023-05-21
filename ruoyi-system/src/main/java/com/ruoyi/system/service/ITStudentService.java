package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TStudent;

/**
 * 学生Service接口
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
public interface ITStudentService 
{
    /**
     * 查询学生
     * 
     * @param stuId 学生主键
     * @return 学生
     */
    public TStudent selectTStudentByStuId(Long stuId);

    /**
     * 查询学生列表
     * 
     * @param tStudent 学生
     * @return 学生集合
     */
    public List<TStudent> selectTStudentList(TStudent tStudent);

    /**
     * 新增学生
     * 
     * @param tStudent 学生
     * @return 结果
     */
    public int insertTStudent(TStudent tStudent);

    /**
     * 修改学生
     * 
     * @param tStudent 学生
     * @return 结果
     */
    public int updateTStudent(TStudent tStudent);

    /**
     * 批量删除学生
     * 
     * @param stuIds 需要删除的学生主键集合
     * @return 结果
     */
    public int deleteTStudentByStuIds(Long[] stuIds);

    /**
     * 删除学生信息
     * 
     * @param stuId 学生主键
     * @return 结果
     */
    public int deleteTStudentByStuId(Long stuId);

    /**
     * 查询学生列表信息提供给分数管理
     *
     * @return
     */
    List<TStudent> toScoreStudentList();

}
