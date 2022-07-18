package collectionFramework;

import java.util.Comparator;

class ProductSortBasedOnId implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getProductId()-product2.getProductId();
    }
}