package books.O1_head_first_java_3rd_edition.chapter_03;

public class TestArrays {
    public static void main(String[] args) {

       String[] islands = new String[4];

       islands[0] = "Dhaka Barmuda";
       islands[1] = "Barishal fija";
       islands[2] = "Sylhet Azores";
       islands[3] = "Comilla cozumel";

       int[] index = new int[4];
       index[0] = 1;
       index[1] = 3;
       index[2] = 0;
       index[3] = 2;

       int y = 0;
       int ref;

       while (y < 4){
           ref = index[y];
           System.out.print("island = ");
           System.out.println(islands[ref]);
           y +=1;
       }



    }
}
