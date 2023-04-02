//create a new FitByte class, which will calculate the targetheart
//rates using age and resting heart rate
public class FitByte 
{
    private int age; // private field to hold the age of the user
    private double restingHeartRate; // private field to hold the user's resting heart rate

    public FitByte(int age, double restingHeartRate) 
    { 
        //ctor method for FitByte class. Sets the age and resting heart rate variables
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public FitByte() 
    { 
        //defines the constructor method for FitByte class
        //sets the default values to the age of 30 and resting heart rate of 70  
        this.age = 30;
        this.restingHeartRate = 70;
    }

    public int getAge()
    {
        //define a method to get the age of the user
        return age;
    }

    public void setage(int age)
    {
        //define a method to set the age
        this.age = age;
    }

    public double getrestingHeartRate()
    {
        //define a method to get the resting heart rate of the user
        return restingHeartRate;
    }

    public void setrestingHeartRate(int restingHeartRate)
    {
        //define a method to set the resting heart rate of the user
        this.restingHeartRate = restingHeartRate;
    }

    public double  targetHeartRate(double percentageOfMaximum)
    {
        //define a method to determien the percentage of max heart rate
        //use formula 206.3(max heart rate) - (0.711 * age)
        //return the target heart rate
        double maxHeartRate = 206.3 - (0.711 * age);
        double targetHeartRate = (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
        return targetHeartRate;
    }
}
