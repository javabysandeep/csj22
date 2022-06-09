package classComponents.nestedClasses;

public class Outer {
    int out = 100;
    static int outerStaticVar = 10;

    // non-static nested class --> Inner class
    class Inner {
        int in = 200;
        // static members are not allowed in non-static nested class
        /*static  int var = 300;
        static  void m1(){}
        static {}*/
    }
    static class StaticNested{
        static  int staticNestedVar = 1000;
        int nonStaticMember = 290;
    }

}
