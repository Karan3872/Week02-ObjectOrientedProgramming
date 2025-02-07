package com.tit.day05javainheritance.assistproblems.EmployManagementsystem;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name,String id,double salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming language : "+programmingLanguage);
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

}
