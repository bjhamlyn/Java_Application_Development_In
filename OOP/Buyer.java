import java.net.PasswordAuthentication;

public class Buyer extends User{
    public String creditCard; 

    public void Test()
    {
        creditCard = "test";
        //username = "test";
        //password = "test";
    }

    public void FancyMethod()
    {
        super.Display();
    }
    public void Display()
    {
        super.Display();
        System.out.println("Credit card = " + creditCard);
    }

    public Buyer() {
        System.out.println("default ctor for Buyer was called");
    }

    public Buyer(String creditcard, String username, String password ) {
        super(username,password);//calling non default constructor
        this.creditCard = creditcard;
        System.out.println("nondefault ctor for Buyer was called");
    }

    public void HelloMethod()
    {
        System.out.println("Hello from Buyer");
    }
}
