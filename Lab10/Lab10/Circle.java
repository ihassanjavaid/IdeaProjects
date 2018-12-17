package Lab10;

import java.awt.*;

public class Circle{
    private int x;
    private int y;
    private int r;

    public Circle(){
        x = 200;
        y = 30;
        r = 10;
    }

    public void draw(Graphics g){
        g.drawOval(x-r, y-r, x+r, y+r);
    }


}
