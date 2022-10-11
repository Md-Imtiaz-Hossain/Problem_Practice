package books.O1_head_first_java_3rd_edition.chapter_12.O2_functionalinterrface;

import java.util.Arrays;

public class O4_ConsumerTest {
    public static void main(String[] args) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};

        System.out.print("The list of countries:\n");

        Arrays.asList(countries).forEach((country) -> System.out.println(country)); // lambda expression
    }
}

/**
 * Consumer Interface
 * The Consumer interface has only one single method called accept().
 * It accepts a single argument of any data type and does not return any result.
 */