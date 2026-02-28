package Practicum3;

public class Course20 {
    public String code;
    public String name;
    public int credit;
    public int hours;
    

    public Course20() {
    }

    void addData (String code, String nm, int crd, int hrs) {
        this.code  = code;
        name = nm;
        credit = crd;
        hours = hrs;
    }

    void printInfo() {
        System.out.println("Code     : " + code);
        System.out.println("Name     : " + name);
        System.out.println("Credit   : " + credit);
        System.out.println("Hours    : " + hours);
    }
}


