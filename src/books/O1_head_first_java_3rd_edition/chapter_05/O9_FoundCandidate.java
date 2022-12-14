package books.O1_head_first_java_3rd_edition.chapter_05;

public class O9_FoundCandidate {
    public static void main(String[] args) {
        int x = 0, y = 30;

        for (int outer = 0 ; outer < 3 ; outer++){
            for (int inner = 4 ; inner > 1 ; inner--){
                x = x + 0;
                y = y - 2;
                if ( x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}


// x += 3; 54 6
// x += 6; 60 10
// x += 2; 45 6
// x++; 36 6
// x--; 18 6
// x = x + 0; 6 14

// Head first java 3rd edition, page - 351 / 1597