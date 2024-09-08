package EventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ActionListenerClass {
    ActionListenerClass () {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Action Listener Demo");
        frame.setSize(500, 500);

        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("show text");
        JButton b2 = new JButton("remove text");
        JTextField tf = new JTextField(20);

        ActionListener showtext = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Submit button clicked");
            }
        };

        ActionListener removetext = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                tf.setText("");
            }
        };

        b1.addActionListener(showtext);
        b2.addActionListener(removetext);
        frame.add(b1);
        frame.add(b2);
        frame.add(tf);

        frame.setVisible(true);
    }
}

public class ActionListenerDemo {
    public static void main(String [] args) {
        ActionListenerClass al = new ActionListenerClass();
    }
}
