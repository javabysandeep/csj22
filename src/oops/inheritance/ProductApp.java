package oops.inheritance;

public class ProductApp {
    public static void main(String[] args) {
        ProductService productService  = new ProductRegistration();
        System.out.println(productService.productId);
        productService.registerProduct();
    }
}
