package Lab10;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        super();
        setSize(400, 400);
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawRect(10,20,250,250);
    }
}
