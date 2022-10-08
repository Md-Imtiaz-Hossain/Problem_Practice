package books.O1_head_first_java_3rd_edition.chapter_11.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class O2_TreeSetDemo {

    // Java Program Demonstrating Creation of Set object
    // Using the TreeSet class
    // Main driver method
    public static void main(String[] args) {
        // Creating a Set object and declaring it of String
        // type
        // with reference to TreeSet
        Set<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}

