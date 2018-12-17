import javax.swing.*;
import java.awt.*;

public class BasicFrame {
    private JFrame frame;

    public BasicFrame(){
        frame = new JFrame("Snake and Ladders Game");
        frame.setSize(1485,1070);
        frame.setBackground(Color.DARK_GRAY);
        frame.setLayout(new BorderLayout());
    }
}
