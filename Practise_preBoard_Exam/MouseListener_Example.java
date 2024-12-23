package Practise_preBoard_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListener_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField num1 = new JTextField(10);
        frame.add(num1);

        JTextField num2 = new JTextField(10);
        frame.add(num2);

        JButton button = new JButton("Calculate");
        frame.add(button);

        JLabel resultLabel = new JLabel("Result:");
        frame.add(resultLabel);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    int sum = number1 + number2;
                    resultLabel.setText("Result: Sum = " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Please enter valid numbers.");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    int difference = number1 - number2;
                    resultLabel.setText("Result: Difference = " + difference);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}

