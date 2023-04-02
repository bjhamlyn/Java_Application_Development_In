
public class Program {

    public static void main(String[] args) //main method is the entry point into the program
    {
        Athlete athlete = new Athlete();
        athlete.setName("John Doe");
        athlete.setAge(41);
        //create a new instance of FitByte (fb) class
        FitByte fb = new FitByte(30, 70);
        double targetHeartRate = fb.targetHeartRate(0.75);

        athlete.printDetails();
        System.out.println("Target heart rate is: " + targetHeartRate);
    }
}