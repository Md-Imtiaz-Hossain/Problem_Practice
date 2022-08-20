package books.O1_head_first_java.chapter_01.O1_partyattims;

import java.awt.*;

public class Party {
    public static void main(String[] args) {
        window w = new window();
        w.ButtonExample2();
    }
}


class window {
    void ButtonExample2() {

        Frame frame = new Frame("Party Time");

        Label l = new Label("Party at tim's");
        Button button2 = new Button("You bet");
        Button button3 = new Button("Shoot me");

        frame.add(l);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}


