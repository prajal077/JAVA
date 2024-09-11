import javax.swing.*;
import java.awt.event.*;

public class FocusListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Listener Example");
        JTextField textField1 = new JTextField("Click to focus", 20);
        JTextField textField2 = new JTextField("Another field", 20);

        // Adding FocusListener to textField1
        textField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("TextField1 gained focus");
                textField1.setText("Focused!");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("TextField1 lost focus");
                textField1.setText("Click to focus");
            }
        });

        // Adding components to frame
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(textField1);
        frame.add(textField2);

        // Setting frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
