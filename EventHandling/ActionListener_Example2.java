package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_Example2 {
    public static void main(String [] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setTitle("example 2");
        f.setLayout(new FlowLayout());

        f.setBackground(Color.GRAY);
        JLabel name = new JLabel("Enter your name");
        name.setBounds(0,0,0,0);

        JTextField jt = new JTextField(30);
        jt.setBounds(0,1000,0,0);

        JButton submit = new JButton("Submit");
        submit.setBackground(Color.orange);

        ActionListener show = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submit.setText("hello"+jt.getText()+"welcome!!!");
            }
        };

        f.add(jt);
        f.add(name);
        f.add(submit);
        submit.addActionListener(show);
        f.setVisible(true);

    }
}
