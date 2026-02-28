package Practicum3;

import java.util.Scanner;

public class StudentDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student20[] arrayOfStudent = new Student20[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfStudent[i] = new Student20();
        
        System.out.println("Input data for student #" + (i + 1));
        System.out.print("NIM     : ");
        arrayOfStudent[i].nim = sc.nextLine();
        System.out.print("Name    : ");
        arrayOfStudent[i].name = sc.nextLine();
        System.out.print("Grade   : ");
        arrayOfStudent[i].grade = sc.nextLine();
        System.out.print("GPA     : ");
        dummy = sc.nextLine();
        arrayOfStudent[i].gpa = Float.parseFloat(dummy);
        System.out.println("-----------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data for student #" + (i + 1));
            System.out.println("NIM     : " + arrayOfStudent[i].nim);
            System.out.println("Name    : " + arrayOfStudent[i].name);
            System.out.println("Grade   :" + arrayOfStudent[i].grade);
            System.out.println("GPA     : " + arrayOfStudent[i].gpa);

        }
    }
}
