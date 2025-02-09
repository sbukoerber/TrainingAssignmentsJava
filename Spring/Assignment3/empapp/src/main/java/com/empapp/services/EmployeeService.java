package com.empapp.services;

import com.empapp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee addEmployee (Employee employee);
    public Employee deleteEmployee (int id);
    public Employee updateEmployee (int id, Employee employee);
    public Employee getEmployeeById(int id);
}
