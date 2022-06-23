package oops.anonymous;

import oops.java8.ProductService;

public class Demo1 {
    public static void main(String[] args) {
//        ProductService productService = new Child();
        ProductService productService = new ProductService() {
            @Override
            public void registerProduct() {
                System.out.println("Anonymous class register");
            }

            @Override
            public void createProduct() {
                System.out.println("anonymous class create");
            }
        };
        ProductService lambda = ()-> System.out.println("Register product");
        lambda.registerProduct();

        productService.registerProduct();
        productService.createProduct();
    }
}
class Child implements ProductService{
    @Override
    public void registerProduct() {
        System.out.println("Child register");
    }

    @Override
    public void createProduct() {
        System.out.println("child create");
    }
}

