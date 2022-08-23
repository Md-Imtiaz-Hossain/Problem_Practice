package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O4_defaultstaticmethod;

public class SteamCar implements Vehicle {

    private String name;

    public SteamCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the steam car ...");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the steam car ...");
    }
}
