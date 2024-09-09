package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class Key_ListenerExample {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("KeyListener Example");
        JLabel label = new JLabel();
        label.setBounds(20, 50, 100, 20);

        JTextField textField = new JTextField();
        textField.setBounds(20, 80, 300, 30);

        // Adding KeyListener
        textField.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed");
            }

            public void keyReleased(KeyEvent e) {
                label.setText("Key Released");
            }

            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed");
            }
        });

        jframe.add(label);
        jframe.add(textField);

        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
