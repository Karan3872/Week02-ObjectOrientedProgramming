package com.tit.day05javainheritance.HybridInheritance.RestorantManagementSystem;

///import com.tit.day05javainheritance.HybridInheritance.Person;

class Chef extends Person implements Worker {

    Chef(String name,int id){
        super(name, id);
    }

    @Override
    public void performDuties(){
        System.out.println("Chef preparing meal or works with staff");
    }

    public void displayDetails() {
    }
}