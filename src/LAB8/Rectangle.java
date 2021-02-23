package LAB8;

public class Rectangle extends  Object2D {
    //constant

    private static  final double PI =0.5;

    //attribute
    private double width;
    private double lenght;

    //constructor

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public void calArea() {
        //Rectangle area = PI * (w * l)
        double area = PI * width * lenght;
        super.setArea(area);
    }
}
