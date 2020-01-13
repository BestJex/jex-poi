package com.jex.exception;

/**
 * <p>
 *     自定义异常
 * </p>
 *
 * @author Jex
 * @since 2020-01-08
 */
public class NotFoundException  extends RuntimeException {
    private static final long serialVersionUID = 5958859330138413563L;

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);
    }
}
