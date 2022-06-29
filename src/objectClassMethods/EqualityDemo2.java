package objectClassMethods;

public class EqualityDemo2 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "laptop");
        Product product2 = new Product(1, "laptop");
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

    }
}
