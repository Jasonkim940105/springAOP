package jaden.spring.common.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloLogAspect {
    @After("@annotation(jaden.spring.common.annotation.HelloLog)")
    public void sayHello(){
        System.out.println("Hello!! ");
    }
}
