package org.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutorAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationResources.xml");
        IHello hello = (IHello)ctx.getBean("helloService");
        hello.sayHello();
    }
}
