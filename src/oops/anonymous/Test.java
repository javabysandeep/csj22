package oops.anonymous;

public class Test {
    public static void main(String[] args) {
        //way 1
        I1 i1 = new I1Impl();
        i1.m1();

        // way 2
        I1 anon = new I1() {
            // anonymous class body

            @Override
            public void m1() {
                System.out.println("Overridden method");
            }
        };
        anon.m1();

    }
}
