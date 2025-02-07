package com.tit.day05javainheritance.assistproblems.EmployManagementsystem;

public class Employee {

    private String name;
    private String id;
    private double salary;

    public Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public  double getSalary(){
        return salary;
    }

}
