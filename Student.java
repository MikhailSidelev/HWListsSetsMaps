package HomeWork;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about
the insertion order. Each student object should have name and studentID.
Display name of each student.
 */
public class Student {
    private String name;
    private String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public void printInfo() {
        System.out.println("Student name is " + name);
    }

    public static void main(String[] args) {


        Set<Student> students = new HashSet<>();

        students.add(new Student("Adam", "U122"));
        students.add(new Student("Eve", "U121"));
        students.add(new Student("Quan", "U123"));


        students.forEach(student -> student.printInfo());

        //for (Student student:students){
        //    student.printInfo();
        }

    }

