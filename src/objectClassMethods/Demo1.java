package objectClassMethods;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.hashCode());
        System.out.println(Integer.toHexString(student.hashCode()));
        System.out.println(student.getClass().getName());
        System.out.println(student.getClass().getName()+"@"+Integer.toHexString(student.hashCode()));
        System.out.println(student);
    }
}
