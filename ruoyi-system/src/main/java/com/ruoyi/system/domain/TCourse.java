package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程对象 t_course
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
public class TCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 创建人姓名 */
    @Excel(name = "创建人姓名")
    private String createUserName;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程状态（1：不可用；2：可用） */
    @Excel(name = "课程状态", readConverterExp = "1=：不可用；2：可用")
    private Integer courseStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCreateUserName(String createUserName) 
    {
        this.createUserName = createUserName;
    }

    public String getCreateUserName() 
    {
        return createUserName;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseStatus(Integer courseStatus) 
    {
        this.courseStatus = courseStatus;
    }

    public Integer getCourseStatus() 
    {
        return courseStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("createUserName", getCreateUserName())
            .append("courseName", getCourseName())
            .append("courseStatus", getCourseStatus())
            .toString();
    }
}
