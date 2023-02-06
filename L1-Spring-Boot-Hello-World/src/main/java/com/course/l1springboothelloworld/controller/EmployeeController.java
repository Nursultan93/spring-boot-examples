package com.course.l1springboothelloworld.controller;

import com.course.l1springboothelloworld.model.Employee;
import com.course.l1springboothelloworld.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/save-employee")
    public Employee saveEmp(@RequestBody Employee employee) {
        log.info("Emp: "+employee);

        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") Integer id){
        log.info("Id: "+id);
        return employeeService.findEmployeeById(id);
    }

    @PutMapping("{id}")
    public Employee update(@PathVariable("id") Integer id, @RequestBody Employee employee){
        log.info("Id: "+id);
        log.info("Emp:" +employee);
        return employeeService.update(id, employee);
    }

    @DeleteMapping("")
    public void delete(@RequestParam("id") Integer id) {
        log.info("ID: "+id);
        employeeService.delete(id);
    }
}
