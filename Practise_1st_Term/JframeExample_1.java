package Practise_1st_Term;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeExample_1 {
    public static void main(String[] args) {
        JFrame j =  new JFrame();
        j.setTitle("To upper");
        j.setSize(500,500);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setLayout(new FlowLayout());


        JLabel label = new JLabel("Enter a word: ");
        j.add(label);

        JTextField tf = new JTextField(20);
        j.add(tf);

        JButton btn = new JButton("Submit");
        j.add(btn);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = tf.getText();
                word = word.toUpperCase();
                tf.setText(word);
            }
        };

        btn.addActionListener(action);

        j.setVisible(true);
    }
}
