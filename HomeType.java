

public class HomeType2 {

    public static void main(String[] args) {
        //here we create two variables of the enumerated type
        HomeType home1HomeType = HomeType.Apartment;
        HomeType home2HomeType = HomeType.TwoStory;
        
        //display the values of the enumerated type variables
        System.out.println("Home 1 Type: " + home1HomeType);
        System.out.println("Home 2 Type: " + home2HomeType);

        //create two instances of the Homes class
        Homes home1 = new Homes();
        Homes home2 = new Homes();

        //use mutators to set instance variables for both homes
        home1.setStreet("Feather River Drive");
        home1.setHouseNumber(1987);
        home1.setCity("Olympia");
        home1.setZipCode(98503);
        home1.setState("Washington");
        home1.settypeOfHome(HomeType.Apartment); // <-- Use the correct enum value
        home1.setIsRental(false);

        home2.setStreet("Mockingbird Lane");
        home2.setHouseNumber(1313);
        home2.setCity("Lacey");
        home2.setZipCode(98503);
        home2.setState("Washington");
        home2.settypeOfHome(HomeType.TwoStory); // <-- Use the correct enum value
        home2.setIsRental(false);

        //use accessors to display the values of instance variables for both houses
        System.out.println("Home 1: ");
        home1.PrintInfo();
        System.out.println();
        System.out.println("Home 2: ");
        home2.PrintInfo();               
    }
}
