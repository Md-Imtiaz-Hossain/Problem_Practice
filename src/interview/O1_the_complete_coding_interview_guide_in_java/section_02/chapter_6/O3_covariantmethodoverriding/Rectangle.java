package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O3_covariantmethodoverriding;


public class Rectangle implements Cloneable {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {

        Rectangle clone = (Rectangle) super.clone();

        return clone;
    }

}
