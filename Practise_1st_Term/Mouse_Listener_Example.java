package Practise_1st_Term;

/*Write a GUI program using components to find sum and difference of two numbers.
Use two text fields for giving input and a label for output. The program should display sum if  user presses mouse
and difference if user release mouse.(2+8)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse_Listener_Example {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("mouse Adapter");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter the two numbers: ");
        jf.add(label);

        JTextField t1 = new JTextField(20);
        jf.add(t1);

        JTextField t2 = new JTextField(20);
        jf.add(t2);

        JTextField result = new JTextField(20);
        jf.add(result);

        JButton btn = new JButton("Submit");
        jf.add(btn);

        jf.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }

            @Override
            public void mouseReleased (MouseEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int diff = num1 - num2;
                result.setText(String.valueOf(diff));
            }
        });

        jf.setVisible(true);
    }
}
