package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O2_o;

import interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O1_s.AreaConverter;
import interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O1_s.RectangleAreaCalculator;

import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("\nApproach that follow Open Closed Principle:\n");

        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 3);

        List<Shape> shapes = List.of(circle1, circle2, rectangle);

        AreaCalculator areaCalculator = new AreaCalculator(shapes);

        System.out.println("Sum area: " + areaCalculator.sum());

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


// Book: The Complete Coding Interview Guide in Java, Page: 89 (114 / 788)