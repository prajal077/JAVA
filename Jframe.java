import javax.swing.*;
import java.awt.*;

public class Jframe { // Renamed class to avoid conflict with javax.swing.JFrame
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Changed Frame to JFrame

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Corrected method name and constant

        f.setTitle("My title");
        f.setSize(400, 400); // Removed width: and height:
        JLabel label = new JLabel("Hello, welcome to my application!", SwingConstants.CENTER);

        // Add the JLabel to the JFrame
        f.add(label);
        f.setVisible(true);
    }
}
