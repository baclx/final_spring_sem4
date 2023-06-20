package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);

    List<Employee> findAllEmployees();
}
