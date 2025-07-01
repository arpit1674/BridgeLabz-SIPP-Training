package week02_day5_Inheritance.AssistedProblems;

class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Tweet");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
