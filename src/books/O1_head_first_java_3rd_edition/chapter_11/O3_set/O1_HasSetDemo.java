package books.O1_head_first_java_3rd_edition.chapter_11.O3_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class O1_HasSetDemo {
    public static void main(String[] args) {

        // Java Program Demonstrating Operations on the Set
        // such as Union, Intersection and Difference operations

        // Creating an object of Set class
        // Declaring object of Integer type
        Set<Integer> a = new HashSet<Integer>();
        // Adding all elements to List
        a.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 8, 9, 0}));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}


class SetExample{
    public static void main(String[] args)       {
        // creating LinkedHashSet using the Set
        Set<String> data = new LinkedHashSet<String>();
        data.add("JavaTpoint");
        data.add("Set");
        data.add("Example");
        data.add("Set");
        System.out.println(data);
    }
}
