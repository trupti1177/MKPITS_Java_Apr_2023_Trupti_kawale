package ComparatorInterface;

import java.util.Comparator;

public class SortName implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator object1, StudentComparator object2) {
        return object1.getName().compareTo(object2.getName());
    }
}