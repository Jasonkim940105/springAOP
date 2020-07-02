package jaden.spring.common.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution( * jaden.spring.board..*.*(..))")
    public void before(){
        System.out.println("메소드 수행 전 실행");
    }

    @AfterReturning(pointcut = "@annotation(jaden.spring.common.annotation.AfterReturn)", returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("메소드 정상 수행 후 실행 리턴값 : " + ret);
    }
    @AfterThrowing(pointcut = "execution(* jaden.spring.board.service..*.*(..))", throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("메소드 실행 중 예외발생 : " + e);
    }
    @After("execution(* jaden.spring.board..*.*(..))")
    public void after(){
        System.out.println("메소드 실행 후 반드시 실행");
    }

}
