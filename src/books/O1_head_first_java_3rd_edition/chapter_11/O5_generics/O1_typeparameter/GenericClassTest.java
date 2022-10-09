package books.O1_head_first_java_3rd_edition.chapter_11.O5_generics.O1_typeparameter;

// Java program to show multiple
// type parameters in Java Generics
// We use < > to specify Parameter type
class GenericClassTest<T, U> {
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    GenericClassTest(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Driver class to test above
class Main {
    public static void main(String[] args) {
        GenericClassTest<String, Integer> obj =
                new GenericClassTest<String, Integer>("GfG", 15);
        obj.print();
    }
}
