package lab_included;

import java.awt.*;

public abstract class Shape {

    protected int x1;
    protected int y1;

    public Shape() { // Constructor of lab_included.Shape
        this.x1 = 0;
        this.y1 = 0;
    }

    public Shape(int x, int y) { // Constructor with arguments
        this.x1 = x;
        this.y1 = y;
    }

    public abstract void translate(int tr);
    public abstract void rotate(int angle);
    public abstract void draw(Graphics g);

}
