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








        j.setVisible(true);
        j.setSize(800,800);
    }
}

public class LayoutManager_Project {
    public static void main(String [] agrs) {
        Layout l = new Layout();
    }
}
