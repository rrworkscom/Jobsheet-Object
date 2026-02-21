public class CourseMain20 {
    public static void main(String[] args) {
        
        Course20 crs1 = new Course20();
        crs1.courseCode = "11621113";
        crs1.name = "Advanced Mathematics";
        crs1.credit = 1;
        crs1.numberOfHours = 2;

        crs1.displayInformation();
        crs1.changeCredit(2);
        crs1.addHours(2);
        crs1.displayInformation();

        Course20 crs2 = new Course20("11621419", "Algorithms and Data Structures Practicum", 2, 8);
        crs2.displayInformation();
        crs2.reduceHours(2);
        crs2.displayInformation();
    }
}
