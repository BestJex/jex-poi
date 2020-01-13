package com.jex.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jex.model.SoftwareMysql;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ImportExcelMapper extends BaseMapper<SoftwareMysql> {
    List<Map> selectExportExcel();
}
