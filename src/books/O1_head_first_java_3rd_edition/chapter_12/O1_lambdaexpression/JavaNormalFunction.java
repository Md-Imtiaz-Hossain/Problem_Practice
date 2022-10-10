package books.O1_head_first_java_3rd_edition.chapter_12.O1_lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class JavaNormalFunction {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        // External iterator
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
