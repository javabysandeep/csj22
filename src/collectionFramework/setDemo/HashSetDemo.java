package collectionFramework.setDemo;


import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Product> set = new HashSet();
        
        Product product1 = new Product(1,"mobile",500);
        Product product2 = new Product(1,"mobile",500);
        Product product3 = new Product(1,"mobile",500);

        set.add(product1);
        set.add(product2);
        set.add(product3);

        set.forEach(System.out::println);
    }
}
