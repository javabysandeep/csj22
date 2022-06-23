package oops.java8;

// single abstract methods and any no. of default or static methods
//@FunctionalInterface
public interface ProductService {
    void registerProduct();

    default void createProduct(){
        System.out.println("Default method impl for all the subclasses");
    }

}
