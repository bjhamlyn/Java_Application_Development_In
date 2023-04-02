import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void Method(User u)
    {
        u.Login(null, null);
    }

    public static void SayHelloGeneral(User u){
            System.out.println("let's call the HelloMethod");
            u.HelloMethod();
    }
    public static void main(String[] args) {
    
        Buyer alex = new Buyer("1111-1111", "user", "password");
       
        /* alex.creditCard = "0000-1111-2222";
        alex.username = "alex";
        alex.password ="password";

        User u = new Buyer();
        Method(u);
        Method(alex); */
        
/*         ArrayList<Student> roster = new ArrayList<Student>();
        roster.add(new Student());
        roster.add(new Student());
        roster.add(new Student());
        roster.add(new Student()); */

        Roster CSC205 = new Roster();
        CSC205.add(new Student());
        CSC205.add(new Student());
        CSC205.add(new Student());
        CSC205.add(new Student());
        CSC205.courseInstructor = new Instructor();

        Circle c = new Circle();
        c.radius = 10;
        c.getArea();

        Triangle t = new Triangle();
        //t.Method1("2023");//error
        t.Method1();
        t.Method1(2023);

        User u = new User();
        u.HelloMethod(); //hello from user

        Buyer b = new Buyer();
        b.HelloMethod(); //hello from buyer

        //Buyer b2 = new User();//ERROR
        User ub = new Buyer();
        ub.HelloMethod();

        SayHelloGeneral(new User());
        SayHelloGeneral(new Buyer());
    }
}