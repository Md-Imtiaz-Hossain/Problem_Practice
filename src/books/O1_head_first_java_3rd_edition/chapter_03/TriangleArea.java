package books.O1_head_first_java_3rd_edition.chapter_03;

public class TriangleArea {
    double area;
    int height;
    int length;

    public static void main(String[] args) {

        int x = 0;
        TriangleArea[] ta = new TriangleArea[4];

        while ( x < 4){
            ta[x] = new TriangleArea();
            ta[x].height = (x + 1) * 2 ;
            ta[x].length = (x + 4);
            ta[x].setArea();

            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            x = x + 1;

        }

        int y = x;
        x = 27;

        TriangleArea t5 = ta[2];
        ta[2].area = 343;

        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);


    }

    private void setArea() {
        area = (height*length) / 2;
    }
}


// triangle 0, area  = 4.0
// triangle 1, area = 10.0
// triangle 2, area = 18.0
// triangle 3, area =
// y =

