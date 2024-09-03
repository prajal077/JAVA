package LayoutManagers;
import java.awt.*;
import javax.swing.*;
import java.util.concurrent.Flow;

class Flowlayout {
    Flowlayout () {
        JFrame j = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");

        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(b5);
        j.add(b6);
        j.add(b7);
        j.add(b8);
        j.add(b9);
        j.add(b10);

        j.setLayout(new FlowLayout());

        j.setSize(400,400);
        j.setVisible(true);
    }
}


public class FlowLayoutExample {
    public static void main(String [] args) {
        Flowlayout fl = new Flowlayout();
    }
}
