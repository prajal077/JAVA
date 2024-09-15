import javax.swing.*;
import java.awt.*;

public class Notepad_project_with_swing {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setTitle("Notepad Project");
        j.setSize(500, 500);
        j.setLayout(new BorderLayout()); // Changed layout to BorderLayout for better space usage

        // Create a menu bar
        JMenuBar menu = new JMenuBar();
        j.setJMenuBar(menu); // Attach menu to the frame

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

        // Adding menu items to "File"
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

        // Adding menu items to "Edit"
        JMenuItem ji1 = new JMenuItem("Undo");
        JMenuItem ji2 = new JMenuItem("Cut");
        JMenuItem ji3 = new JMenuItem("Copy");
        JMenuItem ji4 = new JMenuItem("Paste");
        m2.add(ji1);
        m2.add(ji2);
        m2.add(ji3);
        m2.add(ji4);

        // Create a JTextArea and put it in a JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); // Adds scroll bars to the text area
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        j.add(scrollPane, BorderLayout.CENTER); // Add the scroll pane to the center of the frame


        textArea.setBackground(Color.WHITE); // Notepad uses a white background
        textArea.setForeground(Color.BLACK); // Black text color

        // You can also set the font to make it look like Notepad (Monospaced font)
        textArea.setFont(new Font("Consolas", Font.PLAIN, 16));

        j.add(scrollPane, BorderLayout.CENTER); // Add the scroll pane to the center of the frame

        j.setVisible(true);
    }
}
