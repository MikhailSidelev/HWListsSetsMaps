package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        // Create an ArrayList to store integers with duplicates
        List<Integer> integers = new ArrayList<>();

        // Add integers to the collection (including duplicates)
        integers.add(5);
        integers.add(10);
        integers.add(5); // Duplicate
        integers.add(20);
        integers.add(10); // Duplicate

        // Calculate the sum of all integers
        int sum = 0;
        for (int num : integers) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of Integers: " + sum);
    }
}
