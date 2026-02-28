package Practicum3;

import java.util.Scanner;

public class CourseDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of courses: ");
        int number = Integer.parseInt(sc.nextLine());

        Course20[] arrayOfCourse = new Course20[number];
        String  code, name, dummy;
        int credit, hours;

        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Input data for course #" + (i + 1));
            System.out.print("Code     : ");
            code = sc.nextLine();
            System.out.print("Name     : ");
            name = sc.nextLine();
            System.out.print("Credit   : ");
            dummy = sc.nextLine();
            credit = Integer.parseInt(dummy);
            System.out.print("Hours    : ");
            dummy = sc.nextLine();
            hours = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            arrayOfCourse[i] = new Course20();
            arrayOfCourse[i].addData(code, name, credit, hours);
        }

        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Data for course #" + (i + 1));
            arrayOfCourse[i].printInfo();
            System.out.println("---------------------------");
        }
    }
}
