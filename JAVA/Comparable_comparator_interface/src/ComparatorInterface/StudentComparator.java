package ComparatorInterface;

public class StudentComparator {
    private String name;
    private int marks;

    public StudentComparator(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}