package com.jex.controller;

import com.jex.service.ImportExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * excel 导入导出控制器
 *
 * @author Jex
 * @since 2020-01-08
 */
@Controller
@RequestMapping("/")
public class ImportAndExportExcelController {

    @Autowired
    private ImportExcelService importExcelService;

    /**
     * excel 导入
     * @author Jex
     */
    @PostMapping(value = "excel/insertExcel")
    public String insertExcel(@RequestParam("file") MultipartFile file,HttpServletResponse response,Model model) {
        try {
            int num = importExcelService.readExcel(file);

        }catch (Exception e){
            return  "导入异常"+e.toString();
        }
        this.exportExcel(response);
        model.addAttribute("message", "成功！");
        return "index";
    }

    /**
     * excel 导出
     * @author Jex
     */
    @GetMapping(value = "excel/exportExcel")
    public String exportExcel(HttpServletResponse response) {
        importExcelService.exportExcel(response);
        return "success";
    }

    /**
     * 显示页面
     * @author Jex
     */
    @GetMapping
    public String index(Model model) {
        model.addAttribute("message", "initHtml");
        return "index";
    }

}
