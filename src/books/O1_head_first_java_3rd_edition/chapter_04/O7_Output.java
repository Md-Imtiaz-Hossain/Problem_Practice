package books.O1_head_first_java_3rd_edition.chapter_04;

public class O7_Output {
    public static void main(String[] args) {
        O7_Output output = new O7_Output();
        output.go();
    }

    void go(){
        int value = 7;
        for(int i = 1; i <8 ; i++){
            value++;
            if (i>4){
                System.out.print(value++ + " ");
            }
            if (value>14){
                System.out.println("\nx = " + i);
                break;
            }

        }
    }

}


// Head first java 3rd edition, page - 342 / 1597