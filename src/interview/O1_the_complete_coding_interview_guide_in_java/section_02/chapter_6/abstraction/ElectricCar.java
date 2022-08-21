package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.abstraction;

public class ElectricCar implements Car {

    private final String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn Right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn Left the electric car");
    }

    @Override
    public String getCarTYpe() {
        return this.carType;
    }
}
