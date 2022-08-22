package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O1_oop.composition;

public class Car {

    private final String name;
    private final Engine engine;
    public Car(String name) {
        this.name = name;
        Engine engine = new Engine("petrol", 300);
        this.engine=engine;
    }
    public int getHorsepower() {
        return engine.getHorsepower();
    }
    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}
