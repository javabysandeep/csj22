package oops.java8.defaultMethod;

public interface I2 {
    void m1();
    void m2();
    default void m3(){
        System.out.println("I2 Default method implementation");
    }
}
