package Final_Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Addition {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setTitle("Addition");
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setLayout(new FlowLayout());
        j.setSize(500,500);

        JLabel label = new JLabel("Enter two numbers: ");
        j.add(label);

        JTextField num1 = new JTextField(10);
        j.add(num1);
        JTextField num2 = new JTextField(10);
        j.add(num2);
        JTextField result = new JTextField(10);
        j.add(result);

        JButton add = new JButton("Add");
        j.add(add);
        JButton clear = new JButton("Clear");
        j.add(clear);

        JButton exit = new JButton("Exit");
        j.add(exit);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                int r = n1+n2;
                result.setText(String.valueOf(r));
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(" ");
                num2.setText(" ");
                result.setText("");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        j.setVisible(true);
    }
}
