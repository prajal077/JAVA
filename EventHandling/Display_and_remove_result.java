package EventHandling;
///WAP using frame to calculate addition of 2 numbers input by the user and display the result
// when user click "add" button and clear the result when user click "clear" button


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display_and_remove_result {
    public static void main(String [] agrs) {
        JFrame frm = new JFrame();
        frm.setTitle("remove Example");
        frm.setSize(500,500);
        frm.setLayout(new FlowLayout());

        JLabel lb = new JLabel("Enter the two numbers: ");
        frm.add(lb);

        JTextField jtf1 = new JTextField(10);
        frm.add(jtf1);
        JTextField jtf2 = new JTextField(10);
        frm.add(jtf2);
        JTextField jtf3 = new JTextField(10);
        frm.add(jtf3);

        JButton btn1 = new JButton("Add");
        frm.add(btn1);
        JButton btn2 = new JButton("Clear");
        frm.add(btn2);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());

                int result = num1+num2;
                jtf3.setText(String.valueOf(result));
            }
        };
        ActionListener clr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf3.setText(" ");
            }
        };

        btn1.addActionListener(listener);
        btn2.addActionListener(clr);

        frm.setVisible(true);
    }
}
