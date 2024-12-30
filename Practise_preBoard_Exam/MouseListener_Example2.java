package Practise_preBoard_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener_Example2 {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setTitle("mouse listener");
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setSize(300, 200);
        j.setLayout(new FlowLayout());

        JLabel l = new JLabel("Enter two numbers");
        j.add(l);

        JTextField num1 = new JTextField(10);
        j.add(num1);
        JTextField num2 = new JTextField(10);
        j.add(num2);
        JTextField result = new JTextField(10);
        j.add(result);

        JButton button = new JButton("submit");
        j.add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int sum = n1 + n2;
                    result.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    result.setText("Error: Enter numbers");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int diff = n1 - n2;
                    result.setText(String.valueOf(diff));
                } catch (NumberFormatException ex) {
                    result.setText("Error: Enter numbers");
                }
            }
        });

        j.setVisible(true);
    }
}
