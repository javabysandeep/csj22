package collectionFramework;

import java.util.Comparator;

class ProductSortBasedOnPrice implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getProductPrice()-product2.getProductPrice();
    }
}