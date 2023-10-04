import Student.FinalizeMethodCalling;

public class Main {
    public static void main(String[] args) {
        FinalizeMethodCalling finalizeMethodCalling=new FinalizeMethodCalling(25,"Abhi");
        finalizeMethodCalling.getMarks();
        finalizeMethodCalling.getName();
        finalizeMethodCalling  =null;
        System.gc();
    }
}