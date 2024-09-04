package LayoutManagers;


import javax.swing.*;
import java.awt.*;

class GB_layout {
    GB_layout() {
        JFrame JF = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        JF.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0;
        gbc.gridy=0;
        JF.add(b1,gbc);

        gbc.gridx=0;
        gbc.gridy=0;
        JF.add(b2,gbc);

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth = 2;
        JF.add(b3,gbc);

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth = 2;
        JF.add(b4,gbc);

        gbc.gridx=0;
        gbc.gridy=0;
        JF.add(b5,gbc);

        JF.setSize(400,400);
        JF.setVisible(true);
    }
}

public class GridBagLayout_Example {
    public static void main(String [] agrs) {
        GB_layout gb = new GB_layout();
    }
}
