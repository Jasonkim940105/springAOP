package jaden.spring.something.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAsepct {

    @Around("@annotation(PerfLogging)")
    public Object logPref(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - start);
        return retVal;
    }

    @Before("@annotation(SayHello)") // before -> join point / @annotation pointcut -> 적용할 위치
    public void hell(){ // advice -> 수행할 작업
        System.out.println("Hello!");
    }


}
