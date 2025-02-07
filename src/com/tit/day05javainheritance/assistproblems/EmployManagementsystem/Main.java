package com.tit.day05javainheritance.assistproblems.EmployManagementsystem;

public class Main {

    public static void main(String[] args) {

        Employee manager = new Manager("John","100",50000,20);
        Employee developer = new Developer("Khabby","111",46000,"Java");
        Employee intern = new Intern("Bertha","1919C",29000,"Oxford");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();

    }

}
