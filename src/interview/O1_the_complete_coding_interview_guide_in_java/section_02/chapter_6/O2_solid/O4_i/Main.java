package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O4_i;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nApproach that follow Interface Segregation Principle:\n");

        WwwPingConnection www2 = new WwwPingConnection("www.bdjobs.com");

        www2.http();
        www2.connect();
//        www2.socket();

    }
}


/**
 * SOLID
 * SOLID is an acronym for the first fve Object-Oriented Design (OOD) principles enunciated by Robert C. Martin, also known as Uncle Bob (optional phrase).
 * • S: Single Responsibility Principle
 * • O: Open Closed Principle
 * • L: Liskov's Substitution Principle
 * • I: Interface Segregation Principle
 * • D: Dependency Inversion Principle
 */


// Book: The Complete Coding Interview Guide in Java, Page: 98 (123 / 788)