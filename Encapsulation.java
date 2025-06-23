// Encapsulated class (non-public)
class Student {
    // Private data members
    private String name;
    private int age;

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}

// Main class (public)
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Lata Koli");
        s.setAge(22);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
