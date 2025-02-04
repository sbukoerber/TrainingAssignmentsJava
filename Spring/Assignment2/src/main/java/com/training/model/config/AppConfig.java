package com.training.model.config;

import com.training.model.persistance.EmployeeDao;
import com.training.model.persistance.impl.EmployeeDaoImp;
import com.training.model.service.EmployeeService;
import com.training.model.service.EmployeeServiceImpl;
import com.training.model.service.aspect.MethodLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.assignment2")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public MethodLogger methodLogger() {
        return new MethodLogger();
    }
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }
    @Bean
    public EmployeeDao employeeDao() {
        return new EmployeeDaoImp();
    }
}