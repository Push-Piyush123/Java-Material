// Program for Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Create object of parent class
        Animal a = new Animal();
        a.eat();

        // Create object of child class
        Cat c = new Cat();
        c.eat();   // Inherited method from Animal
        c.meow();  // Own method of Cat
    }
}
