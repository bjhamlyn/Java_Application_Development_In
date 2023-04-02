enum Colors {YELLOW, GREEN, BLUE, ORANGE, RED, PURPLE};
enum FruitFamily {BANANA, MANGO, AVOCADO, STRAWBERRY, GRAPE, WATERMELLON, BLUEBERRY};

public class Fruit {
    //fields
    Colors color;
    FruitFamily fruitFamily;
    double weightInGrams;
    double price;

    //constructor
    public Fruit() 
    {
        color = Colors.RED;
        fruitFamily = FruitFamily.STRAWBERRY;
        weightInGrams=0;
        price = 0;
    }

    public void display()
    {
        System.out.println("Color: " + color);
        System.out.println("Fruit Family: " + fruitFamily);
        System.out.println("Weight in Grams: " + weightInGrams);
        System.out.println("Price: $" + price);
    }

    public Fruit(Colors color, FruitFamily fruitFamily, double weightInGrams, double price) 
    {
        this.color = color;
        this.fruitFamily = fruitFamily;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }
}


