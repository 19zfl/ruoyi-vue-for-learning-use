package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TCourseMapper;
import com.ruoyi.system.domain.TCourse;
import com.ruoyi.system.service.ITCourseService;

/**
 * 课程Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
@Service
public class TCourseServiceImpl implements ITCourseService 
{
    @Autowired
    private TCourseMapper tCourseMapper;

    /**
     * 查询课程
     * 
     * @param id 课程主键
     * @return 课程
     */
    @Override
    public TCourse selectTCourseById(Long id)
    {
        return tCourseMapper.selectTCourseById(id);
    }

    /**
     * 查询课程列表
     * 
     * @param tCourse 课程
     * @return 课程
     */
    @Override
    public List<TCourse> selectTCourseList(TCourse tCourse)
    {
        return tCourseMapper.selectTCourseList(tCourse);
    }

    /**
     * 新增课程
     * 
     * @param tCourse 课程
     * @return 结果
     */
    @Override
    public int insertTCourse(TCourse tCourse)
    {
        tCourse.setCreateUserName(SecurityUtils.getLoginUser().getUser().getNickName());
        tCourse.setCreateTime(DateUtils.getNowDate());
        return tCourseMapper.insertTCourse(tCourse);
    }

    /**
     * 修改课程
     * 
     * @param tCourse 课程
     * @return 结果
     */
    @Override
    public int updateTCourse(TCourse tCourse)
    {
        return tCourseMapper.updateTCourse(tCourse);
    }

    /**
     * 批量删除课程
     * 
     * @param ids 需要删除的课程主键
     * @return 结果
     */
    @Override
    public int deleteTCourseByIds(Long[] ids)
    {
        return tCourseMapper.deleteTCourseByIds(ids);
    }

    /**
     * 删除课程信息
     * 
     * @param id 课程主键
     * @return 结果
     */
    @Override
    public int deleteTCourseById(Long id)
    {
        return tCourseMapper.deleteTCourseById(id);
    }

    /**
     * 查询状态为可用的课程列表
     *
     * @return  集合
     */
    @Override
    public List<TCourse> statusIsTwoCourseList() {
        TCourse tCourse = new TCourse();
        tCourse.setCourseStatus(2);
        List<TCourse> list = tCourseMapper.statusIsTwoCourseList(tCourse);
        return list;
    }
}
