package collectionFramework;

public class ElipsisOperator {
    public static void main(String[] args) {
        System.out.println(add(2, 3,7));
    }

    static int add(int... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        return sum;
    }
}
