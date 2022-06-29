package objectClassMethods;

public class EqualityDemo3 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "abc");
        Product product2 = new Product(1, "abc");
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());
    }
}
