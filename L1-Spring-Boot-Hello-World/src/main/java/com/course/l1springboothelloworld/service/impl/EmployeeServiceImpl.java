package com.course.l1springboothelloworld.service.impl;

import com.course.l1springboothelloworld.model.Employee;
import com.course.l1springboothelloworld.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public List<Employee> getAllEmployee() {

        log.info("get All Employee");

        List<Employee> employeeList = new ArrayList<>();
        for (Employee emp: employeeMap.values()){
            employeeList.add(emp);
        }

        return employeeList;
    }

    @Override
    public Employee save(Employee employee) {

        log.info("save employee");

        employeeMap.put(employee.getId(), employee);

        return employee;
    }

    @Override
    public Employee update(Integer id, Employee employee) {


        employeeMap.put(id, employee);

        return findEmployeeById(id);
    }

    @Override
    public void delete(Integer id) {
        employeeMap.remove(id);
    }


    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeMap.get(id);
    }
}
