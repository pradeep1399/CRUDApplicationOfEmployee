package com.employee.service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
//    private EmployeeRepository employeeRepository;

//    private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1, "Pradeep", "Verma", 22, 18000, "Developement" ),
//            new Employee(2,"Yash","Sharma", 21, 75000, "JavaDevelopement" ),
//            new Employee(3,"Drishti"," Diwesh", 21,45000, "DevOps" )));

    public List<Employee> getEmployees(){
//          return employees;
//        List<Employee> employees = new ArrayList<>();
//        employeeRepository.findAll().forEach(employees::add);
//        return employees;
        return (List<Employee>) employeeRepository.findAll();

    }
    public Optional<Employee> getEmployee(int eId){

//        return employees.stream().filter(t -> t.geteId()==eId).findFirst().get();
        return employeeRepository.findById(eId);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    public void updateEmployee(int eId, Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int eId) {
        employeeRepository.deleteById(eId);
    }

}
