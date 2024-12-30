package Final_Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorChanger {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Button Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton redButton = new JButton("Red");
        JButton blueButton = new JButton("Blue");
        JButton clearButton = new JButton("Clear");

        // Store original colors
        Color originalRedColor = redButton.getBackground();
        Color originalBlueColor = blueButton.getBackground();

        // Add ActionListeners for buttons
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redButton.setBackground(Color.RED);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blueButton.setBackground(Color.BLUE);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redButton.setBackground(originalRedColor);
                blueButton.setBackground(originalBlueColor);
            }
        });

        // Add buttons to frame
        frame.add(redButton);
        frame.add(blueButton);
        frame.add(clearButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
