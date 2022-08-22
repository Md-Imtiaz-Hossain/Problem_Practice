package books.O1_head_first_java.chapter_01.O6_bigsmallx;

public class Main2 {
    public static void main(String[] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println(x + ", small x");
            }
        }
    }
}
