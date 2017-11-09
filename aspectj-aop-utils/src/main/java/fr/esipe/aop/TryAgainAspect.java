package fr.esipe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author Warren D'ALMEIDA
 */
@Component
@Aspect
public class TryAgainAspect {

    @Pointcut("@annotation(TryAgain)")
    public void again(ArrayList list) {}

    @Around("again(list) && execution(* *(..))")
    public Object tryagain(ProceedingJoinPoint joinPoint, ArrayList<Class> list) throws Throwable {
        return joinPoint.proceed();
    }
}
