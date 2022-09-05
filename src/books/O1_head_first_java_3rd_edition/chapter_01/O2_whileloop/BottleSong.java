package books.O1_head_first_java_3rd_edition.chapter_01.O2_whileloop;

public class BottleSong {
    public static void main(String[] args) {

        int bottleNum = 10;
        String word = "bottles";

        while (bottleNum > 8) {

            if (bottleNum == 1) {
                word = "bottle";
            }

            System.out.println(bottleNum + " green " + word + " hanging on the wall.");
            System.out.println(bottleNum + " green " + word + " hanging on the wall.");
            System.out.println("and if one green bottle should accidentally fall, ");

            bottleNum = bottleNum - 1;

            if ( bottleNum > 0 ){
                System.out.println("There'll be " + bottleNum + " green " + word + ", hanging on the wall");
            }else {
                System.out.println("there'll be no green bottles, hanging on the wall.");
            }
        }
    }
}

// https://en.wikipedia.org/wiki/Ten_Green_Bottles