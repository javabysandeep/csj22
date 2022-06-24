package oops.java8.lambdaExpression;

public class Demo {
    public static void main(String[] args) {
        //way 1
        AddOperation addOperation = new AddOperationImpl();
        System.out.println(addOperation.add(10,20));

        //way 2
        AddOperation add = new AddOperation() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        System.out.println(add.add(50,50));

        //way 3
        AddOperation lambda = (num1, num2) -> num1 + num2;
        System.out.println(lambda.add(50,100));
    }

}
