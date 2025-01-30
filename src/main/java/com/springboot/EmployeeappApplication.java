package com.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;

@SpringBootApplication

public class EmployeeappApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeappApplication.class, args);
    }
}
