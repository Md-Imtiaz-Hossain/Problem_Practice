package books.O1_head_first_java_3rd_edition.chapter_11.O5_generics.O2_wildcard;

import java.util.Arrays;
import java.util.List;

public class O2_LowerBound {
    public static void main(String[] args) {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);
        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}

/**
 * Explanation:
 * Here arguments can be Integer or superclass of Integer(which is Number).
 * The method printOnlyIntegerClassorSuperClass will only take Integer or its superclass objects.
 * However, if we pass a list of types Double then we will get a compilation error.
 * It is because only the Integer field or its superclass can be passed. Double is not the superclass of Integer.
 *
 *
 * Note: Use extend wildcard when you want to get values out of a structure and super wildcard when you put values in a structure.
 * Don’t use wildcard when you get and put values in a structure. You can specify an upper bound for a wildcard,
 * or you can specify a lower bound, but you cannot specify both.
 */