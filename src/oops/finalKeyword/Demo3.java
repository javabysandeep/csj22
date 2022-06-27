package oops.finalKeyword;

public class Demo3 {
    public static void main(String[] args) {
        Parent pc = new Child();
        pc.m1();
    }
}
 class Parent{
    final void m1(){
        System.out.println("parent class method");
    }
}

class Child extends Parent{
    /*@Override
    void m1() {
        System.out.println("Child class method");
    }*/
}
