package oops;

public class Product {
    private int productId;
    private String productName;

    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        }
    }

    public int getProductId() {
        return this.productId;
    }

}
