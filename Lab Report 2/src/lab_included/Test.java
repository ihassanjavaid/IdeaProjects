package lab_included;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test{
    public static void main(String[] args) {

        Shape[] shapestest = new Shape[6];

        // Closed shapes
        shapestest[0] = new Rectangle(20, 30, 500, 700);
        shapestest[1] = new Triangle(0, 0, 200, 200, 100, 300);
        shapestest[2] = new Circle(0, 0, 200);

        // Open shapes
        shapestest[3] = new Line(20, 50, 700, 800);
        shapestest[4] = new PolyLine(105, 120, 900, 910, 20, 570, 75, 820);
        shapestest[5] = new Arc(5, 6, 20, 30, 45);

        List closedShapesList = new ArrayList();

        closedShapesList.add(shapestest[0]);
        closedShapesList.add(shapestest[1]);
        closedShapesList.add(shapestest[2]);

        List openShapesList = new ArrayList();

        openShapesList.add(shapestest[3]);
        openShapesList.add(shapestest[4]);
        openShapesList.add(shapestest[5]);


        Collections.sort(closedShapesList, new SortByArea());

        for ( int i = 0 ; i < closedShapesList.size() ; i++ ){
            CloseShape cs = (CloseShape) closedShapesList.get(i);
            cs.displayArea();
        }

        Collections.sort(closedShapesList, new SortByPerimeter());

        for ( int i = 0 ; i < closedShapesList.size() ; i++ ){
            CloseShape cs = (CloseShape) closedShapesList.get(i);
            cs.displayPerimeter();
        }


        Collections.sort(openShapesList, new SortByLength());

        for ( int i = 0 ; i < openShapesList.size(); i++ ){
            OpenShape os = (OpenShape) openShapesList.get(i);
            os.displayLength();
        }
    }

}