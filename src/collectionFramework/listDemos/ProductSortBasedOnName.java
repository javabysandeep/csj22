package collectionFramework.listDemos;

import java.util.Comparator;

class ProductSortBasedOnName implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getProductName().compareTo(product2.getProductName());
    }
}