package com.jewel.learnspringAOP.AOPExamples.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
    @Pointcut("execution(* com.jewel.learnspringAOP.AOPExamples.*.*.*(..))")
    public void bussinesAndDataPackageConfig(){}

    @Pointcut("execution(* com.jewel.learnspringAOP.AOPExamples.Bussines.*.*(..))")
    public void bussinesPackageConfig(){}

    @Pointcut("execution(* com.jewel.learnspringAOP.AOPExamples.Data.*.*(..))")
    public void DataPackageConfig(){}

    @Pointcut("bean(*Service*)")    //any beans which contains service, -> intercepts
    public void allPackageConfigusingBean(){}

}
