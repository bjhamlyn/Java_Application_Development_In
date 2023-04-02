import java.util.ArrayList;

public class Roster extends ArrayList<Student>{
    //ArrayList<Student> students = new ArrayList<Student>();
    Instructor courseInstructor;
}


class Student{
    String studentName;
    boolean isVeteran;
}

class Instructor{
    String name;
}