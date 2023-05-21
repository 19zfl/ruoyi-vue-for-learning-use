package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分数对象 t_score
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
public class TScore extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 创建人姓名 */
    @Excel(name = "创建人姓名")
    private String createUserName;

    /** 课程ID */
    @Excel(name = "课程ID")
    private Integer courseId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userId;

    /** 分数 */
    @Excel(name = "分数")
    private Long score;

    @Excel(name = "课程名称")
    private String courseName;

    @Excel(name = "学生姓名")
    private String stuName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

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
    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }

    public Integer getCourseId()
    {
        return courseId;
    }
    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public Integer getUserId()
    {
        return userId;
    }
    public void setScore(Long score)
    {
        this.score = score;
    }

    public Long getScore()
    {
        return score;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("createUserName", getCreateUserName())
            .append("courseId", getCourseId())
            .append("userId", getUserId())
            .append("score", getScore())
            .toString();
    }
}
