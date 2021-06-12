package com.test.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class AroundAspect {
    private Logger logger=LoggerFactory.getLogger(this.getClass());	
    @Around(value = "execution(* com.test.aop.business.*.*(..))")
    public void executionTimeCalculation(ProceedingJoinPoint jp) throws Throwable{
        long startTime=System.currentTimeMillis();
        jp.proceed();
        long timeTaken=System.currentTimeMillis()-startTime;
        logger.info("{} taken time for execution is {}",jp,timeTaken); 
    }
}
