public class StudentMain20 {
    public static void main(String[] args) {

        Student20 std1 = new Student20();
        std1.name = "Muhammad Ali Farhan";
        std1.nim = "2241720171";
        std1.grade = "SI 2J";
        std1.gpa = 3.55;

        std1.showInformation();
        std1.changeGrade("SI 2K");
        std1.updateGPA(3.60);
        std1.showInformation();
    }
}
