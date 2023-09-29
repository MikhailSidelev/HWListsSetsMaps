package HomeWork;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        // Create a TreeMap to store Person objects with ascending keys
        TreeMap<Integer, Person> personMap = new TreeMap<>();

        // Add Person objects to the TreeMap
        personMap.put(3, new Person("Mikhail", "Sidelev",54, 80000.0));
        personMap.put(1, new Person("Bob", "Johnson", 30, 75000.0));
        personMap.put(2, new Person("Quan", "Dong Yao", 28, 55000.0));

        // Iterate through the TreeMap and print each object's details
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            int personId = entry.getKey();
            Person person = entry.getValue();

            System.out.println("Person ID: " + personId);
            person.printDetails();
            System.out.println();
        }
    }
}