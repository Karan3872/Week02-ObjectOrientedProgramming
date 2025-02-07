package com.tit.day05javainheritance.assistproblems.EmployManagementsystem;

public class Manager extends Employee{

    private int teamSize;

    public Manager(String name,String id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size : "+teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }
}
