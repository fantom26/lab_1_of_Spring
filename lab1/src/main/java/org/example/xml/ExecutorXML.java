package org.example.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutorXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationResources.xml");
        IHello hello = (IHello)context.getBean("hello");
        hello.sayHello();
    }
}
