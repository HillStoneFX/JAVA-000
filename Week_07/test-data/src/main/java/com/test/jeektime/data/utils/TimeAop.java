package com.test.jeektime.data.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Aspect
@Component
public class TimeAop {

    @Pointcut("execution(public * com.test.jeektime.data.service.*.*(..))")
    public void run(){}

    @Around("run()")
    public Object arround(ProceedingJoinPoint point){
        LocalDateTime localDateTime = LocalDateTime.now();
        try{
            return point.proceed();
        } catch (Throwable e){
            System.out.println(e);
        } finally {
            System.out.println(point.getTarget().getClass().getName() + " cost: " +  java.time.Duration.between(localDateTime, LocalDateTime.now()).toMillis() + " ms");
        }

        return null;
    }
}