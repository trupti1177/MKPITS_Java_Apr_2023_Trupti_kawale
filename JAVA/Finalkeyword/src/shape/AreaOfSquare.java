package shape;

public class AreaOfSquare implements Shapes{

    int side;


    @Override
    public void FindArea() {
        int area = side * side;
        System.out.println("Area of square is"+area);

    }
    public int getLength() {
        return side;
    }

    public AreaOfSquare() {
    }

    public void setLength(int length) {
        this.side = side;
    }

    public int getWidth() {
        return side;
    }

    public void setWidth(int width) {
        this.side = side;
    }
}

