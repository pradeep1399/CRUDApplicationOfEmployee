package com.employee.controller;

import com.employee.model.Department;
import com.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getDepartmentDetails(){
        return departmentService.getDepartments();
    }

//    @GetMapping("/departments/{deptId}")
//    public Optional<Department> getEmployeeByDepartment(@PathVariable int deptId){
//        return departmentService.getEmployeeByDepartmentId(deptId);
//    }

    @GetMapping("/departments/{deptName}")
    public List<Department> getEmployeeByDepartment(@PathVariable String deptName){
        return departmentService.getEmployeeByDepartmentName(deptName);
    }

}
