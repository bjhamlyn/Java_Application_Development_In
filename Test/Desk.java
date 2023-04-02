enum Size {SMALL, MEDIUM, LARGE}

public class Desk {  
    //fields
    Size size;
    String material;
    double cost;
    Colors color;

    public void Display()
    {
        System.out.println("Size = " + size);
        System.out.println("Made of = " + material);
        System.out.println("Price = " + cost);
        System.out.println("Color = " + color);
    }
    
}
