package com.springboot.services;

import com.springboot.exceptions.EmployeeNotFoundException;
import com.springboot.repo.Employee;
import com.springboot.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.getEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee emp=employeeRepo.getById(id);
        if(emp!=null){
            return emp;
        }else{
            throw new EmployeeNotFoundException("Employee not found");
        }
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee emp1= employeeRepo.addEmployee(employee);
        return emp1;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee emp2=employeeRepo.updateEmployee(id, employee);
        return emp2;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee emp3=employeeRepo.removeEmployee(id);
        return emp3;
    }

}
