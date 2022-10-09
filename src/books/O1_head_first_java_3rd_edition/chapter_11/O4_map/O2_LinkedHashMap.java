package books.O1_head_first_java_3rd_edition.chapter_11.O4_map;

import java.util.*;
class O2_LinkedHashMap{
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}

// Another Example with book example
class BookLinkedHashMap {
    int id;
    String name,author,publisher;
    int quantity;
    public BookLinkedHashMap(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class LinkedHashMapDemo {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, BookLinkedHashMap> map=new LinkedHashMap<Integer, BookLinkedHashMap>();
        //Creating Books
        BookLinkedHashMap b1=new BookLinkedHashMap(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookLinkedHashMap b2=new BookLinkedHashMap(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookLinkedHashMap b3=new BookLinkedHashMap(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, BookLinkedHashMap> entry:map.entrySet()){
            int key=entry.getKey();
            BookLinkedHashMap b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}