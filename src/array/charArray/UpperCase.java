package array.charArray;


public class UpperCase {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd' };
        //System.out.println("Digits " + containsDigit(chars));
        //upperCase(chars);
        reverseCharsArray(chars);
        printChars(chars);

    }

    private static void printChars(char[] chars) {
        System.out.println();
        for (int index = 0; index < chars.length; index++) {
            System.out.print(chars[index] + " ");
        }
    }

    private static void reverseCharsArray(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
    }

    private static void upperCase(char[] chars) {
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] >= 'a' && chars[index] <= 'z') {
                chars[index] = (char) (chars[index] - 32);
            }
        }
    }

    private static boolean containsDigit(char[] chars) {
        for (int index = 0; index < chars.length; index++) {
            /*switch (chars[index]){
                case '0': return true;
                case '1': return true;
                case '2': return true;
                case '3': return true;
                case '4': return true;
                case '5': return true;
                case '6': return true;
                case '7': return true;
                case '8': return true;
                case '9': return true;
            }*/
            if (chars[index] >= '0' && chars[index] <= '9') {
                return true;
            }
        }
        return false;
    }
}
