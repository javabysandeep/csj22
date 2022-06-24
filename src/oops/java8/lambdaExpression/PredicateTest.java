package oops.java8.lambdaExpression;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate predicate = (number) -> number < 100;
        System.out.println(predicate.test(101));
    }
}
