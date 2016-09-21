package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Developer on 2016/9/20.
 */
@Component
@Aspect
public class LoggingAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @After("allServiceMethodsPointcut()")
    public void logStringArguments(JoinPoint joinPoint) {
        LOGGER.debug(joinPoint.getSignature().getName() + " has invoked.");
    }

    //Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(com.example.service..*)")
    public void allServiceMethodsPointcut() {
    }
}
