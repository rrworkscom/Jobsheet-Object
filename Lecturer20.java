public class Lecturer20 {
    
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturer20() {
    }

    public Lecturer20(String id, String nm, boolean status, int year, String expert) {
        idLecturer = id;
        name = nm;
        activeStatus = status;
        yearOfEntry = year;
        expertiseCompetency = expert;
    }

    void showInformation() {
        System.out.println("ID Lecturer: " + idLecturer);
        System.out.println("Name: " + name);
        System.out.println("Year of Entry: " + yearOfEntry);
        System.out.println("Expertise Competency: " + expertiseCompetency);
        System.out.println();
    }

    void setStatusActive(boolean status) {
        if (activeStatus == true) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Deactive");
        }
    }

    void calculateTimeWork(int yearNow) {
        int calculateTimeWork = yearNow - yearOfEntry;
        System.out.println("Time Work (years): " + calculateTimeWork);
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}
