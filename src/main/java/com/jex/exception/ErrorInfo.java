package com.jex.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 错误消息实体
 * </p>
 *
 * @author Jex
 * @since 2020-01-08
 */
@Data
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = 6001966082338217014L;
    private String code;
    private String message;
}
