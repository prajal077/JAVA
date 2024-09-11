import javax.swing.*;
import java.awt.event.*;

public class ItemListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Item Listener Example");
        JCheckBox checkBox = new JCheckBox("Check me");

        // Adding ItemListener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox is selected");
                } else {
                    System.out.println("Checkbox is deselected");
                }
            }
        });

        // Adding components to frame
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(checkBox);

        // Setting frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
