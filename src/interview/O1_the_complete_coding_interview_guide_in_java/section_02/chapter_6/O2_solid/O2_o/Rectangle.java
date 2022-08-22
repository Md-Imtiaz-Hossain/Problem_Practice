package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O2_o;

public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

}
