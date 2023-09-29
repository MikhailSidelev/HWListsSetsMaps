package HomeWork;

import java.util.*;

public class EmployeeHighestSalary {
    public static void main(String[] args) {
        // Create a Map to store employee names and salaries
        Map<String, Double> employeeSalaries = new HashMap<>();

        // Add employee information to the Map
        employeeSalaries.put("John Smith", 100000.0);
        employeeSalaries.put("Alice Johnson", 95000.0);
        employeeSalaries.put("Bob Brown", 105000.0);
        employeeSalaries.put("Emily Davis", 98000.0);

        // Initialize variables to store the employee with the highest salary
        String highestPaidEmployee = null;
        double highestSalary = Double.MIN_VALUE;

        // Iterate through the Map to find the employee with the highest salary
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            String employeeName = entry.getKey();
            double salary = entry.getValue();

            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaidEmployee = employeeName;
            }
        }

        // Print the employee with the highest salary in the specified format
        System.out.println(highestPaidEmployee + "=$" + highestSalary);
    }
}
