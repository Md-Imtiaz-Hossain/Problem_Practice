package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O1_oop.inheritance;

public class Programmer extends Employee{
    private String team;
    public Programmer(String name, String team) {
        super(name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
