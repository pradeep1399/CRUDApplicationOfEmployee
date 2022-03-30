package com.employee.controller;

import com.employee.errorMessage.ResourceNotFoundException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //for fetching all record of employee details
    @RequestMapping("/employees")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployees();
    }

    //for fetching individual employee details
    @GetMapping("/employees/{eId}")
    public Optional<Employee> getEmployee(@PathVariable int eId) throws ResourceNotFoundException {
        Employee employee = employeeService.getEmployee(eId).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found for this eId: "+eId));
        return employeeService.getEmployee(eId);
    }

    //for adding new employee
    @PostMapping(value="/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    //to update the details of existing employee
    @PutMapping(value="/employees/{eId}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int eId)
            throws ResourceNotFoundException{
        Employee employee1 = employeeService.getEmployee(eId).orElseThrow(() ->
                new ResourceNotFoundException("Employee not found for this eID: " +eId));
        employee1.seteFName(employee.geteFName());
        employee1.seteLName(employee.geteLName());
        employee1.setAge(employee.getAge());
        employee1.setSalary(employee.getSalary());
        employee1.setDepartment(employee.getDepartment());

        employeeService.updateEmployee(eId, employee1);
    }

    //for delete the details of existing employee
    @DeleteMapping(value="/employees/{eId}")
    public void deleteEmployee(@PathVariable int eId) throws ResourceNotFoundException{
        Employee employee = employeeService.getEmployee(eId).orElseThrow(() ->
                new ResourceNotFoundException("Employee not found for this eId: " +eId));
        employeeService.deleteEmployee(eId);

    }

}
