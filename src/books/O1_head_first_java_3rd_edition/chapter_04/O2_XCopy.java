package books.O1_head_first_java_3rd_edition.chapter_04;

public class O2_XCopy {
    public static void main(String[] args) {

        int orig = 42;
        O2_XCopy x = new O2_XCopy();
        int y = x.go(orig);
        System.out.println(orig +  " of 2 = " + y);
    }

    int go(int a){
        return a*2;
    }

}


// Head first java 3rd edition, page - 277 / 1597