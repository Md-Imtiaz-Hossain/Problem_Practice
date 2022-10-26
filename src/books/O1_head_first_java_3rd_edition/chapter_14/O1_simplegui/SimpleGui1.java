package books.O1_head_first_java_3rd_edition.chapter_14.O1_simplegui;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

// Head first java, 3rd ed, page-1076

