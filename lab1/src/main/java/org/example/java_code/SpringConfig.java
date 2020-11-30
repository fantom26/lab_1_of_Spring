package org.example.java_code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public org.example.java_code.HelloService helloBean(){

        return new HelloService();
    }
}
