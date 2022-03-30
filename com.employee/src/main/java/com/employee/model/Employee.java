package com.employee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int eId;
    private String eFName;
    private String eLName;
    private int age;
    private int salary;
//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Department> department;

    public Employee (){}

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteFName() {
        return eFName;
    }

    public void seteFName(String eFName) {
        this.eFName = eFName;
    }

    public String geteLName() {
        return eLName;
    }

    public void seteLName(String eLName) {
        this.eLName = eLName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

}

