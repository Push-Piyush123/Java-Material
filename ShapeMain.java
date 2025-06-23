// Parent class
class Shape {
    void area() {
        System.out.println("Area method from Shape class.");
    }
}

// Child class Circle
class Circle extends Shape {
    void area() {
        double radius = 5;
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Child class Rectangle
class Rectangle extends Shape {
    void area() {
        double length = 4, width = 3;
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class ShapeMain {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
