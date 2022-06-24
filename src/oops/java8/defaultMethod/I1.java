package oops.java8.defaultMethod;

public interface I1 {
    void m1();
    void m2();
    default void m3(){
        System.out.println("I1 Default method implementation");
    }
}
