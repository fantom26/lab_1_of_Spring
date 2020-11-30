package org.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements IHello {
    @Override
    public void sayHello() {
        System.out.println("Say Hello World");
    }
}
