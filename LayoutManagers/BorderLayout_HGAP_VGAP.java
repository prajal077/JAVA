package LayoutManagers;
import java.awt.*;
import javax.swing.*;

 class BorderHgap_Vgap {
   public  BorderHgap_Vgap () {
        JFrame frame = new JFrame();

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        frame.setLayout(new BorderLayout(200, 15));

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}

public class BorderLayout_HGAP_VGAP {  // Renamed the class here
    public static void main(String [] agrs) {
        BorderHgap_Vgap BHV = new BorderHgap_Vgap();
    }
}
