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
        PersonalAccount.setBounds(150, 130, 70, 20);
        JRadioButton BusinessAccount = new JRadioButton("Business Account");
        BusinessAccount.setBounds(220, 130, 80, 20);
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









        j.setVisible(true);
        j.setSize(800,800);
    }
}

public class LayoutManager_Project {
    public static void main(String [] agrs) {
        Layout l = new Layout();
    }
}
