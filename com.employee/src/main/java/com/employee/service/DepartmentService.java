package com.employee.service;

import com.employee.model.Department;
import com.employee.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartments() {
        return  departmentRepository.findAll();
    }

//    public Optional<Department> getEmployeeByDepartmentId(int deptId) {
//        return departmentRepository.findById(deptId);
//    }

    public List<Department> getEmployeeByDepartmentName(String deptName) {
        List<Department> departments = new ArrayList<>();
        for(Department dept: departmentRepository.findAll()){
            if(dept.getDepartment().equals(deptName))
                departments.add(dept);
            }
        return departments;

    }


}
