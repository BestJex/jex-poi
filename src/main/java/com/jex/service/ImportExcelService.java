package com.jex.service;

import com.baomidou.mybatisplus.service.IService;
import com.jex.model.SoftwareMysql;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface ImportExcelService extends IService<SoftwareMysql> {
    int readExcel(MultipartFile file);

    void exportExcel(HttpServletResponse response);

}
