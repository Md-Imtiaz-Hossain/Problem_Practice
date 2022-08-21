package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism via method overloading (compile time)
        System.out.println("----------------------------------");
        Triangle triangle = new Triangle();

        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");

        // Polymorphism via method overriding (runtime)
        System.out.println("----------------------------------");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        triangle.draw();
        rectangle.draw();
        circle.draw();


    }
}


// Book: The Complete Coding Interview Guide in Java, Page:  75 (100 / 788)