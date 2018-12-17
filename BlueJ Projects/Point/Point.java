public class Point{
    private int x;
    private int y;
    
    Point(){
        this.x = 0;
        this.y = 0;
    }
    
    Point(int x, int y){
        setPoint(x, y);
    }
    
    public void setPoint(int x, int y){
        setX(x);
        setY(y);
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.x = y;
    }
    
    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }
    
    public void setPolar(int r, int theta){
        this.x = (int)(r*(Math.cos(theta)));
        this.y = (int)(r*(Math.sin(theta)));
    }
    
    public void getPolar() throws ArithmeticException{
        try{
            System.out.println("theta = " +Math.atan(y/x));
            System.out.println("r = " +(((x*x)+(y*y))*0.5));
        }
        catch(ArithmeticException e){
            System.out.println("Zero Error");
        }
    }
    
}