package com.springboot.repo;

import java.util.List;

public interface EmployeeRepo {
    public List<Employee> getEmployees();
    public Employee getById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int id, Employee employee);
    public Employee removeEmployee(int id);
}
