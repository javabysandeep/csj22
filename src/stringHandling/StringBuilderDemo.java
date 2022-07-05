package stringHandling;

public class StringBuilderDemo {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = "literal";//cte
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.append("appedend at last"));
        System.out.println(stringBuilder);

        String str = "literal";
        System.out.println(str.concat("hello"));
        System.out.println(str);
        StringBuilder reverse = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            reverse.append(str.charAt(index));
        }
        System.out.println("Reversed "+reverse);
    }
}
