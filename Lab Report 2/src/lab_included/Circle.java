package lab_included;

import java.awt.*;

public class Circle extends CloseShape implements Drawable{

    private int r1;
    private final double pi = 3.14151;

    public Circle(){ // Constructor
        super();
        r1 = 0;
    }

    public Circle(int x, int y, int r){ // Constrictor taking arguments
        super(x,y);
        this.r1 = r;
    }

    public Circle(int r){ // Constructor setting origin to (0, 0) and only radius
        super();
        this.r1 = r;
    }

    @Override
    public double perimeter(){ // Circumference
        double circumference =  (2)*(pi)*(this.r1);
        return circumference;
    }

    @Override
    public double area(){
        double ar = (pi)*(this.r1)*(this.r1);
        return ar;
    }

    @Override
    public void translate(int tr){
        super.translate(tr);
    }

    @Override
    public void rotate(int angle){
        // There would be no change if we rotate the circle
    }

    @Override
    public void draw(Graphics g){
        g.drawOval(x1, y1, r1, r1);
    }

    public void displayArea(){
        System.out.println(this.getClass() +" has area: " +area());
    }

    public void displayPerimeter(){
        System.out.println(this.getClass() +" has perimeter: " +perimeter());
    }

}