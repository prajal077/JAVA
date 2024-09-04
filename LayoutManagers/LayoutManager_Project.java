package LayoutManagers;

import javax.swing.*;
import java.awt.*;

class Layout {
    Layout () {
        JFrame j = new JFrame();

        j.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel accountTypeLabel = new JLabel("Account Type *");
        JRadioButton PersonalAccount = new JRadioButton("Personal Account");
        //PersonalAccount.setBounds(150, 130, 70, 20);
        JRadioButton BusinessAccount = new JRadioButton("Business Account");
        //BusinessAccount.setBounds(220, 130, 80, 20);
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(PersonalAccount);
        accountTypeGroup.add(BusinessAccount);
        j.add(PersonalAccount);
        j.add(BusinessAccount);


        JLabel FirstNameLabel = new JLabel("First Name *");
        JTextField FirstNameField = new JTextField(15);
        JLabel LastNameLabel = new JLabel("Last Name *");
        JTextField LastNameField = new JTextField(15);


        JLabel countryLabel = new JLabel("Country/Region *");
        JComboBox<String> countryDropdown = new JComboBox<>(new String[]{"United States", "Canada", "Other"});

        JLabel streetAddressLabel = new JLabel("Street Address *");
        JTextField streetAddressField = new JTextField(15);

        JLabel streetAddress2Label = new JLabel("Street Address 2");
        JTextField streetAddress2Field = new JTextField(15);

        JLabel cityLabel = new JLabel("City *");
        JTextField cityField = new JTextField(15);

        JLabel stateLabel = new JLabel("State/Province *");
        JComboBox<String> stateDropdown = new JComboBox<>(new String[]{"Select State or Province", "California", "Texas", "New York"});

        JLabel zipCodeLabel = new JLabel("ZIP/Postal Code *");
        JTextField zipCodeField = new JTextField(10);

        JLabel phoneLabel = new JLabel("Phone Number *");
        JTextField phoneField = new JTextField(10);


        // Set layout positions using GridBagConstraints

        // Account Type Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        j.add(accountTypeLabel, gbc);

        // Personal Account Radio Button
        gbc.gridx = 1;
        gbc.gridy = 0;
        j.add(PersonalAccount, gbc);

        // Business Account Radio Button
        gbc.gridx = 2;
        gbc.gridy = 0;
        j.add(BusinessAccount, gbc);

        // First Name Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        j.add(FirstNameLabel, gbc);

        // First Name Field
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(FirstNameField, gbc);

        // Last Name Label
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        j.add(LastNameLabel, gbc);

        // Last Name Field
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(LastNameField, gbc);

        // Country/Region Label
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        j.add(countryLabel, gbc);

        // Country/Region Dropdown
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(countryDropdown, gbc);

        // Street Address Label
        gbc.gridx = 0;
        gbc.gridy = 4;
        j.add(streetAddressLabel, gbc);

        // Street Address Field
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(streetAddressField, gbc);

        // Street Address 2 Label
        gbc.gridx = 0;
        gbc.gridy = 5;
        j.add(streetAddress2Label, gbc);

        // Street Address 2 Field
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        j.add(streetAddress2Field, gbc);

        // City Label
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        j.add(cityLabel, gbc);

        // City Field
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(cityField, gbc);

        // State/Province Label
        gbc.gridx = 0;
        gbc.gridy = 7;
        j.add(stateLabel, gbc);

        // State/Province Dropdown
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        j.add(stateDropdown, gbc);

        // ZIP/Postal Code Label
        gbc.gridx = 0;
        gbc.gridy = 8;
        j.add(zipCodeLabel, gbc);

        // ZIP/Postal Code Field
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        j.add(zipCodeField, gbc);

        // Phone Number Label
        gbc.gridx = 0;
        gbc.gridy = 9;
        j.add(phoneLabel, gbc);

        // Phone Number Field
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        j.add(phoneField, gbc);

        JButton button = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 11;
        j.add(button, gbc);


        j.setVisible(true);
        j.setSize(800,800);
    }
}

public class LayoutManager_Project {
    public static void main(String [] agrs) {
        Layout l = new Layout();
    }
}
