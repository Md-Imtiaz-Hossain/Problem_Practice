package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O5_methodhiding;

public class Main {

    public static void main(String[] args) {

        Vehicle.move(); // call Vehicle#move()
        Car.move();     // call Car#move()
    }
}


// Book: The Complete Coding Interview Guide in Java, Page: 116 (141 / 788)

/**
 * Method hiding is specific to static methods. More precisely, if we declare two static
 * methods with the same signature and name in the superclass and in the subclass, then
 * they will hide each other. Calling the method from the superclass will call the static
 * method from the superclass, and calling the same method from the subclass will call the
 * static method from the subclass. Hiding is not the same thing with overriding because
 * static methods cannot be polymorphic.
 */

