package Lab10;


import javax.swing.*;
import java.awt.*;

public class Display {
    private JFrame frame;
    private Canvas drawingBoard;

    public Display(){
        frame = new JFrame("GUI Example");
        frame.setSize(600, 400);
        frame.setBackground(Color.GREEN);
        frame.setLayout(new BorderLayout());
        panel = new Commands();
        frame.add(panel, BorderLayout.SOUTH);
        drawingBoard = new Canvas();
        frame.add(drawingBoard, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
