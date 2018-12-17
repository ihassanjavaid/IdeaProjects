package lab_included;

import java.awt.*;

public class Arc extends OpenShape implements Drawable{

    private int angle;

    private int height;
    private int width;

    public Arc(){ // Constructor
        super();
        angle = 0;
        setDefaultHeightWidth();
    }

    public Arc(int x1_in, int y1_in, int x2_in, int y2_in, int ang) { // Constructor with arguments
        super(x1_in, y1_in, x2_in, y2_in);
        this.angle = ang;
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
    public double length() {
        double temp1 = Math.pow(x2 - x1, 2);
        double temp2 = Math.pow(y2 - y1, 2);
        double length = Math.pow(temp1 + temp2, 0.5);
        return length;
    }

    @Override
    public void draw(Graphics g){
        g.drawArc(x1, y1, getWidth(), getHeight(), getAngle(), getAngle());
    }

    public void setDefaultHeightWidth(){
        this.height = 500;
        this.width = 500;
    }

    public void setHeight(int ht) {
        this.height = ht;
    }

    public void setWidth(int wd) {
        this.width = wd;
    }

    public void setAngle(int angl) {
        this.angle = angl;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getAngle() {
        return angle;
    }

    public void displayLength(){
        System.out.println(this.getClass() +" has length: " +length());
    }
}
