package classComponents.callByValueReference;

public class Demo2 {
    public static void main(String[] args) {
        Product product = new Product(101, "mobile", 10000);
        changeMe(product);
        System.out.println(product);

    }

    private static void changeMe(Product product) {
        product = new Product();
        product.productId = 200;
        product.productName ="Laptop";
        product.productPrice = 200000;
        System.out.println(product);
    }

    void m1(){}

}
