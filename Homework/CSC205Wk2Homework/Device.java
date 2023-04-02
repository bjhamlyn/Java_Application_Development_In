

// A class representing a device
public class Device {
  private String name; // The name of the device
  private int price; // The price of the device
  private DeviceType type; // The type of the device

  // Accessor for the name field
  public String getName() {
    return name;
  }

  // Mutator for the name field
  public void setName(String name) {
    this.name = name;
  }

  // Accessor for the price field
  public int getPrice() {
    return price;
  }

  // Mutator for the price field
  public void setPrice(int price) {
    this.price = price;
  }

  // Accessor for the type field
  public DeviceType getType() {
    return type;
  }

  // Mutator for the type field
  public void setType(DeviceType type) {
    this.type = type;
  }
}
