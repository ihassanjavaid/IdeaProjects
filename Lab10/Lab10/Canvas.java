package Lab10;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {


    public Canvas(){
        super();
        setSize(400, 400);
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawRect(10,20,240,240);
        //Circle c = new Circle();
        //c.draw(g);
        checkBox(g);
    }

    private void checkBox(Graphics g){
        int i, j;
        int s = 50;
        boolean black = true;
        for (i = 0; i < 4000; i+=s) {

            for (j = 0; j < 4000; j += s) {
                if (black)
                    g.fillRect(i, j, s, s);
                else
                    g.drawRect(i, j, s, s);
                black = !black;
            }
            black = !black;
        }

    }
}
