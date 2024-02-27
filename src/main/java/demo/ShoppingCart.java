package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    //logging
    //authentication & authorization
    //sanitize data
    public void checkout(String status){
        System.out.println("checkout method from ShoppingCart Class");
    }
}
