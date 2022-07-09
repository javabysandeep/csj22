package exceptionHandling;

public class Demo12Throws {
    public static void main(String[] args) {
     try {
         m1();
     }catch (Exception exception){
         System.out.println("I am the one who called m1 method. its my mistake. So im handling it");
     }
        System.out.println("Rest of the main method");
    }
// unchecked exceptions will be automatically propagated to the caller method.

    private static void m1() {
        m2();
//        System.out.println(10/0);
    }
    private static void m2() {
        System.out.println(10/0);
    }
}
