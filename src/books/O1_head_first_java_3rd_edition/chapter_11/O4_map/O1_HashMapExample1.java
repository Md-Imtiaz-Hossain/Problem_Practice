package books.O1_head_first_java_3rd_edition.chapter_11.O4_map;

import java.util.HashMap;
import java.util.Map;

public class O1_HashMapExample1 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

/**
 * You cannot store duplicate keys in HashMap. However,
 * if you try to store a duplicate key with another value, it will replace the value.
 */

class HashMapExampleNoDuplicate {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}


// Another Example with Book Class
class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class MapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, BookLinkedHashMap> map = new HashMap<Integer, BookLinkedHashMap>();
        //Creating Books
        BookLinkedHashMap b1 = new BookLinkedHashMap(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookLinkedHashMap b2 = new BookLinkedHashMap(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookLinkedHashMap b3 = new BookLinkedHashMap(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, BookLinkedHashMap> entry : map.entrySet()) {
            int key = entry.getKey();
            BookLinkedHashMap b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}