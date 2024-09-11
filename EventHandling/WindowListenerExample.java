import javax.swing.*;
import java.awt.event.*;

public class WindowListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Listener Example");

        // Set frame size and close operation
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Adding WindowListener using an anonymous class
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                int response = JOptionPane.showConfirmDialog(frame,
                        "Do you really want to exit?", "Confirm Exit",
                        JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    frame.dispose();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window restored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
