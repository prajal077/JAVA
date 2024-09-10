package EventHandling;
//WAP to create two textFields and enter the numbers in their by user. also create 2 button named "swap" and "square".
//When user clicks swap button, swap the contents of textfileds and when user click square button, square the corresponding number
//and display the result in same related textfields.
//Also throw an error message if user input other characters in the textfields rather than numbers
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swapping_and_square {
    public static void main(String[] args) {
        JFrame jfr = new JFrame();
        jfr.setTitle("Example 6");
        jfr.setSize(500,500);
        jfr.setLayout(new FlowLayout());

        JLabel jl = new JLabel("Enter the two numbers: ");
        jfr.add(jl);

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        jfr.add(t1);
        jfr.add(t2);

        JButton b1 = new JButton("swap");
        JButton b2 = new JButton("square");
        jfr.add(b1);
        jfr.add(b2);

        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int temp;
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    temp = num1;
                    num1 = num2;
                    num2 = temp;

                    t1.setText(String.valueOf(num1));
                    t2.setText(String.valueOf(num2));
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jfr, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        b1.addActionListener(act);

        ActionListener sqr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {


                    int sq1 = Integer.parseInt(t1.getText());
                    int sq2 = Integer.parseInt(t2.getText());

                    sq1 = sq1 * sq1;
                    sq2 = sq2 * sq2;

                    t1.setText(String.valueOf(sq1));
                    t2.setText(String.valueOf(sq2));
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(jfr, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        b2.addActionListener(sqr);

        jfr.setVisible(true);
    }
}
