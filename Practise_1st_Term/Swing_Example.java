package Practise_1st_Term;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Example {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setTitle("SUM");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label =  new JLabel("Enter the two numbers: ");
        f.add(label);

        JTextField tf1 = new JTextField(20);
        f.add(tf1);

        JTextField tf2 = new JTextField(20);
        f.add(tf2);

        JTextField sum = new JTextField(20);
        f.add(sum);

        JButton btn = new JButton("Submit");
        f.add(btn);


        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tf1.getText());
                int num2 = Integer.parseInt(tf2.getText());
                int summ = num1+num2;
                sum.setText(String .valueOf(summ));
            }
        };

        btn.addActionListener(action);
        f.setVisible(true);
    }
}
