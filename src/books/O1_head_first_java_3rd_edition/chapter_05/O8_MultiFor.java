package books.O1_head_first_java_3rd_edition.chapter_05;

public class O8_MultiFor {
    public static void main(String[] args) {

        for (int i = 0 ; i < 4 ; i++){
            for (int j = 4 ; j > 2 ; j--){
                System.out.println(i + " " + j);
            }
            if (i == 1){
                i++;
            }
        }
    }
}


// Head first java 3rd edition, page - 345 / 1597