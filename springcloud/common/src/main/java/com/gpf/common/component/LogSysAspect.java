package com.gpf.common.component;

import com.gpf.common.annotations.LogAnnotation;
import com.gpf.common.entities.OperationLog;
import com.gpf.common.serivce.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * @Description: 日志操作切面容器
 * @package: com.gpf.common.component
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:05
 */
@Configuration
@Aspect
@Slf4j
public class LogSysAspect implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    //切点命名,将自定义注解命名为切点
    @Pointcut("@annotation(com.gpf.common.annotations.LogAnnotation)")
    public void logAnnotationAspect() {
    }

    @After("logAnnotationAspect()")
    public void getBeforeInfo(JoinPoint joinPoint) {
        OperationLog operationLog = new OperationLog();
        //获取当前操作的类名
        String classPath = joinPoint.getTarget().getClass().getName();
        //获取类里面具体执行的方法名
        String methodName = joinPoint.getSignature().getName();

        try {
            //利用反射获取类中的所有方法
            Class clazz = Class.forName(classPath);
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                //确定调用的方法是什么，然后用反射获取注解里面的内容
                if (method.getName().equals(methodName)) {

                    operationLog.setOperation(method.getAnnotation(LogAnnotation.class).operation());
                    operationLog.setDescription(method.getAnnotation(LogAnnotation.class).description());
                    operationLog.setOperationObject(method.getAnnotation(LogAnnotation.class).table());

                    operationService().insert(operationLog);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public OperationService operationService() {
        return new OperationService() {
            @Override
            public void insert(OperationLog operationLog) {
                log.info("注解里的内容为：{}", operationLog);
            }
        };
    }


}
