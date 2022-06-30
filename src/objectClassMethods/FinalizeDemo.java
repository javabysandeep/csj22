package objectClassMethods;

public class FinalizeDemo {
    public static void main(String[] args) throws Throwable {
        Student student = new Student();
        student = null;

        //explicitly call the garbage collector
        System.gc();
    }
}
