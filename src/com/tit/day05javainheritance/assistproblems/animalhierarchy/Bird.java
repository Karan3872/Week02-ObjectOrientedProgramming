package com.tit.day05javainheritance.assistproblems.animalhierarchy;

public class Bird extends Animal{

    public Bird(String name,int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Chirp Chirp");
    }

}
