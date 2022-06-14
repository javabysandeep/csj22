package oops.inheritance;

public class ProductRegistration extends ProductService {
    int productId = 100;

    void registerProduct() {
        System.out.println("registering the products with Amazon");
    }
}
