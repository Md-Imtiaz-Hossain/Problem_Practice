package books.O1_head_first_java_3rd_edition.chapter_14.O3_simplegui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SimpleGui3 implements ActionListener {
    private JFrame jFrame;
    public static void main(String[] args) {
        SimpleGui3 simpleGui3 = new SimpleGui3();
        simpleGui3.go();
    }
    public void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change Color");
        button.addActionListener(this);

        MyDrawPanel myDrawPanel = new MyDrawPanel();

        jFrame.getContentPane().add(BorderLayout.SOUTH, button);
        jFrame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.repaint();
    }

}

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70, 70, 100, 100);
    }
}