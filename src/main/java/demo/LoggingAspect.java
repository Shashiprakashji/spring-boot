package demo;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public void demo.ShoppingCart.checkout())")
    public void logCheckout() {
        System.out.println("Logging before checkout process.");
    }
}
