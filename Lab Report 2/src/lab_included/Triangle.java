package lab_included;

import java.awt.*;

public class Triangle extends CloseShape{

    private int x2;
    private int y2;

    private int x3;
    private int y3;

    public Triangle(){ // Constructor
        super();
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
    }

    public Triangle(int x1_in, int y1_in, int x2_in, int y2_in, int x3_in, int y3_in){ // constructor with arguments
        super(x1_in, y1_in);
        this.x2 = x2_in;
        this.y2 = y2_in;
        this.x3 = x3_in;
        this.y3 = y3_in;
    }

    @Override
    public double area(){
        double temp1 = (this.x1)*(this.y2-this.y3);
        double temp2 = (this.x2)*(this.y3-this.y1);
        double temp3 =  (this.x3)*(this.y1-this.y2);
        double ar = (temp1 + temp2 + temp3) / 2 ;
        return ar;
    }

    private double getDistance(int x1, int x2, int y1, int y2){
        double temp1 = Math.pow(x2-x1, 2);
        double temp2 = Math.pow(y2-y1, 2);
        double dis = temp1 + temp2;
        double distanc = Math.pow(dis, 0.5);
        return distanc;
    }

    @Override
    public double perimeter(){
        double side1 = getDistance(x1, x2, y1, y2);
        double side2 = getDistance(x2, x3, y2, y3);
        double side3 = getDistance(x3, x1, y3, y1);
        double pr = side1 + side2 + side3;
        return pr;
    }

    @Override
    public void translate(int tr) {
        super.translate(tr);
        this.x2 = x2 + tr;
        this.y2 = y2 + tr;
        this.x3 = x3 + tr;
        this.y3 = y3 + tr;
    }

    @Override
    public void rotate(int angle) {
        super.rotate(angle);

        this.x2 = (int) (Math.cos(angle) * this.x2 - Math.sin(angle) * this.y2);
        this.y2 = (int) (Math.sin(angle) * this.x2 + Math.cos(angle) * this.y2);

        this.x3 = (int) (Math.cos(angle) * this.x3 - Math.sin(angle) * this.y3);
        this.y3 = (int) (Math.sin(angle) * this.x3 + Math.cos(angle) * this.y3);
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    public void displayArea(){
        System.out.println(this.getClass() +" has area: " +area());
    }

    public void displayPerimeter(){
        System.out.println(this.getClass() +" has perimeter: " +perimeter());
    }
}