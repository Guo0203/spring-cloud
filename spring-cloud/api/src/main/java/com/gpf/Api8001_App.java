package com.gpf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 主启动类
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 14:28
 */
@SpringBootApplication
@MapperScan(value = "com.gpf.mapper")
public class Api8001_App {
    public static void main(String[] args) {
        SpringApplication.run(Api8001_App.class, args);
    }
}
