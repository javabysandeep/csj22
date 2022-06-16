package oops.inheritance.superDemo;

public class Child extends Parent {
    int a = 200;

    void m1() {
        System.out.println("Child class m1 method");
    }

    void display(int a) {
        System.out.println(a);//300
        System.out.println(this.a);//200
        System.out.println(super.a);//100

        System.out.println("Calling methods");
        m1();//child
        this.m1();//child
        super.m1();//parent
    }
}
