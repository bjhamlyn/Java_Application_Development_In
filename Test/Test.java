
public class Test {

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.color = Colors.YELLOW;
        f1.fruitFamily = FruitFamily.BANANA;
        f1.weightInGrams = 60.5;
        f1.price = 2.99;
        f1.display();


        Fruit f3 = new Fruit(Colors.BLUE, FruitFamily.BLUEBERRY, 15, 0.15);
        f3.display();

        Car ferrari = new Car();
        ferrari.make = Make.FERRARI;
        ferrari.Drive(5);
        ferrari.Drive(400);
        ferrari.Display();

        System.out.println(ferrari);


        Car ford = new Car();





    }
}