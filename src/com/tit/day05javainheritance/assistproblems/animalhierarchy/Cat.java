package com.tit.day05javainheritance.assistproblems.animalhierarchy;

public class Cat extends Animal {

    public Cat(String name,int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Meow Meow");
    }

}
