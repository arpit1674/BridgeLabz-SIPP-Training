package week02_day5_Inheritance.HybridInheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.name = "Amit";
        chef.id = 101;
        chef.performDuties();

        Waiter waiter = new Waiter();
        waiter.name = "Raj";
        waiter.id = 102;
        waiter.performDuties();
    }
}
