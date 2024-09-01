import javax.swing.*;

public class SwingExample extends JFrame {

    // Constructor to set up the frame
    public SwingExample() {
        setTitle("Swing Example");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        initializeComponents();
    }

    // Method to initialize and add components to the frame
    private void initializeComponents() {
        // JLabel
        JLabel label = new JLabel("Enter your details:");
        label.setBounds(20, 20, 150, 20);
        add(label);

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 150, 20);
        add(textField);

        // JPasswordField
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 60, 150, 20);
        add(passwordField);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("I agree to the terms");
        checkBox.setBounds(150, 100, 200, 20);
        add(checkBox);

        // JRadioButton
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 130, 70, 20);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(220, 130, 80, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        add(maleButton);
        add(femaleButton);

        // JList
        String[] countries = {"India", "USA", "UK", "Australia"};
        JList<String> countryList = new JList<>(countries);
        countryList.setBounds(150, 160, 100, 60);
        add(countryList);

        // JTextArea
        JTextArea textArea = new JTextArea("Comments");
        textArea.setBounds(150, 230, 150, 60);
        add(textArea);

        // JButton - Submit button moved to the bottom
        JButton button = new JButton("Submit");
        button.setBounds(150, 310, 100, 30);
        add(button);

        // Add ActionListener to JButton using lambda expression
        button.addActionListener(e -> {
            String details = "Name: " + textField.getText() +
                    "\nPassword: " + new String(passwordField.getPassword()) +
                    "\nGender: " + (maleButton.isSelected() ? "Male" : "Female") +
                    "\nCountry: " + countryList.getSelectedValue() +
                    "\nComments: " + textArea.getText();
            JOptionPane.showMessageDialog(this, details);
        });
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingExample frame = new SwingExample();
        frame.setVisible(true);
    }
}
