package gui_pkg;
import lab_included.*;
import lab_included.Shape;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

    public MyPanel(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {

        lab_included.Shape[] shapes = new lab_included.Shape[6];

        // Closed shapes
        shapes[0] = new lab_included.Rectangle(20, 30, 500, 700);
        shapes[1] = new Triangle(0, 0, 200, 200, 100, 300);
        shapes[2] = new Circle(0, 0, 200);

        // Open shapes
        shapes[3] = new Line(20, 50, 700, 800);
        shapes[4] = new PolyLine(105, 120, 900, 910, 20, 570, 75, 820);
        shapes[5] = new Arc(5, 6, 20, 30, 45);

        for ( Shape shape: shapes){
            shape.draw(g);
        }
    }
}
