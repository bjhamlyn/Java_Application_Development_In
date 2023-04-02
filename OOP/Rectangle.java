public class Rectangle extends Shape{
    double length , width;

    @Override
    public double getArea() {
        return length*width;
    }
}
