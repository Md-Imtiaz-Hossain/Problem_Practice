package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.abstraction;

public class Main {
    public static void main(String[] args) {

        Car electricCar = new ElectricCar("BMW");

        System.out.println("Driving the electric car: " + electricCar.getCarTYpe() + "\n");

        electricCar.speedUp();
        electricCar.turnLeft();
        electricCar.slowDown();
    }
}


// Book: The Complete Coding Interview Guide in Java, Page: 67(92/788)