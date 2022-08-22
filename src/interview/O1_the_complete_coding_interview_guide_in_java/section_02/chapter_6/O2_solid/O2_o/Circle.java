package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O2_o;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
