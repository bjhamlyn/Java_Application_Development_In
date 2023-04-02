
public class Athlete 
{
    private String name;//private field to hold the athlete's name
    private int age;//private field to hold the athlete's age

    public Athlete(String name, int age) 
    {
        //ctor (non-default) for the athlete's name and age
        this.name = name;
        this.age = age;
    }

    public Athlete()
    {
        //ctor (default) that sets the default name to "John Doe" and age to 41
        this.name = "John Doe";
        this.age = 41;
    }

    public String getName()
    {
        //getter method to ge the name
        return name;
    }

    public void setName(String name)
    {
        //setter method to set the name
        this.name = name;
    }

    public int getAge()
    {
        //geter method to get the age
        return age;
    }

    public void setAge(int age)
    {
        //setter method to set the age
        this.age = age;
    }

    public void printDetails()
    {
        //method to display the athlete's name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean isAdult()
    {
        //check if the athlete is over 18
        return age >= 18;
    }

}
