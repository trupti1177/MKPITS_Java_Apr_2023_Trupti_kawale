package ComparatorInterface;

import java.util.Comparator;

public class SortMarks implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator object1, StudentComparator object2) {
        if(object1.getMarks() == object2.getMarks())
            return 0;
        else if(object1.getMarks()<object2.getMarks())
            return -1;
        else
            return 1;
    }
}