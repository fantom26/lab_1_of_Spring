package org.example.java_code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class
ExecutorJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloService helloService = (HelloService) context.getBean("helloBean");
        helloService.sayHello();
    }
}
