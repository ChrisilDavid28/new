//package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean<Servlet1> servlet1Registration() {
        ServletRegistrationBean<Servlet1> registration = new ServletRegistrationBean<>(new Servlet1(), "/Servlet1");
        registration.setName("Servlet1");
        return registration;
    }

    @Bean
public ServletRegistrationBean<Servlet2> servlet2Registration() {
    ServletRegistrationBean<Servlet2> registration = new ServletRegistrationBean<>(new Servlet2(), "/Servlet2");
    registration.setName("Servlet2");
    return registration;
}

}
