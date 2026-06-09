package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
// Indica que a classe contem regras de AOP
@Component
// Registra uma classe genérica como bean
public class LoggingAspect {

    // Before executa uma ação antes do metodo alvo
    // execution(...) define quais metodos serao interceptados
    @Before("execution(* com.example.aop.dummy.*.*(..))")
    // JoinPoint fornece informações sobre o metodo interceptado, como nome, argumentos, etc
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature());
    }

    //Intercepta ambos os subpackages de com.example.aop
    // ou seja, o metodo hello tambem é impresso
    /* @Before("execution(* com.example.aop..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature());
    }*/
}
