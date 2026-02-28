package Practicum3;

import java.util.Scanner;

public class CourseDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course20[] arrayOfCourse = new Course20[3];
        String  code, name, dummy;
        int credit, hours;

        for (int i = 0; i < 3; i++) {
            System.out.println("Input data for course #" + (i + 1));
            System.out.print("Code: ");
            code = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Credit: ");
            dummy = sc.nextLine();
            credit = Integer.parseInt(dummy);
            System.out.print("Hours: ");
            dummy = sc.nextLine();
            hours = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            arrayOfCourse[i] = new Course20(code, name, credit, hours);
    }
        }
}
