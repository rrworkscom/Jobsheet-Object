package Practicum3;

public class LecturerData20 {
    public String code;
    public String name;
    public boolean gender;
    public int age;

    public LecturerData20() {
    }

    void dataAllLecturers(Lecturer20[] arrayOfLecturer) {
        for(int i = 0; i < arrayOfLecturer.length; i++) {
            System.out.println("Data for lecturer #" + (i + 1));
            arrayOfLecturer[i].printInfo();
            System.out.println("---------------------------------");
        }
    }

    void numberOfLecturersPerGender(Lecturer20[] arrayOfLecturer)  {
        int male = 0;
        int female = 0;
        for (int i = 0; i < arrayOfLecturer.length; i ++) {
            if (arrayOfLecturer[i].gender) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("Number of Male Lecturers: " + male);
        System.out.println("Number of Female Lecturers: " + female);
    }

    void averageAgeOfLecturersPerGender (Lecturer20[] arrayOfLecturer) {
        int totalMaleAge = 0;
        int totalFemaleAge = 0;
        int maleCount = 0;
        int femaleCount = 0;

        for (int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].gender) {
            totalMaleAge += arrayOfLecturer[i].age;
            maleCount++;
            } else {
            totalFemaleAge += arrayOfLecturer[i].age;
            femaleCount++;
            }
        }

        double avrgM = 0;
        double avrgF = 0;

        if (maleCount != 0) {
            avrgM = (double) totalMaleAge / maleCount;
        }

        if (femaleCount !=0) {
            avrgF = (double) totalFemaleAge / femaleCount;
        }

        System.out.println("Male Lecturers Average Age  : " + avrgM);
        System.out.println("Female Lecturers Average Age : " + avrgF);
    }

    void oldestLecturers(Lecturer20[] arrayOfLecturer) {
        int maxAge = 0;

        for (int i = 1 ; i < arrayOfLecturer.length; i ++) {
            if (arrayOfLecturer[i].age > arrayOfLecturer[maxAge].age) {
                maxAge = i;
            }
        }

        System.out.println("Oldest Lecturer: ");
        arrayOfLecturer[maxAge].printInfo();
    }

    void youngestLecturers(Lecturer20[] arrayOfLecturer) {
        int minAge = 0;

        for(int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].age < arrayOfLecturer[minAge].age) {
                minAge = i;
            }
        }

        System.out.println("Youngest Lecturer: ");
        arrayOfLecturer[minAge].printInfo();
    }

}