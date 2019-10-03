package com.gpf.common.annotations;

import java.lang.annotation.*;

/**
 * @Description: 日志自定义注解类
 * @package: com.gpf.common.annotations
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:16
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface  LogAnnotation {
    //操作
    String operation();
    //描述
    String description();
}
