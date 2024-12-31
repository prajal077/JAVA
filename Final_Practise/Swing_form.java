package Final_Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_form {
    public static void main(String[] args) {
        JFrame j = new JFrame("form");
        j.setLayout(new FlowLayout());
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setSize(500,500);

        JLabel l1 = new JLabel("FirstName");
        JTextField fn = new JTextField(15);
        j.add(l1);
        j.add(fn);

        JLabel l2 = new JLabel("LastName");
        JTextField ln = new JTextField(15);
        j.add(l2);
        j.add(ln);

        JLabel l3 = new JLabel("Email");
        JTextField email = new JTextField(15);
        j.add(l3);
        j.add(email);

        JLabel l4 = new JLabel("UserName");
        JTextField user = new JTextField(15);
        j.add(l4);
        j.add(user);

        JLabel l5 = new JLabel("Password");
        JTextField pass = new JTextField(15);
        j.add(l5);
        j.add(pass);

        JLabel l6 = new JLabel("Mobile");
        JTextField num = new JTextField(15);
        j.add(l6);
        j.add(num);

        JTextArea display = new JTextArea();
        j.add(display);

        JButton Register = new JButton("Register");
        j.add(Register);


        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String details = "Firstname: "+fn.getText() +
                        "\nLastname: "+ln.getText() +
                        "\nEmail: "+email.getText() +
                        "\nusername: "+user.getText() +
                        "\npassword: "+pass.getText() +
                        "\nmobile: "+num.getText();

                display.setText(details);

            }
        });


        j.setVisible(true);
    }
}
