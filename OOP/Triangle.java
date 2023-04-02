import java.util.ArrayList;

public class Triangle extends Shape{
    double a, b, c;

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public void Method1()
    {

    }

    public void Method1( int x)
    {

    }
}

/* 
class FancyString extends String{

} */

class FancyList extends ArrayList<Triangle>{

}