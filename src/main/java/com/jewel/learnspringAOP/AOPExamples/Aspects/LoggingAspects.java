package com.jewel.learnspringAOP.AOPExamples.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
    @Before("com.jewel.learnspringAOP.AOPExamples.Aspects.CommonPointCutConfig.allPackageConfigusingBean()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        //4: logic - what
        logger.info("logMethod call before The  { } is called",joinPoint);
    }

    @After("com.jewel.learnspringAOP.AOPExamples.Aspects.CommonPointCutConfig.DataPackageConfig()")
    public void logMethodCallafterExecution(JoinPoint joinPoint){
        //4: logic - what
        logger.info("logMethod call after The  :{ } is called",joinPoint);
    }

    @AfterThrowing(
            pointcut = "com.jewel.learnspringAOP.AOPExamples.Aspects.CommonPointCutConfig.bussinesPackageConfig()",
            throwing = "exception")
    public void logMethodCallAfterExecution(JoinPoint joinPoint,Exception exception){
        //4: logic - what
        logger.info("AfterThrowing aspects {} has thrown an exception { } ",joinPoint,exception);
    }

    @AfterReturning(
            pointcut = "com.jewel.learnspringAOP.AOPExamples.Aspects.CommonPointCutConfig.DataPackageConfig()",
            returning = "resultValue")
    public void logMethodCallAfterSuccessfullExecution(JoinPoint joinPoint,Object resultValue){
        //4: logic - what
        logger.info("AfterReturning aspects {} has returned :  { } ",joinPoint,resultValue);
    }

}
