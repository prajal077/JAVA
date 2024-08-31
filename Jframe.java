import javax.swing.*;
import java.awt.*;

public class Jframe { // Renamed class to avoid conflict with javax.swing.JFrame
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Changed Frame to JFrame

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Corrected method name and constant

        f.setTitle("My title");
        f.setSize(200, 200); // Removed width: and height:
        f.setVisible(true);
    }
}
