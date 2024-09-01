import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel
        JLabel label = new JLabel("Enter your details:");
        label.setBounds(20, 20, 150, 20);
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 150, 20);
        frame.add(textField);

        // JPasswordField
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 50, 150, 20);
        frame.add(passwordField);

        // JButton
        JButton button = new JButton("Submit");
        button.setBounds(150, 80, 100, 30);
        frame.add(button);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("I agree to the terms");
        checkBox.setBounds(150, 120, 200, 20);
        frame.add(checkBox);

        // JRadioButton
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 150, 70, 20);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(220, 150, 80, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        frame.add(maleButton);
        frame.add(femaleButton);

        // JList
        String[] countries = {"India", "USA", "UK", "Australia"};
        JList<String> countryList = new JList<>(countries);
        countryList.setBounds(150, 180, 100, 60);
        frame.add(countryList);

        // JTextArea
        JTextArea textArea = new JTextArea("Comments");
        textArea.setBounds(150, 250, 150, 60);
        frame.add(textArea);

        // ActionListener for JButton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String details = "Name: " + textField.getText() +
                        "\nPassword: " + new String(passwordField.getPassword()) +
                        "\nGender: " + (maleButton.isSelected() ? "Male" : "Female") +
                        "\nCountry: " + countryList.getSelectedValue() +
                        "\nComments: " + textArea.getText();
                JOptionPane.showMessageDialog(frame, details);
            }
        });

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
