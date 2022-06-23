package oops.java8;

public interface I2 {
    void m1();
    default void m2(){
        System.out.println("I2 default method");
    }
}
