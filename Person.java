package HomeWork;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    // Constructor to initialize the fields
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Method to print user details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create a Person object and print the details
        Person person = new Person("Forrest", "Gump", 30, 50000.0);
        person.printDetails();
    }
}
