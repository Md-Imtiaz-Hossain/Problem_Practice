package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O3_covariantmethodoverriding;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle r = new Rectangle(4, 3);
        Rectangle clone = r.clone();

        System.out.println("Width: " + clone.getWidth());
        System.out.println("Height: " + clone.getHeight());

    }
}

// Book: The Complete Coding Interview Guide in Java, Page: 107 (132 / 788)
