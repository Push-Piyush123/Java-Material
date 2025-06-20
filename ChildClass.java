// Interface one   Multiple Interface Inheritance
interface one {
    public void eat();  // abstract method
}

// Interface two
interface two {
    public void bark(); // abstract method
}

// Interface three extends both one and two
interface three extends one, two {
    public void meow(); // abstract method
}

// ChildClass implements interface three (which already includes one and two)
class ChildClass implements three {

    // Implement all abstract methods
    public void eat() {
        System.out.println("ChildClass is eating");
    }

    public void bark() {
        System.out.println("ChildClass is barking");
    }

    public void meow() {
        System.out.println("ChildClass is meowing");
    }

    public static void main(String[] args) {
        // Create object
        ChildClass c = new ChildClass();
        c.eat();
        c.bark();
        c.meow();
    }
}
