package stringHandling;

public class StringMethods {
    public static void main(String[] args) {
        String greeting = "Good morning";
        System.out.println("Length of the string. No. of chars in the string " + greeting.length());
        greeting = greeting.concat(" students");
        System.out.println(greeting);

        String star = "star ";
        String starPlus = star + " plus";
        star = starPlus;
        System.out.println(star);

        //uppercase
        String lowercase = "lowercase string";
        lowercase = lowercase.toUpperCase();
        System.out.println(lowercase);

        //replace
        String replace = "kab khatam hoga core java sir?";
        replace = replace.replace('a','@');
        System.out.println(replace);

        String words = "          Core java        ";
        words = words.replace("java", "advance java");
        System.out.println(words);
        System.out.println(words.trim());

        // string equality
        String productFeature = "Coming soon...";
        String productFeature1 = "Coming soon...";
        System.out.println(productFeature.equals(productFeature1));

        String firstName = "Ganesh";
        String firstNameGanesh = "ganesh";
        System.out.println(firstName.equalsIgnoreCase(firstNameGanesh));

        System.out.println(firstName.startsWith("Ga"));
        System.out.println(firstName.endsWith("sh"));

        char[] chars = firstName.toCharArray();

        for (int index = 0; index < firstNameGanesh.length(); index++) {
            System.out.println(firstNameGanesh.charAt(index));
        }


    }
}
