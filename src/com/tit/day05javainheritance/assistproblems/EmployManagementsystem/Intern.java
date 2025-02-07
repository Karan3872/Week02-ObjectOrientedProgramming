package com.tit.day05javainheritance.assistproblems.EmployManagementsystem;

import java.awt.*;

public class Intern extends Employee {

    private String collegeName;

    public Intern(String name,String id,double salary,String collegeName){
        super(name, id, salary);
        this.collegeName=collegeName;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("College Name : "+collegeName);
    }

    public String getCollegeName(){
        return collegeName;
    }

}
