package books.O1_head_first_java_3rd_edition.chapter_12.O2_functionalinterrface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// A simple program to demonstrate the use
// of predicate interface
class O5_PredicateTest {
    public static void main(String args[]) {
        // create a list of strings
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");
        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}

/**
 * Predicate Interface
 * The Predicate interface has only one single method test().
 * It may be true or false depending on the values of its variables.
 */
