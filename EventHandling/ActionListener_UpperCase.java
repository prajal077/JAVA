package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_UpperCase {
    public static void main(String [] agrs) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setSize(500,500);
        j.setLayout(new FlowLayout());
        j.setVisible(true);

        JTextField tf = new JTextField(20);
        j.add(tf);

        JButton jb = new JButton("toUpperCase");
        jb.setBackground(Color.LIGHT_GRAY);
        j.add(jb);

        ActionListener listen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = tf.getText();
                string = string.toUpperCase();
                tf.setText(string);
            }
        };

        jb.addActionListener(listen);
    }
}
