package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TScore;

/**
 * 分数Service接口
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
public interface ITScoreService 
{
    /**
     * 查询分数
     * 
     * @param id 分数主键
     * @return 分数
     */
    public TScore selectTScoreById(Long id);

    /**
     * 查询分数列表
     * 
     * @param tScore 分数
     * @return 分数集合
     */
    public List<TScore> selectTScoreList(TScore tScore);

    /**
     * 新增分数
     * 
     * @param tScore 分数
     * @return 结果
     */
    public int insertTScore(TScore tScore);

    /**
     * 修改分数
     * 
     * @param tScore 分数
     * @return 结果
     */
    public int updateTScore(TScore tScore);

    /**
     * 批量删除分数
     * 
     * @param ids 需要删除的分数主键集合
     * @return 结果
     */
    public int deleteTScoreByIds(Long[] ids);

    /**
     * 删除分数信息
     * 
     * @param id 分数主键
     * @return 结果
     */
    public int deleteTScoreById(Long id);
}
