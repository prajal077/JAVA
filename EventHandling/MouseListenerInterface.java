package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseListenerInterface {
    public static void main(String[] args) {

        JFrame f = new JFrame("mouse Listener Interface");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Example 7");
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        JLabel jla = new JLabel("No mouse Event");
        f.add(jla);

        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jla.setText("mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jla.setText("mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jla.setText("mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jla.setText("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jla.setText("Mouse exited");
            }
        };

        f.addMouseListener(listener);
        f.setVisible(true);
    }
}
