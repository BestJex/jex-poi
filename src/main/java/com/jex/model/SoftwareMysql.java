package com.jex.model;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author Jex
 * @since 2020-01-08
 */
@Data
@TableName("tb_software")
public class SoftwareMysql implements Serializable {

    private static final long serialVersionUID = 3830224355595558537L;

    private Long id;
    private String name;
    private String type;
    private String chargeType;

}
