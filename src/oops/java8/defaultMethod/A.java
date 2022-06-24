package oops.java8.defaultMethod;

public class A implements I1,I2{
    @Override
    public void m1() {
        System.out.println("A m1");
    }

    @Override
    public void m2() {
        System.out.println("A m2");
    }

    @Override
    public void m3() {
        I2.super.m3();
    }
}
