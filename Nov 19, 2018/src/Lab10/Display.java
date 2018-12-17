package Lab10;

import javax.swing.*;
import java.awt.*;

public class Display {
    private JFrame frame;
    private Commands panel;
    private Canvas dboard;

    public Display(){
        frame = new JFrame("GUI Example");
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());
        panel = new Commands();
        frame.add(panel, BorderLayout.NORTH);
        dboard = new Canvas();
        frame.add(dboard, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
