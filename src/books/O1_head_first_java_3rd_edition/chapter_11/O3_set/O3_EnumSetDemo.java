package books.O1_head_first_java_3rd_edition.chapter_11.O3_set;

import java.util.EnumSet;
import java.util.Set;

// Java program to demonstrate the
// creation of the set object
// using the EnumSet class
public class O3_EnumSetDemo {
    enum Gfg {CODE, LEARN, CONTRIBUTE, QUIZ, MCQ}

    public static void main(String[] args) {
        // Creating a set
        Set<Gfg> set1;
        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE);
        System.out.println("Set 1: " + set1);
    }
}

