package stringHandling;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("string builder methods string builder methods");
        System.out.println(sb.indexOf("builder",15));//30
        System.out.println(sb.indexOf("builder"));//7

        String string = "some stirng value";
        StringBuilder stringBuilder = new StringBuilder(string);
        string = stringBuilder.toString();
        string = new String(stringBuilder);
    }
}
