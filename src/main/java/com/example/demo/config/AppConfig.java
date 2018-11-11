package com.example.demo.config;

import com.example.demo.serivce.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
