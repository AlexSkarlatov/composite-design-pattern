package com.skarlatov;

public class Company {
    public static void main(String[] args){
        Employee dev1 = new Developer(100, "Alexander Skarlatov", "Pro developer");
        Employee dev2 = new Developer(101, "Michael S", "jr developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager(200, "j", "SEO Manager");
        Employee man2 = new Manager(2020, "f", "SEO Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
