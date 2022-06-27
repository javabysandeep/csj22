package oops.finalKeyword;

public class StudentStateDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Ganesh");
        System.out.println(student);
        System.out.println("State change ");
        //1. way through variables directly
        // student.rollNumber = 2;
        //student.name ="Ganesha";

        //2. way : by using setters
        //student.setRollNumber(2);
        //student.setName("Ganesha");

        //way 3: through child classes
        StudentImpl student1 = new StudentImpl();
        //student1.name = "xyz";
       // student1.rollNumber = 100;
        System.out.println(student);

    }
}
