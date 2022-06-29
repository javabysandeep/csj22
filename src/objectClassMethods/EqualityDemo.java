package objectClassMethods;

public class EqualityDemo {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 456;
        System.out.println(num1 == num2);//false
//        System.out.println(num1.equals(num2));//CTE
        Product product1 = new Product(1, "laptop");
        Product product2 = new Product(1, "laptop");
        product1 = product2;
        // we are doing reference check and not the object content check
        System.out.println(product1 == product2);//false
        System.out.println(product1.equals(product2));//false
    }
}
