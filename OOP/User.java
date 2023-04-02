public class User {
    private String username;
    private String password;

    public boolean Login(String username, String password)
    {
        return this.username.equals(username)
         && this.password.equals(password);
    }

    public User() {
        System.out.println("default constructor for User was called");
    }

    public void Display()
    {
        System.out.println("Username = "+ username);
        System.out.println("Password = "+ password);
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("non default constructor for User was called");
    }

    public void HelloMethod()
    {
        System.out.println("Hello from User");
    }
}
