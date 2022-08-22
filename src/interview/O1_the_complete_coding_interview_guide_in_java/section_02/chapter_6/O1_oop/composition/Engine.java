package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O1_oop.composition;

public class Engine {
    private String type;
    private int horsepower;
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getType() {
        return type;
    }
}
