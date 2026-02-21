public class Student20 {
    String name;
    String nim;
    String grade;
    double gpa;

    void showInformation () {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("GPA: " + gpa);
        System.out.println("Class: " + grade);
    }

    void changeGrade(String newGrade) {
        grade = newGrade;
    }

    void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    String performanceIndex() {
        if (gpa >= 3.5) {
            return "Great Performance";
        } else if (gpa >= 3.0) {
            return "Good Performance";
        } else if (gpa >= 2.0) {
            return "Enough Performance";
        } else {
            return "Poor Performance";
        }
    }

}