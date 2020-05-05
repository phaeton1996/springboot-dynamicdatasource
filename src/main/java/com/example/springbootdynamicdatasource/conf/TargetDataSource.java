package com.example.springbootdynamicdatasource.conf;

import java.lang.annotation.*;

/**
 * 数据源注解，用于设置数据源的 key，指定使用哪个数据源
 * @Target 用来约束注解可以应用的地方,
 *      TYPE：标明该注解可以用于类、接口（包括注解类型）或enum声明
 *      METHOD：方法
 * @Retention 用来约束注解的生命周期，分别有三个值
 *      源码级别（source），类文件级别（class）或者运行时级别（runtime）
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
