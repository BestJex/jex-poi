package com.jex.mapper;

import com.jex.model.Oracle;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author Jex
 * @since 2020-01-08
 */
@Component
public interface OracleMapper {

    List<Oracle> selectOracleList();
}
