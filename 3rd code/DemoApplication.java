package com.example.demo;

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
    public ServletRegistrationBean<HCounterServlet> hCounterServletRegistration() {
        ServletRegistrationBean<HCounterServlet> registration = new ServletRegistrationBean<>(new HCounterServlet(), "/HCounterServlet");
        registration.setName("HCounterServlet");
        return registration;
    }
}
