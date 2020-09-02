package com.skarlatov.assignment;

import java.util.ArrayList;

public class ChairPerson implements FacultyComponent {
    ArrayList<FacultyComponent> subordinates = new ArrayList<>();
    private String name, dept, degree;
    private double salary;
    public  ChairPerson(){

    }
    public ChairPerson(String name, String dept, String degree, double salary){
        this.name = name;
        this.dept = dept;
        this.degree = degree;
        this.salary = salary;

    }
    public void getMyUnderlings(){
        for(FacultyComponent f : subordinates){

        }
    }
    @Override
    public void showDetails() {
        System.out.println( "heres some stuff about the chair person" +
                " name and sallayr whatever");
        for(FacultyComponent f : subordinates){
            System.out.println("h");
            f.showDetails();
        }
    }
    // TODO methods for handling the undersling, add, remove, etc.
    public void add(FacultyComponent f){
        subordinates.add(f);
    }
    public void remove(FacultyComponent f){
        subordinates.remove(f);
    }
    //TODO methods for handling member fields,
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
