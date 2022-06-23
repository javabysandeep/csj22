package oops.java8;

public class C implements I1, I2 {
    @Override
    public void m1() {
        System.out.println("C m1");
    }

    @Override
    public void m2() {
        System.out.println("C m2");
        I1.super.m2();
        I2.super.m2();
    }
}
