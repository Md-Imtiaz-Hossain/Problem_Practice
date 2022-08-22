package books.O1_head_first_java.chapter_01.O7_missingblock;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {

            // Candidate 1
            // y = x - y;

            // Candidate 2
            // y = y + x;

            // Candidate 3
            // y = y + 2;
            // if (y > 4) {
            // y = y - 1;
            // }

            // Candidate 4
            // x = x + 1;
            // y = y + x;

            // Candidate 5
            if (x < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;



            System.out.printf(x + "" + y + " ");
            x += 1;
        }
    }
}
