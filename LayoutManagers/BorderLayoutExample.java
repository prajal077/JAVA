package LayoutManagers;
import java.awt.*;
import javax.swing.*;

class Border {
    Border () {
        JFrame frame = new JFrame();

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}

public class BorderLayoutExample {  // Renamed the class here
    public static void main(String [] agrs) {
        Border b = new Border();
    }
}
