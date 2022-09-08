package books.O1_head_first_java_3rd_edition.chapter_07.O5_poolpuzzle;

public class TestBoats {
    public static void main(String[] args) {
    Boat b1 = new Boat();
    Sailboat b2 = new Sailboat();
    Rowboats b3 = new Rowboats();

    b2.setLen(32);
    b1.move();
    b3.move();
    b2.move();

    }
}

class Boat{
    private int len;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void move(){
        System.out.println("drift");
    }
}

class Sailboat extends Boat {
    public void move(){
        System.out.println("hoist sail");
    }

}

class Rowboats extends Boat{
    public void rowTheBoat(){
        System.out.println("stroke natasha");
    }

}

// head first java, page-  505 / 1597