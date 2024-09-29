package Practise_1st_Term;

import javax.swing.*;
import java.awt.*;

public class JMenu_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MenuBar");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("View");

        frame.add(menubar);
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);

        JMenuItem fileItem1 = new JMenuItem("Open");
        JMenuItem fileItem2 = new JMenuItem("Save");
        menu1.add(fileItem1);
        menu1.add(fileItem2);

        JMenuItem editItem1 = new JMenuItem("Cut");
        JMenuItem editItem2 = new JMenuItem("Copy");
        menu2.add(editItem1);
        menu2.add(editItem2);

        JMenuItem viewItem1 = new JMenuItem("FullScreen");
        JMenuItem viewItem2 = new JMenuItem("WindowSize");
        menu3.add(viewItem1);
        menu3.add(viewItem2);

        JMenu subMenu = new JMenu("Zoom");
        JMenuItem zoomIn = new JMenuItem("Zoom In");
        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        subMenu.add(zoomIn);
        subMenu.add(zoomOut);
        frame.add(subMenu);

        //frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}
