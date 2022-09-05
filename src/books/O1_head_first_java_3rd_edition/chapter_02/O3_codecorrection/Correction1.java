package books.O1_head_first_java_3rd_edition.chapter_02.O3_codecorrection;

public class Correction1 {

    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }


}

class StreamingSongDrive {
    public static void main(String[] args) {

        Correction1 correction1 = new Correction1();

        correction1.artist = "The ABC";
        correction1.title = "Come DEF";

        correction1.play();
        correction1.printDetails();

    }
}
