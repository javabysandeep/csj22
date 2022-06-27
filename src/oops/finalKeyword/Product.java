package oops.finalKeyword;

public class Product {
    final int productId ;
    final String productName;
    final int productPrice;
    final static String companyName ="amazon";
   /* static {
        companyName = "amazon";
    }*/

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
