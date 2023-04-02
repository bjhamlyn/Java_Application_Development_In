public class Circle extends Shape {
    double radius;
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
