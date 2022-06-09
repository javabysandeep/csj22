package classComponents.nestedClasses;

public class App {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Outer instance variables " + outer.out);
        System.out.println(Outer.outerStaticVar);

        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner class variables "+inner.in);


        System.out.println(Outer.StaticNested.staticNestedVar);

        Outer.StaticNested staticNested = new Outer.StaticNested();
        System.out.println(staticNested.nonStaticMember);
    }
}
