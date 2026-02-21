public class LecturerMain20 {
    public static void main(String[] args) {
        
        Lecturer20 lect1 = new Lecturer20();
        lect1.idLecturer = "20041489";
        lect1.name = "Albert Eko";
        lect1.activeStatus = true;
        lect1.yearOfEntry = 2000;
        lect1.expertiseCompetency = "Programming";

        lect1.showInformation();
        lect1.calculateTimeWork(2026);
        lect1.changeSkill("Physic");
        lect1.showInformation();

        Lecturer20 lect2 = new Lecturer20("19961910", "Suwignyo Holmes", false, 1996, "Critical Thinking and Problem Solving");
        lect2.showInformation();
        lect2.setStatusActive(false);
        lect2.showInformation();
    }
}
