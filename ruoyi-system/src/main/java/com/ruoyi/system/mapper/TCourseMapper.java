package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TCourse;

/**
 * 课程Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
public interface TCourseMapper 
{
    /**
     * 查询课程
     * 
     * @param id 课程主键
     * @return 课程
     */
    public TCourse selectTCourseById(Long id);

    /**
     * 查询课程列表
     * 
     * @param tCourse 课程
     * @return 课程集合
     */
    public List<TCourse> selectTCourseList(TCourse tCourse);

    /**
     * 新增课程
     * 
     * @param tCourse 课程
     * @return 结果
     */
    public int insertTCourse(TCourse tCourse);

    /**
     * 修改课程
     * 
     * @param tCourse 课程
     * @return 结果
     */
    public int updateTCourse(TCourse tCourse);

    /**
     * 删除课程
     * 
     * @param id 课程主键
     * @return 结果
     */
    public int deleteTCourseById(Long id);

    /**
     * 批量删除课程
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTCourseByIds(Long[] ids);

    /**
     * 查询状态为可用的课程列表
     *
     * @param tCourse 课程状态
     * @return  集合
     */
    List<TCourse> statusIsTwoCourseList(TCourse tCourse);
}
