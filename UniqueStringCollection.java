package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class UniqueStringCollection {
    public static void main(String[] args) {
        // Create an ArrayList to store unique strings with order preserved
        List<String> uniqueStrings = new ArrayList<>();

        // Add unique strings to the collection
        uniqueStrings.add("Bazaar");
        uniqueStrings.add("Beige");
        uniqueStrings.add("Blond");
        uniqueStrings.add("Blue");
        uniqueStrings.add("Blush");

        // Concatenate all strings from the collection
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : uniqueStrings) {
            concatenatedString.append(str);
        }


        System.out.println("Concatenated String: " + concatenatedString.toString());
    }
}