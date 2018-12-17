package lab_included;

public abstract class CloseShape extends Shape{

    public CloseShape(){ // Constructor
        super();
    }

    public CloseShape(int x, int y){ // Constructor with arguments
        super(x, y);
    }

    @Override
    public void translate(int tr) {
        super.x1 = x1 + tr;
        super.y1 = y1 + tr;
    }

    @Override
    public void rotate(int angle) {
        this.x1 = (int) (Math.cos(angle) * this.x1 - Math.sin(angle) * this.y1);
        this.y1 = (int) (Math.sin(angle) * this.x1 + Math.cos(angle) * this.y1);
    }

    // Abstract methods to be applied in every child class
    public abstract double perimeter();
    public abstract double area();
    public abstract void displayArea();
    public abstract void displayPerimeter();
}