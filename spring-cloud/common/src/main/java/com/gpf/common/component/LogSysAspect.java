package com.gpf.common.component;

import com.gpf.common.annotations.LogAnnotation;
import com.gpf.common.entities.OperationLog;
import com.gpf.common.service.OperationLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.Method;

/**
 * @Description: 日志操作切面容器
 * @package: com.gpf.common.component
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:05
 */
@Aspect
public class LogSysAspect {

    private OperationLogService operationLogService;

    public LogSysAspect() {
    }

    public LogSysAspect(OperationLogService operationLogService) {
        this.operationLogService = operationLogService;
    }

    //切点命名,将自定义注解命名为切点
    @Pointcut("@annotation(com.gpf.common.annotations.LogAnnotation)")
    public void logAnnotationAspect(){};

    @After("logAnnotationAspect()")
    public void getBeforeInfo(JoinPoint joinPoint){
        //获取当前操作的类名
        String classPath = joinPoint.getTarget().getClass().getName();
        //获取类里面具体执行的方法名
        String methodName = joinPoint.getSignature().getName();

        try {
            //利用反射获取类中的所有方法
            Class clazz = Class.forName(classPath);
            Method[] methods = clazz.getMethods();
            for(Method method:methods){
                //确定调用的方法是什么，然后用反射获取注解里面的内容
                if(method.getName().equals(methodName)){
                    OperationLog operationLog = new OperationLog();
                    operationLog.setOperation(method.getAnnotation(LogAnnotation.class).operation());
                    operationLog.setDescription(method.getAnnotation(LogAnnotation.class).description());
                    operationLog.setOperationObject(method.getAnnotation(LogAnnotation.class).table());

//                    operationLogService.insert(operationLog);
                    System.out.println(operationLog);

                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
