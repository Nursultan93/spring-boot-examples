package com.course.l1springboothelloworld.service;

import com.course.l1springboothelloworld.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee save(Employee employee);
    Employee update(Integer id, Employee employee);
    void delete(Integer id);
    Employee findEmployeeById();
}
