package lab_included;

import java.awt.*;

public class PolyLine extends Line implements Drawable{

    private int x3;
    private int y3;

    private int x4;
    private int y4;


    public PolyLine(){
        super();
        this.x3 = 0;
        this.y3 = 0;
        this.x4 = 0;
        this.y4 = 0;
    }

    public PolyLine(int x1_in, int y1_in, int x2_in, int y2_in, int x3_in, int y3_in, int x4_in, int y4_in){ // Constructor with arguments
        super(x1_in, y1_in, x2_in, y2_in);
        this.x3 = x3_in;
        this.y3 = y3_in;
        this.x4 = x4_in;
        this.y4 = y4_in;
    }

    @Override
    public double length(){
        double temp1 = Math.pow(super.x2 - super.x1, 2);
        double temp2 = Math.pow(super.y2 - super.y1, 2);
        double length1 = Math.pow(temp1 + temp2, 0.5);

        double temp3 = Math.pow(this.x3 - super.x2, 2);
        double temp4 = Math.pow(this.y3 - super.y2, 2);
        double length2 = Math.pow(temp3 + temp4, 0.5);

        double temp5 = Math.pow(this.x4 - this.x3, 2);
        double temp6 = Math.pow(this.y4 - this.y3, 2);
        double length3 = Math.pow(temp5 + temp6, 0.5);

        double length = length1 + length2 + length3;
        return length;
    }

    @Override
    public void translate(int tr){
        super.translate(tr);

        this.x3 = this.x3 + tr;
        this.y3 = this.y3 + tr;

        this.x4 = this.x4 + tr;
        this.y4 = this.y4 + tr;
    }

    @Override
    public void rotate(int angle) {
        super.rotate(angle);

        this.x3 = (int) (Math.cos(angle) * this.x3 - Math.sin(angle) * this.y3);
        this.y3 = (int) (Math.sin(angle) * this.x3 + Math.cos(angle) * this.y3);

        this.x4 = (int) (Math.cos(angle) * this.x4 - Math.sin(angle) * this.y4);
        this.y4 = (int) (Math.sin(angle) * this.x4 + Math.cos(angle) * this.y4);

    }

    @Override
    public void draw(Graphics g){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
    }

    public void displayLength(){
        System.out.println(this.getClass() +" has length: " +length());
    }
}
