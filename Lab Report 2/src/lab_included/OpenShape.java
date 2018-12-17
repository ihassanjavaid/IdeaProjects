package lab_included;

public abstract class OpenShape extends Shape implements Drawable{

    protected int x2;
    protected int y2;

    public OpenShape(){
        super();
        this.x2 = 0;
        this.y2 = 0;
    }

    public OpenShape(int x1_in, int y1_in, int x2_in, int y2_in){
        super(x1_in, y1_in);
        this.x2 = x2_in;
        this.y2 = y2_in;
    }

    @Override
    public void translate(int tr){
        super.x1 = super.x1 + tr;
        super.y1 = super.y1 + tr;

        this.x2 = this.x2 + tr;
        this.y2 = this.y2 + tr;
    }

    @Override
    public void rotate(int angle){
        super.x1 = (int) (Math.cos(angle) * super.x1 - Math.sin(angle) * super.y1);
        super.y1 = (int) (Math.sin(angle) * super.x1 + Math.cos(angle) * super.y1);

        this.x2 = (int) (Math.cos(angle) * this.x2 - Math.sin(angle) * this.y2);
        this.y2 = (int) (Math.sin(angle) * this.x2 + Math.cos(angle) * this.y2);
    }

    public abstract double length();
    public abstract void displayLength();
}