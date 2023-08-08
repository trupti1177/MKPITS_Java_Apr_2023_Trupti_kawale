package shape;

public class AreaOFCircle implements Shapes {
    int radius ;

    public AreaOFCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public void FindArea() {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is :"+area);
    }
}
