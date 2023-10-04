package Student;

public class FinalizeMethodCalling {
    private int marks;
    private String name;

    public FinalizeMethodCalling(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public  void finalize(){
        System.out.println("This is finalized method.");
    }
}