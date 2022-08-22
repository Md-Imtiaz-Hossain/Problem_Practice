package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O1_s;

public class RectangleAreaCalculator {
    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }


}
