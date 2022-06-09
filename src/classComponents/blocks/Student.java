package classComponents.blocks;

public class Student {
    static int counter = 0;
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    //instance block
    {
        // we write code to maintain the object count.
        // Auditing, logging,
        // non-initialization activity
        System.out.println("instance block");
        counter++;
    }

    //static block
    static {

        // connection to the DB.
        // connection to the server.
        System.out.println("static block");
    }
    Student(){
        System.out.println("zero param con");
    }

    public static void main(String[] args) {
        {
            Student student1 = new Student(1,"abc");
            Student student2 = new Student(2,"xyz");
            Student student3 = new Student();
            Student student4 = new Student();
            Student student5 = new Student();
            Student student6 = new Student();
            System.out.println("Total objects created "+ Student.counter);
            System.out.println("main method block");
        }
    }
}
