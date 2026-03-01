package Practicum3;

public class Lecturer20 {
    public String code;
    public String name;
    public boolean gender;
    public int age;

    public Lecturer20() {
    }

    void addData (String code, String nm, boolean gnd, int age) {
        this.code  = code;
        name = nm;
        gender = gnd;
        this.age = age;
    }

    void printInfo () {
        System.out.println("Code    : " + code);
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + (gender ? "Male" : "Female"));
        System.out.println("Age     : " + age);
    }
}


