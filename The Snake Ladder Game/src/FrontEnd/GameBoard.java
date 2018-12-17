package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private Image backgroundImage;

    private pointsGUI[] points_gui = new pointsGUI[2];

    public GameBoard() {
        backgroundImage = new ImageIcon("C:\\Users\\FLEX 4\\IdeaProjects\\The Snake Ladder Game\\src\\FrontEnd\\imagedrawn.jpg").getImage();

        // To show players on Block-1
        points_gui[0] = new pointsGUI(60, 820);
        points_gui[1] = new pointsGUI(50, 830);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(backgroundImage, 0,0,this);

        graphics.setColor(Color.RED);
        graphics.fillOval(points_gui[0].getX(), points_gui[0].getY(), 50, 50);

        graphics.setColor(Color.BLUE);
        graphics.fillOval(points_gui[1].getX(), points_gui[1].getY(), 50, 50);
    }
    
    public void setPointsHere(ValuesAndValueType val_n_typ){

        if ( val_n_typ.getType() == 0)
            getPointsforDrawing(val_n_typ.getVal(), 0);

        else
            getPointsforDrawing(val_n_typ.getVal(),1);
    }

    public void getPointsforDrawing(int position, int i){


        switch (position){

            // Row 1
            case 73:
               points_gui[i].setPointsGUI(50,50);
               break;
            case 74:
                points_gui[i].setPointsGUI(170,50);
                break;
            case 75:
                points_gui[i].setPointsGUI(290,50);
                break;
            case 76:
                points_gui[i].setPointsGUI(410,50);
                break;
            case 77:
                points_gui[i].setPointsGUI(530,50);
                break;
            case 78:
                points_gui[i].setPointsGUI(650,50);
                break;
            case 79:
                points_gui[i].setPointsGUI(770,50);
                break;
            case 80:
                points_gui[i].setPointsGUI(890,50);
                break;
            case 81:
                points_gui[i].setPointsGUI(1010,50);
                break;
            case 82:
                points_gui[i].setPointsGUI(1130,50);
                break;
            case 83:
                points_gui[i].setPointsGUI(1250,50);
                break;
            case 84:
                points_gui[i].setPointsGUI(1370,50);
                break;

            //Row 2
            case 72:
                points_gui[i].setPointsGUI(50,180);
                break;
            case 71:
                points_gui[i].setPointsGUI(170,180);
                break;
            case 70:
                points_gui[i].setPointsGUI(290,180);
                break;
            case 69:
                points_gui[i].setPointsGUI(410,180);
                break;
            case 68:
                points_gui[i].setPointsGUI(530,180);
                break;
            case 67:
                points_gui[i].setPointsGUI(650,180);
                break;
            case 66:
                points_gui[i].setPointsGUI(770,180);
                break;
            case 65:
                points_gui[i].setPointsGUI(890,180);
                break;
            case 64:
                points_gui[i].setPointsGUI(1010,180);
                break;
            case 63:
                points_gui[i].setPointsGUI(1130,180);
                break;
            case 62:
                points_gui[i].setPointsGUI(1250,180);
                break;
            case 61:
                points_gui[i].setPointsGUI(1370,180);
                break;

            // Row 3
            case 49:
                points_gui[i].setPointsGUI(50,310);
                break;
            case 50:
                points_gui[i].setPointsGUI(170,310);
                break;
            case 51:
                points_gui[i].setPointsGUI(290,310);
                break;
            case 52:
                points_gui[i].setPointsGUI(410,310);
                break;
            case 53:
                points_gui[i].setPointsGUI(530,310);
                break;
            case 54:
                points_gui[i].setPointsGUI(650,310);
                break;
            case 55:
                points_gui[i].setPointsGUI(770,310);
                break;
            case 56:
                points_gui[i].setPointsGUI(890,310);
                break;
            case 57:
                points_gui[i].setPointsGUI(1010,310);
                break;
            case 58:
                points_gui[i].setPointsGUI(1130,310);
                break;
            case 59:
                points_gui[i].setPointsGUI(1250,310);
                break;
            case 60:
                points_gui[i].setPointsGUI(1370,310);
                break;

            //Row 4
            case 48:
                points_gui[i].setPointsGUI(50,440);
                break;
            case 47:
                points_gui[i].setPointsGUI(170,440);
                break;
            case 46:
                points_gui[i].setPointsGUI(290,440);
                break;
            case 45:
                points_gui[i].setPointsGUI(410,440);
                break;
            case 44:
                points_gui[i].setPointsGUI(530,440);
                break;
            case 43:
                points_gui[i].setPointsGUI(650,440);
                break;
            case 42:
                points_gui[i].setPointsGUI(770,440);
                break;
            case 41:
                points_gui[i].setPointsGUI(890,440);
                break;
            case 40:
                points_gui[i].setPointsGUI(1010,440);
                break;
            case 39:
                points_gui[i].setPointsGUI(1130,440);
                break;
            case 38:
                points_gui[i].setPointsGUI(1250,440);
                break;
            case 37:
                points_gui[i].setPointsGUI(1370,440);
                break;

            // Row 5
            case 25:
                points_gui[i].setPointsGUI(50,570);
                break;
            case 26:
                points_gui[i].setPointsGUI(170,570);
                break;
            case 27:
                points_gui[i].setPointsGUI(290,570);
                break;
            case 28:
                points_gui[i].setPointsGUI(410,570);
                break;
            case 29:
                points_gui[i].setPointsGUI(530,570);
                break;
            case 30:
                points_gui[i].setPointsGUI(650,570);
                break;
            case 31:
                points_gui[i].setPointsGUI(770,570);
                break;
            case 32:
                points_gui[i].setPointsGUI(890,570);
                break;
            case 33:
                points_gui[i].setPointsGUI(1010,570);
                break;
            case 34:
                points_gui[i].setPointsGUI(1130,570);
                break;
            case 35:
                points_gui[i].setPointsGUI(1250,570);
                break;
            case 36:
                points_gui[i].setPointsGUI(1370,570);
                break;

            // Row 6
            case 24:
                points_gui[i].setPointsGUI(50,700);
                break;
            case 23:
                points_gui[i].setPointsGUI(170,700);
                break;
            case 22:
                points_gui[i].setPointsGUI(290,700);
                break;
            case 21:
                points_gui[i].setPointsGUI(410,700);
                break;
            case 20:
                points_gui[i].setPointsGUI(530,700);
                break;
            case 19:
                points_gui[i].setPointsGUI(650,700);
                break;
            case 18:
                points_gui[i].setPointsGUI(770,700);
                break;
            case 17:
                points_gui[i].setPointsGUI(890,700);
                break;
            case 16:
                points_gui[i].setPointsGUI(1010,700);
                break;
            case 15:
                points_gui[i].setPointsGUI(1130,700);
                break;
            case 14:
                points_gui[i].setPointsGUI(1250,700);
                break;
            case 13:
                points_gui[i].setPointsGUI(1370,700);
                break;

            // Row 7
            case 1:
                points_gui[i].setPointsGUI(50,830);
                break;
            case 2:
                points_gui[i].setPointsGUI(170,830);
                break;
            case 3:
                points_gui[i].setPointsGUI(290,830);
                break;
            case 4:
                points_gui[i].setPointsGUI(410,830);
                break;
            case 5:
                points_gui[i].setPointsGUI(530,830);
                break;
            case 6:
                points_gui[i].setPointsGUI(650,830);
                break;
            case 7:
                points_gui[i].setPointsGUI(770,830);
                break;
            case 8:
                points_gui[i].setPointsGUI(890,830);
                break;
            case 9:
                points_gui[i].setPointsGUI(1010,830);
                break;
            case 10:
                points_gui[i].setPointsGUI(1130,830);
                break;
            case 11:
                points_gui[i].setPointsGUI(1250,830);
                break;
            case 12:
                points_gui[i].setPointsGUI(1370,830);
                break;
        }
        repaint();
    }
}

class pointsGUI{
    private int X;
    private int Y;

    public pointsGUI(int pointX, int pointY){
        this. X = pointX;
        this.Y = pointY;
    }

    public void setPointsGUI(int pointX, int pointY){
        this.X = pointX;
        this.Y = pointY;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}