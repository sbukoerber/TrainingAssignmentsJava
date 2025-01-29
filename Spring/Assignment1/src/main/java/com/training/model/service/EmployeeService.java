package com.training.model.service;

import com.training.model.persistance.Employee;
import com.training.model.persistance.EmployeeDao;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee addEmployee (Employee employee);
    public void deleteEmployee (int id);
    public void updateEmployee (int id, Employee employee);
    public Employee getEmployeeById(int id);
}
