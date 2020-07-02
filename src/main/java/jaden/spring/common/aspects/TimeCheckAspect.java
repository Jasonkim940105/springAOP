package jaden.spring.common.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeCheckAspect {
    @Around("@annotation(jaden.spring.common.annotation.TimeCheck)")
    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
        String string = joinPoint.getSignature().toShortString();
        long begin = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        System.out.println(string + " 종료");
        System.out.println(System.currentTimeMillis() - begin);
        return obj;
    }
}
