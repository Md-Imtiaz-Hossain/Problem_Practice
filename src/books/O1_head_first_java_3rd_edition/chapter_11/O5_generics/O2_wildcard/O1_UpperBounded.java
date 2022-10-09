package books.O1_head_first_java_3rd_edition.chapter_11.O5_generics.O2_wildcard;

import java.util.Arrays;
import java.util.List;

public class O1_UpperBounded {
    public static void main(String[] args)	{
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));
        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));
    }
    private static double sum(List<? extends Number> list)	{
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}


/**
 * The question mark (?) is known as the wildcard in generic programming. It represents an unknown type.
 * The wildcard can be used in a variety of situations such as the type of parameter, field, or local variable;
 * sometimes as a return type. Unlike arrays, different instantiations of a generic type are not compatible with each other,
 * not even explicitly. This incompatibility may be softened by the wildcard if ? is used as an actual type parameter.
 *
 * Types of wildcards in Java
 * 1. Upper Bounded Wildcards: − ? extends Type.
 * 2. Lower Bounded Wildcards: − ? super Type.
 * 3. Unbounded Wildcards: − ?
 *
 *
 *
 * 1. Upper Bounded Wildcards:
 * These wildcards can be used when you want to relax the restrictions on a variable.
 * For example, say you want to write a method that works on List < Integer >, List < Double >, and List < Number >,
 * you can do this using an upper bounded wildcard. To declare an upper-bounded wildcard,
 * use the wildcard character (‘?’), followed by the extends keyword, followed by its upper bound.
 *
 * 2. Lower Bounded Wildcards:
 * It is expressed using the wildcard character (‘?’), followed by the super keyword,
 * followed by its lower bound: <? super A>.  Syntax: Collectiontype <? super A>
 *
 * 3. Unbounded Wildcards:
 * This wildcard type is specified using the wildcard character (?), for example, List.
 * This is called a list of unknown types. These are useful in the following cases –
 * When writing a method that can be employed using functionality provided in Object class.
 * When the code is using methods in the generic class that doesn’t depend on the type parameter
 */