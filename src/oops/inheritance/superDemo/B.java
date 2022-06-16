package oops.inheritance.superDemo;

public class B extends A {
    int b;
    B() {
        //super();
        this(200);
        System.out.println("B");
    }

    public B(int b) {
        System.out.println("Param B");
        this.b = b;
    }
}
