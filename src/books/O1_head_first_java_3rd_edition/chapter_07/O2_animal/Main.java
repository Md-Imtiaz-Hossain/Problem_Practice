package books.O1_head_first_java_3rd_edition.chapter_07.O2_animal;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.makeNoise();
        tiger.roam();
        tiger.sleep();
        tiger.eat();
    }
}


/**
 * When you call a method on an object reference, you’re calling the most
 * specific version of the method for that object type.
 * In other words, the lowest one wins!
 *
 * IS-A relation:
 * Cat is a Feline
 * Feline IS-A Animal
 */

// Head first java page- 463 / 1597
