import javax.swing.*;

public class Creating_Jframe_another_method extends JFrame { // Corrected class name and superclass

    // Constructor with corrected name
    public Creating_Jframe_another_method() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Corrected method and constant
        setTitle("My Title"); // Corrected title spelling
        setSize(400, 400);

        // Create and add a JLabel
        JLabel label = new JLabel("Hello, welcome to my application!", SwingConstants.CENTER);
        add(label); // Add the label to the JFrame

        setVisible(true); // Set the frame visible
    }

    public static void main(String[] args) {
        new Creating_Jframe_another_method(); // Corrected constructor call
    }
}
