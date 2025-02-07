package com.tit.day05javainheritance.assistproblems.animalhierarchy;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Tommy",5);
        Animal cat = new Cat("kitty",3);
        Animal bird = new Bird("Chu Chu",1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }

}
