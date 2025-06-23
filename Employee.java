class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    // Method to display info
    void display() {
        System.out.println("----");
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Lata", 40000);
        Employee e2 = new Employee(2, "Kiran", 50000);
        Employee e3 = new Employee(3, "Piyush", 60000);

        e1.display();
        e2.display();
        e3.display();
    }
}
