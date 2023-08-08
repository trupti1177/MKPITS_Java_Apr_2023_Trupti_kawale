public class AreaOfRectangle extends Shapes {
    private int length;
    private int width;
    @Override
    public void FindArea() {
        int area = length * width;
        System.out.println("Area of rectangle is"+area);

    }

    public int getLength() {
        return length;
    }

    public AreaOfRectangle() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
