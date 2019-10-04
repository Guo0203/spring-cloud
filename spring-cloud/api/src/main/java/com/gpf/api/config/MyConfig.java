package com.gpf.api.config;

import com.gpf.common.component.LogSysAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置类
 * @package: com.gpf.api.config
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 16:54
 */
@Configuration
public class MyConfig {

    @Bean
    public LogSysAspect setLogSysAspect(){
        return new LogSysAspect();
    }
}
