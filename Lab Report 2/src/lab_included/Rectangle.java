package lab_included;

import java.awt.*;

public class Rectangle extends CloseShape implements Drawable {

    private int length;
    private int width;

    public Rectangle(){ // Constructor
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(int x1_in, int y1_in, int length_in, int width_in){ // Constructor taking arguments
        super(x1_in, y1_in);
        this.length = length_in;
        this.width = width_in;
    }

    @Override
    public double area(){
        double ar = (length * width);
        return ar;
    }

    @Override
    public double perimeter(){
        double pr = ( 2 * ( length + width) );
        return pr;
    }

    @Override
    public void translate(int tr) {
        super.translate(tr);
    }

    @Override
    public void rotate(int angle) {
        super.rotate(angle);
    }

    public void draw(Graphics g){
        g.drawRect(x1, y1, width, length);
    }

    public void displayArea(){
        System.out.println(this.getClass() +" has area: " +area());
    }

    public void displayPerimeter(){
        System.out.println(this.getClass() +" has perimeter: " +perimeter());
    }
}
