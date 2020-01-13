package com.jex.config.annotion;

import java.lang.annotation.*;

/**
 * <p>
 *     动态配置多数据源元注解
 * </p>
 *
 * @author Jex
 * @since 2020-01-08
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Documented
public @interface DynamicSource {

    String value() default "";
}
