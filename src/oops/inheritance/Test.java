package oops.inheritance;

public class Test {
    public static void main(String[] args) {
        //case 1
        A a = new A();
        System.out.println(a.a);//100
        a.m1();//A m1

        //case 2
        B b = new B();
        System.out.println(b.a);//100 ---> 200
        b.m1();//A class m1 ---> B class m1
        b.m2();
        b.m3();

        //case 3
        A ab = new B();// Child IS-A Parent
        System.out.println(ab.a); //100 --->200
        ab.m1();//A class m1 ---> B class m1
        //ab.m2(); //CTE
        //ab.m3(); //CTE

        //case 4
//        B ba = new A();
    }
}
