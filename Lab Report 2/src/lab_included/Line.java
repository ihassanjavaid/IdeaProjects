package lab_included;

import java.awt.*;

public class Line extends OpenShape implements Drawable {

    public Line() { // Constructor
        super();
        super.x2 = 0;
        super.y2 = 0;
    }

    public Line(int x1_in, int y1_in, int x2_in, int y2_in) { // Constructor with arguments
        super(x1_in, y1_in, x2_in, y2_in);
    }

    @Override
    public double length() {
        double temp1 = Math.pow(x2 - x1, 2);
        double temp2 = Math.pow(y2 - y1, 2);
        double length = Math.pow(temp1 + temp2, 0.5);
        return length;
    }

    @Override
    public void translate(int tr) {
        super.translate(tr);
    }

    @Override
    public void rotate(int angle) {
        super.rotate(angle);
    }

    @Override
    public void draw(Graphics g){
        g.drawLine(x1, y1, x2, y2);
    }

    public void displayLength(){
        System.out.println(this.getClass() +" has length: " +length());
    }
}