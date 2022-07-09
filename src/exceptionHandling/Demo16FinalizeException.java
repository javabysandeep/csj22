package exceptionHandling;

public class Demo16FinalizeException {
    public static void main(String[] args) {
        Student student = new Student();
        student=null;
        System.out.println(10/0);
        System.gc();
    }
   static class Student{
       @Override
       protected void finalize() throws Throwable {
           System.out.println("finalize");
       }
   }
}
