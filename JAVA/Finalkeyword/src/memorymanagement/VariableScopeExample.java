package memorymanagement;

public class VariableScopeExample {
    private int i=1;

    public void firstMethod() {
        int i=4,j=5;

        this.i =i+j;
        secondMethod(7);
    }
    public void secondMethod(int i){
        int j=8;
        this.i=i+j;
    }
}
