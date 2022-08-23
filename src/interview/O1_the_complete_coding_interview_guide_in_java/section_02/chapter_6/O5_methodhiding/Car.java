package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O5_methodhiding;

public class Car extends Vehicle {
    
    // this method hides Vehicle#move()
    public static void move() {
        System.out.println("Moving a car");
    }
}
