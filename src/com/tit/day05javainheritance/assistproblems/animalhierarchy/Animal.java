package com.tit.day05javainheritance.assistproblems.animalhierarchy;

public class Animal {

private String name;
private int age;

Animal(String name,int age){
    this.name=name;
    this.age=age;
}

public void makeSound(){
    System.out.println("Animal sound");
}

public String getName(){
    return  name;
}

public int getAge(){
    return age;
}

}
