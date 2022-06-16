package oops.inheritance.superDemo;

public class Demo {
    public static void main(String[] args) {
        Child child = new Child();
//        System.out.println(child.a);
        child.display(300);

        InvalidAgeException invalidAgeException = new InvalidAgeException("hello");
    }
}
