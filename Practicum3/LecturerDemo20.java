package Practicum3;

import java.util.Scanner;

public class LecturerDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number number of Lecturers: ");
        int number = Integer.parseInt(sc.nextLine());

        Lecturer20[] arrayOfLecturer = new Lecturer20[number];
        String code, name, dummy;
        boolean gender;
        int age;

        LecturerData20 data = new LecturerData20();

        for (int i = 0; i < arrayOfLecturer.length; i++) {
            arrayOfLecturer[i] = new Lecturer20();

            System.out.println("Input data for Lecturer #" + (i + 1));
            System.out.print("Code     : ");
            code = sc.nextLine();
            System.out.print("Name     : ");
            name = sc.nextLine();
            System.out.print("Gender (true = M, false = F): ");
            gender = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Age      : ");
            dummy = sc.nextLine();
            age = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfLecturer[i].addData(code, name, gender, age);
        }

        data.dataAllLecturers(arrayOfLecturer);
        data.numberOfLecturersPerGender(arrayOfLecturer);
        data.averageAgeOfLecturersPerGender(arrayOfLecturer);
        data.oldestLecturers(arrayOfLecturer);
        data.youngestLecturers(arrayOfLecturer);
    }
}

