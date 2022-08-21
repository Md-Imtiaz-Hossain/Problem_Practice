package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.encapsulation;

public class Cat {
    private int mood = 50;
    private int hungry = 50;
    private int energy = 50;

    public void sleep() {
        System.out.println("Sleep ... ");
        energy++;
        hungry++;
    }

    public void play(){
        System.out.println("Play ...");
        energy--;
        meow();
    }
    public void feed() {
        System.out.println("Feed ...");
        hungry--;
        mood++;
        meow();
    }
    private void meow() {
        System.out.println("Meow!");
    }

    public int getMood() {
        return mood;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }


}
