package lab_included;

import java.util.Comparator;

public class SortByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        OpenShape s1 = (OpenShape) o1;
        OpenShape s2 = (OpenShape) o2;

        if ( s1.length() < s2.length() )
            return -1;
        else if ( s1.length() == s2.length() )
            return 0;
        else
            return 1;

    }
}
