package books.O1_head_first_java_3rd_edition.chapter_01.O2_whileloop;

public class DooBee {
    public static void main(String[] args) {

        int x = 1;

        while (x < 4){
            System.out.print("Doo");
            System.out.print("Bee");
            if (x<2){
                System.out.println("");
            }
            x = x + 1;
        }

        if ( x == 4){
            System.out.println("Do");
        }
    }
}


//task:  DooBee
//       DooBeeDooBeeDo