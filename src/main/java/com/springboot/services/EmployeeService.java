package com.springboot.services;

import com.springboot.repo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployeeById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int id, Employee employee);
    public Employee removeEmployee(int id);
}
