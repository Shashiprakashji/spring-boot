package demo;


import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeCheckout() {
        System.out.println("Logging before checkout process.");
    }
    @After("execution(* *.*.checkout(..))")
    public void afterCheckout(){
        System.out.println("Logging after checkout process");
    }
}
