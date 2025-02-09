package com.empapp.dao;

import com.empapp.entities.Employee;

import java.security.PublicKey;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee addEmployee ( Employee employee);
    public Employee deleteEmployee (int id);
    public Employee updateEmployee (int id, Employee employee);
    public Employee getEmployeeById(int id);
}
