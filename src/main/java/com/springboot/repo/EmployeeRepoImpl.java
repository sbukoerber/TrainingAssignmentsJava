package com.springboot.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    private static Map<Integer, Employee> employeeMap=new HashMap<>();
    private static int counter;
    static{
        employeeMap.put(1, new Employee(1, "Keshav", "Bengaluru", "keshav@in.com"));
        employeeMap.put(2, new Employee(2, "Lokesh", "Hyderabad", "lokesh@in.com"));
        counter=2;
    }


    @Override
    public List<Employee> getEmployees(){
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee getById(int id){
        return employeeMap.get(id);
    } // Added the missing closing bracket

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setId(++counter);
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeToUpdate = getById(id);
        employeeToUpdate.setEmail(employee.getEmail());
        employeeMap.put(id, employeeToUpdate);
        return employeeToUpdate;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee employeeToRemove=getById(id);
        employeeMap.remove(id);
        return employeeToRemove;
    }
}