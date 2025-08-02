package OOP;

import java.util.Scanner;

class Student1 {
    private String name;
    private String[] enrolledCourses = new String[2]; 
    private int count = 0;

    public Student1(String name) {
        this.name = name;
    }

    public void enroll(String courseName) {
        if (count < 2) {
            enrolledCourses[count] = courseName;
            count++;
        }
    }

    public void showCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < count; i++) {
            System.out.println(enrolledCourses[i]);
        }
    }
}

public class Practical_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] availableCourses = {"FEDF", "Linear Algebra", "OOP", "CTSD"};

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Student1 s = new Student1(name);

        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < availableCourses.length; i++) {
            System.out.println((i + 1) + ". " + availableCourses[i]);
        }

        System.out.println("\nChoose 2 course numbers to enroll:");
        for (int i = 0; i < 2; i++) {
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 2) {
                s.enroll(availableCourses[choice - 1]);
            } else {
                System.out.println("Invalid choice. Try again.");
                i--;
            }
        }

        System.out.println();
        s.showCourses();

        sc.close();
    }
}
