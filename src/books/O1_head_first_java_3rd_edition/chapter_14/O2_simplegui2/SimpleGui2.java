package books.O1_head_first_java_3rd_edition.chapter_14.O2_simplegui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {
    private JButton button;
    public static void main(String[] args) {
        SimpleGui2 simpleGui2 = new SimpleGui2();
        simpleGui2.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked.");
    }
}
