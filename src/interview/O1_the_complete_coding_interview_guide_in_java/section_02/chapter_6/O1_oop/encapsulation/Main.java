package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O1_oop.encapsulation;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();

        System.out.println("Energy: " + cat.getEnergy());
        System.out.println("Mood: " + cat.getMood());
        System.out.println("Hungry: " + cat.getHungry());
    }
}


// Book: The Complete Coding Interview Guide in Java, Page: 70(95/788)