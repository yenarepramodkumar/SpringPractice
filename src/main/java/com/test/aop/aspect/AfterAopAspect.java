package com.test.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger=LoggerFactory.getLogger(this.getClass());	
    @AfterReturning(value = "execution(* com.test.aop.business.*.*(..))",returning = "result")
    public void afterReturnig(JoinPoint jp,Object result){
        logger.info("{} return with value {}",jp,result); 
    }
    @AfterThrowing(value = "execution(* com.test.aop.business.*.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint jp,Object exception){
        logger.info("{} return with exception {}",jp,exception); 
    }
    @After(value = "execution(* com.test.aop.business.*.*(..))")
    public void afterThrowing(JoinPoint jp){
        logger.info("{} is completed",jp); 
    }


}
