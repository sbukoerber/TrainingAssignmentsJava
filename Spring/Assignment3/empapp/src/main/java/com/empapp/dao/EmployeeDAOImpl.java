package com.empapp.dao;

import com.empapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository("employeeDAO")
@Profile("jdbc")
public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbctemplate;

    @Autowired
    public EmployeeDAOImpl(DataSource datasource) {
        this.jdbctemplate = new JdbcTemplate(datasource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbctemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        Employee emp = jdbctemplate.queryForObject(sql, new BeanPropertyRowMapper<>
                (Employee.class), id);
        if (emp != null) {
            return emp;
        } else {
            return null;
        }
    }

    @Override
    public Employee addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (name,dept,salary) VALUES(?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbctemplate.update(con -> {
            PreparedStatement statement = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDept());
            statement.setBigDecimal(3, employee.getSalary());
            return statement;
        }, keyHolder);
        Number Key = keyHolder.getKey();
        if (keyHolder != null){
           employee.setId(Key.intValue());
            }
        return employee;
    }

    @Override
    public Employee deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        int e1 = jdbctemplate.update(sql,id);
        return null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        String sql = "UPDATE employees SET name = ?, dept = ?, salary = ? WHERE id = ?";
        int e2= jdbctemplate.update(sql, employee.getName(), employee.getDept(), employee.getSalary(), id);
        return null;
    }
}
