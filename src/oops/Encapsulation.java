package oops;

public class Encapsulation {
    public static void main(String[] args) {
        Product product = new Product();
        //product.productId = -101;
        product.setProductId(101);
       // System.out.println(product.getProductId());

        Student student = new Student();
        //student.rollNumber = -992245668;
        //student.age = -20;
        student.setRollNumber(101);
        student.setAge(20);
        student.setName("Bac");

        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
