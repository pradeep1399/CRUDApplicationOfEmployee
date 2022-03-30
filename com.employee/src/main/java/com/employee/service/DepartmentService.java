package com.employee.service;

import com.employee.model.Department;
import com.employee.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartments() {
        return  departmentRepository.findAll();
    }

    public Optional<Department> getEmployeeByDepartmentId(int deptId) {
        return departmentRepository.findById(deptId);
    }

//    public List<Department> getEmployeeByDepartmentName(String deptName) {
//        Iterable<Department> depts = departmentRepository.findAll();
//        List<Department> departments = new ArrayList<>();
//        for(Department dept: depts){
//            if(dept.equals(deptName));
//                departments.add(dept);
//            }
//        return departments;
//
//    }


}
