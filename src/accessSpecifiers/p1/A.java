package accessSpecifiers.p1;

import accessSpecifiers.p2.B;

public class A {
    public static void main(String[] args) {
        B b = new B();
       // System.out.println(b.a);
        //System.out.println(b.b);
        System.out.println(b.c);
        //System.out.println(b.d);
    }
}
