package UseOfComparatorInterface;

public class StudentClass{
    private String name;
    private int marks;

    public StudentClass(String name, int marks) {
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
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}