// A class with the main method that creates and uses instances of the Device class

public class Main 
{
  public static void main(String[] args) {
    // Create two variables of the enumerated type
    DeviceType device1Type = DeviceType.SAMSUNG_GALAXY;
    DeviceType device2Type = DeviceType.IPHONE;

    // Display the values of the variables to the console
    System.out.println("Device 1 type: " + device1Type);
    System.out.println("Device 2 type: " + device2Type);

    // Create two instances of the Device class
    Device device1 = new Device();
    Device device2 = new Device();

    // Use the mutators to set all instance variables for the two instances
    device1.setName("Samsung Galaxy S21");
    device1.setPrice(800);
    device1.setType(device1Type);

    device2.setName("iPhone 13");
    device2.setPrice(1200);
    device2.setType(device2Type);

    // Use the accessors to display the values of all fields of the two instances
    System.out.println("Device 1 name: " + device1.getName());
    System.out.println("Device 1 price: " + device1.getPrice());
    System.out.println("Device 1 type: " + device1.getType());

  }
}