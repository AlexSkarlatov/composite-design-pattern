package com.skarlatov;


//this is ourcomposite of the url mapping uml mapping
//this represents the composite

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {



    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
//        TODO add member field called String description
        //some data about this directory type refactor lator
        //system.out.println(description);
        for(Employee e: employeeList){
            e.showEmployeeDetails();
        }
    }
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }
}
