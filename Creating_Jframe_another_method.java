import javax.swing.*;

public class Creating_Jframe_another_method extends Jframe {
    FirsttGui () {
        SetDefaultCloseOperation(windowConstants.EXIT_ON_CLOSE());
        setTitle("My Tile");
        setSize(400, 400);
        JLabel label = new JLabel("Hello, welcome to my application!", SwingConstants.CENTER);
        setVisible(true);
    }
    public static void main(String [] args) {
        new FirstGui();

    }
}
