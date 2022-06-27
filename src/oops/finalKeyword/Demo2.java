package oops.finalKeyword;

public class Demo2 {
    public static void main(String[] args) {
        //instance variables as final
        Product product1 = new Product(1,"abc",100);
//        product1.productId = 10;
        Product product2 = new Product(2, "xyz",200);
        System.out.println(product1);
        System.out.println(product2);

        final int number;
        number = 100;
//        number = 200;
        System.out.println(number);
    }
}
