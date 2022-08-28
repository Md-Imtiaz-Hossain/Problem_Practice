package books.O1_head_first_java.chapter_02.O3_codecorrection;

public class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;

        d.playSnare();
    }


}

class DrumKit {

    boolean topHat = true;
    boolean snare = true;


    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}


// Task
// bang bang ba-bang
// ding ding da-ding

// Head First Java, Page - 168 / 1597