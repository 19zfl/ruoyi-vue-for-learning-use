package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TScoreMapper;
import com.ruoyi.system.domain.TScore;
import com.ruoyi.system.service.ITScoreService;

/**
 * 分数Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
@Service
public class TScoreServiceImpl implements ITScoreService 
{
    @Autowired
    private TScoreMapper tScoreMapper;

    /**
     * 查询分数
     * 
     * @param id 分数主键
     * @return 分数
     */
    @Override
    public TScore selectTScoreById(Long id)
    {
        return tScoreMapper.selectTScoreById(id);
    }

    /**
     * 查询分数列表
     * 
     * @param tScore 分数
     * @return 分数
     */
    @Override
    public List<TScore> selectTScoreList(TScore tScore)
    {
        return tScoreMapper.selectTScoreList(tScore);
    }

    /**
     * 新增分数
     * 
     * @param tScore 分数
     * @return 结果
     */
    @Override
    public int insertTScore(TScore tScore)
    {
        tScore.setCreateUserName(SecurityUtils.getLoginUser().getUser().getNickName());
        tScore.setCreateTime(DateUtils.getNowDate());
        return tScoreMapper.insertTScore(tScore);
    }

    /**
     * 修改分数
     * 
     * @param tScore 分数
     * @return 结果
     */
    @Override
    public int updateTScore(TScore tScore)
    {
        return tScoreMapper.updateTScore(tScore);
    }

    /**
     * 批量删除分数
     * 
     * @param ids 需要删除的分数主键
     * @return 结果
     */
    @Override
    public int deleteTScoreByIds(Long[] ids)
    {
        return tScoreMapper.deleteTScoreByIds(ids);
    }

    /**
     * 删除分数信息
     * 
     * @param id 分数主键
     * @return 结果
     */
    @Override
    public int deleteTScoreById(Long id)
    {
        return tScoreMapper.deleteTScoreById(id);
    }
}
