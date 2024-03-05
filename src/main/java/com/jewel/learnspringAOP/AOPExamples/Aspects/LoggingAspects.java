package com.jewel.learnspringAOP.AOPExamples.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//1: configuraion
//2:aop
@Configuration
@Aspect
public class LoggingAspects {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //3: Pointcut - when
    //@Pointcut
    //execution(* PACKAGE.*.*(..))
    //PACKAGE any method call howar age logMethodCall hobe, be carefull with ##SYNTAX
    @Before("execution(* com.jewel.learnspringAOP.AOPExamples.*.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint){
        //4: logic - what
        logger.info("Before Aspect - method is called -{}",joinPoint);
    }
}
