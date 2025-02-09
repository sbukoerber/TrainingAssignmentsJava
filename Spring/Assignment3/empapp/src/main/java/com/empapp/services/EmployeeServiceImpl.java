package com.empapp.services;

import com.empapp.dao.EmployeeDAO;
import com.empapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl (EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
        return null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        employeeDAO.updateEmployee(id, employee);
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
}
