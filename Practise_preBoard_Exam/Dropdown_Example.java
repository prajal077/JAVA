package Practise_preBoard_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dropdown_Example {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a dropdown (combo box) with color options
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> colorDropdown = new JComboBox<>(colors);

        // Create a button
        JButton button = new JButton("Show Color");

        // Create a label to display the color name
        JLabel colorLabel = new JLabel();
        colorLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected color from the dropdown
                String selectedColor = (String) colorDropdown.getSelectedItem();

                // Set the label text and color based on the selection
                if (selectedColor != null) {
                    colorLabel.setText(selectedColor);
                    switch (selectedColor) {
                        case "Red":
                            colorLabel.setForeground(Color.RED);
                            break;
                        case "Green":
                            colorLabel.setForeground(Color.GREEN);
                            break;
                        case "Blue":
                            colorLabel.setForeground(Color.BLUE);
                            break;
                    }
                }
            }
        });

        // Add components to the frame
        frame.add(colorDropdown);
        frame.add(button);
        frame.add(colorLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
