package com.employee.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    private int departmentId;
    private String departmentName;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> employee;

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId(){
        return departmentId;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public String getDepartment(){
        return departmentName;
    }


}
