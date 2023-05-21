package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TScore;
import com.ruoyi.system.service.ITScoreService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分数Controller
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
@RestController
@RequestMapping("/system/score")
public class TScoreController extends BaseController
{
    @Autowired
    private ITScoreService tScoreService;

    /**
     * 查询分数列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:list')")
    @GetMapping("/list")
    public TableDataInfo list(TScore tScore)
    {
        startPage();
        List<TScore> list = tScoreService.selectTScoreList(tScore);
        return getDataTable(list);
    }

    /**
     * 导出分数列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:export')")
    @Log(title = "分数", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TScore tScore)
    {
        List<TScore> list = tScoreService.selectTScoreList(tScore);
        ExcelUtil<TScore> util = new ExcelUtil<TScore>(TScore.class);
        util.exportExcel(response, list, "分数数据");
    }

    /**
     * 获取分数详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:score:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tScoreService.selectTScoreById(id));
    }

    /**
     * 新增分数
     */
    @PreAuthorize("@ss.hasPermi('system:score:add')")
    @Log(title = "分数", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TScore tScore)
    {
        return toAjax(tScoreService.insertTScore(tScore));
    }

    /**
     * 修改分数
     */
    @PreAuthorize("@ss.hasPermi('system:score:edit')")
    @Log(title = "分数", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TScore tScore)
    {
        return toAjax(tScoreService.updateTScore(tScore));
    }

    /**
     * 删除分数
     */
    @PreAuthorize("@ss.hasPermi('system:score:remove')")
    @Log(title = "分数", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tScoreService.deleteTScoreByIds(ids));
    }
}
