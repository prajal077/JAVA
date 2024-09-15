import javax.swing.*;
import java.awt.*;

public class Notepad_project_with_swing {
    public static void main(String [] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setTitle("Notepad Project");
        j.setSize(500,500);
        j.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar menu = new JMenuBar();
        j.add(menu);
        JMenu m1 = new JMenu("File");
        menu.add(m1);
        JMenu m2 = new JMenu("Edit");
        menu.add(m2);
        JMenu m3 = new JMenu("Format");
        menu.add(m3);
        JMenu m4 = new JMenu("View");
        menu.add(m4);
        JMenu m5 = new JMenu("Help");
        menu.add(m5);

        JMenuItem i1 = new JMenuItem("New Tab");
        JMenuItem i2 = new JMenuItem("New Window");
        JMenuItem i3 = new JMenuItem("Open");
        JMenuItem i4 = new JMenuItem("Save");
        JMenuItem i5 = new JMenuItem("Save as");

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);

        JMenuItem ji1 = new JMenuItem("Undo");
        JMenuItem ji2 = new JMenuItem("Cut");
        JMenuItem ji3 = new JMenuItem("Copy");
        JMenuItem ji4 = new JMenuItem("Paste");

        m2.add(ji1);
        m2.add(ji2);
        m2.add(ji3);
        m2.add(ji4);




        j.setVisible(true);
    }
}
