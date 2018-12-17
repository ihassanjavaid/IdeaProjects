package lab_included;

import java.util.Comparator;

public class SortByArea implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        CloseShape s1 = (CloseShape) o1;
        CloseShape s2 = (CloseShape) o2;

        if ( s1.area() < s2.area() )
            return -1;
        else if ( s1.area() == s2.area() )
            return 0;
        else
            return 1;

    }
}
