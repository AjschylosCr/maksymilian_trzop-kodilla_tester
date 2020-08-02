package interfaces;

public class Square implements Shape {
    private double width;

    public Square(double width){
        this.width = width;
    }



    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}