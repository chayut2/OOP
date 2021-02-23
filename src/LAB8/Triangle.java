package LAB8;

public class Triangle extends Object2D {
    //attribute
    private double base;
    private double height;

    //constructor

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calArea() {
        double area = base * height * 0.5;
        super.setArea(area);
    }
    //getter and setter
}
