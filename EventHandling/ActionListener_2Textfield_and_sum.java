package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_2Textfield_and_sum {
    public static void main(String [] agrs){
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setSize(500,500);
        j.setTitle("example3");
        j.setLayout(new FlowLayout());

        JLabel l = new JLabel("Enter two numbers: ");
        j.add(l);

        JTextField num1 = new JTextField(10);
        j.add(num1);

        JTextField num2 = new JTextField(10);
        j.add(num2);

        JTextField sum = new JTextField(10);
        j.add(sum);

        JButton submit = new JButton("click to Sum");
        j.add(submit);


        ActionListener summ = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numI = Integer.parseInt(num1.getText());
                int numII = Integer.parseInt(num2.getText());

                int result = numI + numII;

                sum.setText(String.valueOf(result));
            }
        };

        submit.addActionListener(summ);

        j.setVisible(true);
    }
}
