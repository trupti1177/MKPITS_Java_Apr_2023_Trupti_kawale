package UseOfComparatorInterface;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentClass> {
    @Override
    public int compare(StudentClass o1, StudentClass o2) {
//        return o1.getName().compareTo(o2.getName()) ;

        if(o1.getName() == o2.getName())
            return 0;
        else if (o1.getName().compareTo(o2.getName())<0) {
            return -1;
        }else
            return 1;
    }
}