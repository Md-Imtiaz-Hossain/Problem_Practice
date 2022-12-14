package books.O1_head_first_java_3rd_edition.chapter_11.O5_generics.O1_typeparameter;

// Java program to show working of user defined
// Generic functions
class GenericFunctionTest {
    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}


