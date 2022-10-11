package books.O1_head_first_java_3rd_edition.chapter_12.O2_functionalinterrface;

import java.util.function.Function;

public class O2_Function {
    public static void main(String args[]) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};

        Function<String[], String> converter = (all) -> {  // lambda expression
            String names = "";
            for (String n : all) {
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };

        System.out.println(converter.apply(countries));
    }
}


/**
 * Function Interface:
 * The Function interface has only one single method apply().
 * It can accept an object of any data type and returns a result of any datatype.
 */