package com.jewel.learnspringAOP.AOPExamples.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("com.jewel.learnspringAOP.AOPExamples.Aspects.CommonPointCutConfig.bussinesAndDataPackageConfig()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //start time
        //proceed execution of method
        //end time
        //calculate performance

        long startTimeMilis = System.currentTimeMillis();
        Object returnValue = proceedingJoinPoint.proceed();
        long endTimeMilis = System.currentTimeMillis();
        long executionTime = endTimeMilis - startTimeMilis;

        logger.info("Arround aspect - {} Method executed in {} ms",proceedingJoinPoint,executionTime);
        return  returnValue;
    }
}
