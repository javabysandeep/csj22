package oops.finalKeyword;


public class Demo1 {
    public static void main(String[] args) {
        //final - variables, methods, class
        final int number = 200;
//        number = 300; //CTE
        final Product product = new Product(1,"abc",200);
        System.out.println(product.productId+"\t"+ product.productPrice+"\t"+product.productName);

        System.out.println("Chaging the object content");
        /*product.productId=2;
        product.productName= "xyz";
        product.productPrice=200;*/
        System.out.println(product.productId+"\t"+ product.productPrice+"\t"+product.productName);


//        Product product1 = new Product(productId);
//        product = product1; //CTE
    }
}
