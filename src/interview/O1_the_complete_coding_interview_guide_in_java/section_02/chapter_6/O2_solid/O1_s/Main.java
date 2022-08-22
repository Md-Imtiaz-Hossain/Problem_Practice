package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O1_s;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nApproach that follow Single Responsibility Principle:\n");

        DecimalFormat df = new DecimalFormat("#.##");

        RectangleAreaCalculator rectangleAreaCalculator = new RectangleAreaCalculator(7, 9);
        System.out.println(rectangleAreaCalculator.area());

        AreaConverter areaConverter = new AreaConverter();
        System.out.println(df.format(areaConverter.metersToFeet(7)));
        System.out.println(areaConverter.metersToInches(10));


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


// Book: The Complete Coding Interview Guide in Java, Page: 86 (111 / 788)