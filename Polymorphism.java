class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
  
    void sound() {
        super.sound(); // Calls the method in Animal class
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        super.sound(); // Calls the method in Animal class
        System.out.println("Cat meows");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
    
}
