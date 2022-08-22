package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O1_s;

public class AreaConverter {
    private static final double INCH_TERM = 0.0254d;
    private static final double FEET_TERM = 0.3048d;

    public double metersToInches(int area) {
        return area / INCH_TERM;
    }

    public double metersToFeet(int area) {
        return area / FEET_TERM;
    }



}
