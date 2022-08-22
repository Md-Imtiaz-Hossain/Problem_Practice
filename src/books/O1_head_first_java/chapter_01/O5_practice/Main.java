package books.O1_head_first_java.chapter_01.O5_practice;

public class Main {
    public static void main(String[] args) {

        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}


// Task Output: a-b c-d

// Book: Head First Java, Page: 112 / 1597