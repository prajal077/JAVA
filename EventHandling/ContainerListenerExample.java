import javax.swing.*;
import java.awt.event.*;

public class ContainerListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Container Listener Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Add Button");

        // Adding ContainerListener to the panel
        panel.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("Component added: " + e.getChild().getClass().getName());
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                System.out.println("Component removed: " + e.getChild().getClass().getName());
            }
        });

        // Adding action listener to button to dynamically add a new button to the panel
        button.addActionListener(e -> {
            JButton newButton = new JButton("New Button");
            panel.add(newButton);
            panel.revalidate();
            panel.repaint();
        });

        // Adding components to frame
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(panel);

        // Setting frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
