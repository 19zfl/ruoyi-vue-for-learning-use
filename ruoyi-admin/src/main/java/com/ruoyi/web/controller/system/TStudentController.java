package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.weaver.loadtime.Aj;
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
import com.ruoyi.system.domain.TStudent;
import com.ruoyi.system.service.ITStudentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生Controller
 * 
 * @author ruoyi
 * @date 2023-05-20
 */
@RestController
@RequestMapping("/system/student")
public class TStudentController extends BaseController
{
    @Autowired
    private ITStudentService tStudentService;

    /**
     * 查询学生列表
     */
    @PreAuthorize("@ss.hasPermi('system:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(TStudent tStudent)
    {
        startPage();
        List<TStudent> list = tStudentService.selectTStudentList(tStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生列表
     */
    @PreAuthorize("@ss.hasPermi('system:student:export')")
    @Log(title = "学生", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TStudent tStudent)
    {
        List<TStudent> list = tStudentService.selectTStudentList(tStudent);
        ExcelUtil<TStudent> util = new ExcelUtil<TStudent>(TStudent.class);
        util.exportExcel(response, list, "学生数据");
    }

    /**
     * 获取学生详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:query')")
    @GetMapping(value = "/{stuId}")
    public AjaxResult getInfo(@PathVariable("stuId") Long stuId)
    {
        return success(tStudentService.selectTStudentByStuId(stuId));
    }

    /**
     * 新增学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:add')")
    @Log(title = "学生", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TStudent tStudent)
    {
        return toAjax(tStudentService.insertTStudent(tStudent));
    }

    /**
     * 修改学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:edit')")
    @Log(title = "学生", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TStudent tStudent)
    {
        return toAjax(tStudentService.updateTStudent(tStudent));
    }

    /**
     * 删除学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:remove')")
    @Log(title = "学生", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stuIds}")
    public AjaxResult remove(@PathVariable Long[] stuIds)
    {
        return toAjax(tStudentService.deleteTStudentByStuIds(stuIds));
    }

    /**
     * 查询学生列表-不分页
     */
    @GetMapping("/toScoreStudentList")
    public AjaxResult toScoreStudentList()
    {
        List<TStudent> list = tStudentService.toScoreStudentList();
        return AjaxResult.success(list);
    }

}
