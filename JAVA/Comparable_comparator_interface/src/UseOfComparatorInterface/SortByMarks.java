package UseOfComparatorInterface;

import java.util.Comparator;

public class SortByMarks implements Comparator<StudentClass> {


    @Override
    public int compare(StudentClass o1, StudentClass o2) {
        if(o1.getMarks()==o2.getMarks())
            return 0;
        else if (o1.getMarks()<o2.getMarks()) {
            return -1;
        }
        else
            return 1;
    }
}