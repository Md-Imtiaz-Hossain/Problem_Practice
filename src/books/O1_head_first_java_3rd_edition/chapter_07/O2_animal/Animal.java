package books.O1_head_first_java_3rd_edition.chapter_07.O2_animal;

public class Animal {
    String picture;
    String food;
    boolean hunger;
    int boundaries;
    int location;

    void makeNoise(){
        System.out.println("Eat- Animal");
    }

    void eat(){
        System.out.println("Eat- Animal");
    }

    void sleep(){
        System.out.println("sleep- Animal");
    }

    void roam(){
        System.out.println("roam- Animal");
    }
}
