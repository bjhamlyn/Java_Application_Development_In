public class Homes 
{
    // Define the enumerated type for home types
enum HomeType {TwoStory, SingleStory, Apartment, Condo, Trailer, CardboardBox};


 
    //characteristics of  houses such as the street name, house number, City, Zipcode,
    //state, type of house, and if it is a rental or not
    private String Street;
    private int HouseNumber;
    private String City;
    private int ZipCode;
    private String State;
    private HomeType typeOfHome;
    private boolean IsRental;

    public void PrintInfo() //defined the method - instance method
    {
        //print each attribute about the home
        System.out.println("House Number: " + HouseNumber);
        System.out.println("Street: " + Street);
        System.out.println("City: " + City);
        System.out.println("State: " + State);
        System.out.println("Zip Code:" + ZipCode);
        System.out.println("Home Type: " + typeOfHome);
        System.out.println("Is Rental: " + IsRental);
    }
    public String getStreet()//gives read access to Street
    {
        return Street;
    }

    public void setStreet(String Street){ //gives write access to Street
        this.Street = Street;
    }

    public int getHouseNumber()//gives read access to HouseNumber
    {
        return HouseNumber;
    }

    public void setHouseNumber(int HouseNumber)//gives write access to HouseNumber
    {
        this.HouseNumber = HouseNumber;
    }

    public String getCity()//gives read access to City
    {
        return City;
    }

    public void setCity(String City)//gives write access to City
    {
        this.City = City;    
    }
    public int getZipCode()//gives read access to ZipCode
    {
        return ZipCode;
    }
    public void setZipCode(int ZipCode)//gives write access to ZipCode
    {
        this.ZipCode = ZipCode;
    }
    public String getState()//gives read access to State
    {
        return State;
    }
    public void setState(String State)//gives write access to State
    {
        this.State = State;
    }
    public HomeType gettypeOfHome()//gives read access HouseType
    {
        return typeOfHome;
    }
    public void settypeOfHome(HomeType typeOfHome)//gives write access to HouseType
    {
        this.typeOfHome = typeOfHome;
    }
    public boolean getIsRental()//gives read access to IsRental
    {
        return IsRental;
    }
    public void setIsRental(boolean IsRental)//gives write access to IsRental
    {
        this.IsRental = IsRental;
    }
} 

