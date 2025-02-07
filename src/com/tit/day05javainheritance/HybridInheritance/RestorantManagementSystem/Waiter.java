package com.tit.day05javainheritance.HybridInheritance.RestorantManagementSystem;

class Waiter extends Person implements Worker {

    Waiter(String name,int id){
        super(name, id);
    }

    @Override
    public void performDuties(){
        System.out.println("Taking order from customers and serve food");
    }

}
