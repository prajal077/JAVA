package Practise_preBoard_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setSize(500,500);
        j.setLayout(new FlowLayout());
        j.setTitle("Addition");

        JLabel jl = new JLabel("Enter two numbers: ");
        j.add(jl);

        JTextField num1 = new JTextField(10);
        j.add(num1);
        JTextField num2 = new JTextField(10);
        j.add(num2);
        JTextField sum = new JTextField(10);
        j.add(sum);

        JButton btnAdd = new JButton("Add");
        j.add(btnAdd);

        JButton btnClear = new JButton("clear");
        j.add(btnClear);

        ActionListener summ = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numI = Integer.parseInt(num1.getText());
                int numII = Integer.parseInt(num2.getText());

                int result = numI+numII;
                sum.setText(String.valueOf(result));
            }
        };

        ActionListener clearr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
                sum.setText("");
            }
        };

        btnAdd.addActionListener(summ);
        btnClear.addActionListener(clearr);
        j.setVisible(true);
    }
}
