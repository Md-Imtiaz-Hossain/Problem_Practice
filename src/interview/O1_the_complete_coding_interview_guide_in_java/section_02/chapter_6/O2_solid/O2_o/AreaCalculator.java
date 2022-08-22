package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O2_o;

import java.util.List;

public class AreaCalculator {

    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

}
