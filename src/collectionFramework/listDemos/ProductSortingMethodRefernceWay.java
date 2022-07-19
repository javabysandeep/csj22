package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductSortingMethodRefernceWay {
    public static void main(String[] args) {
        Product product1 = new Product(101,"mobile",10000);
        Product product2 = new Product(1,"laptop",5000);
        Product product3 = new Product(202,"charger",783);
        Product product4 = new Product(83,"projector",17000);
        Product product5  = new Product(34,"tablet",63000);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        productList.forEach(System.out::println);
        System.out.println("After sorting based on price");

        Collections.sort(productList, Comparator.comparing(Product::getProductName));
        productList.forEach(System.out::println);
    }
}