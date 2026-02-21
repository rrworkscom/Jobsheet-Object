public class Course20 {

    String courseCode;
    String name;
    int credit;
    int numberOfHours;

    public Course20() {
    }

    public Course20(String code, String nm, int crd, int numhrs) {
        courseCode = code;
        name = nm;
        credit = crd;
        numberOfHours = numhrs;
    }

    void displayInformation() {
        System.out.println("Course code: " + courseCode);
        System.out.println("Course Name: " + name);
        System.out.println("Course Credit: " + credit);
        System.out.println("Course Hours: " + numberOfHours);
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("Credit change successful");
    }

    void addHours(int newHours) {
        numberOfHours+= newHours;
        System.out.println("Hours addition successful");
    }

    void reduceHours(int newHours) {
       if (newHours > numberOfHours) {
        System.out.println("The number of hours left is not sufficient to be reduced");
       } else {
        numberOfHours -= newHours;
        System.out.println("Hours reduction successful");
       }
    }


}
