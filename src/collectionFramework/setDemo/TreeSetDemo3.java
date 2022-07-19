package collectionFramework.setDemo;

import collectionFramework.listDemos.Product;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        // unique, homogeneous, sorted, no null
        //Way 1 : Traditional way
//        Set<Product> set = new TreeSet(new ProductComparator());
        //Way 2: Anonymous class way
        /*Set<Product> set = new TreeSet(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProductId()-p2.getProductId();
            }
        });*/
        //Way 3 : Lambda
//        Set<Product> set = new TreeSet<Product>((p1,p2)->p1.getProductId()-p2.getProductId());
        //way 4: Static method from Comparator, method reference
        Set<Product> set = new TreeSet<Product>(Comparator.comparingInt(Product::getProductId));
        Product product1 = new Product(1,"mobile",500);
        Product product2 = new Product(2,"mobile",400);
        Product product3 = new Product(3,"mobile",600);

        set.add(product1);
        set.add(product2);
        set.add(product3);
        set.add(product3);

        set.forEach(System.out::println);
        //output: Data is not of same type. Exception.
    }
}
class ProductComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductPrice() - o2.getProductPrice();
    }
}