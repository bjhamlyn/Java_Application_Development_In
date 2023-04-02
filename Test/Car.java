enum Make {FORD, HONDA, KIA, JEEP, VW, FERRARI};

public class Car {
    Make make;
    double mileage;
    int numberOfDoors;
    boolean isAutomatic;

    public void Display()
    {
        System.out.println("Make: " + make);
        System.out.println("Mileage: " +  mileage);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is automatic: " + isAutomatic);


    }

    @Override
    public String toString() 
    {
        return "\nMake: " + make 
        + "\nMiles: " + mileage 
        + "\nNumber of doors: " + numberOfDoors
        + "\nIs automatic: " + isAutomatic
        + "\nVIN: " + VIN;
    }

    public void Drive(double NoMiles)
    {
        mileage += NoMiles;
    }
    public Car() {
        count++;
        VIN = count;
    }
}
