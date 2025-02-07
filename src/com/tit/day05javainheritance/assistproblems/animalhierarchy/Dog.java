package com.tit.day05javainheritance.assistproblems.animalhierarchy;

public class Dog extends Animal {

   public Dog(String name,int age){
       super(name,age);
   }

   public void makeSound(){
       System.out.println("woof woof");
   }

}
