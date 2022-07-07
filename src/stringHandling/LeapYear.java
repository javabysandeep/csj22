package stringHandling;

public class LeapYear {
    public static void main(String[] args) {
        int[] years = {1904, 1908, 1912, 1916, 1920,
                1924, 1928, 1932, 1936, 1940,
                1944, 1948, 1952, 1956, 1960,
                1964, 1968, 1972, 1976, 1980,
                1984, 1988, 1992, 1996, 2000,2022};

        for (int year : years) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Leap year "+year);
            }
        }
        String[] array = {"laptop", "mobile", "tab","charger", "pen"};
        for (String str:array) {
            if(str.length() < 4){
                System.out.println(str);
            }
        }
        String cyber ="cyber success";
        System.out.println(cyber.charAt(0));

        char[] destination = new char[6];
        cyber.getChars(6,11,destination,1);
        for (char ch:destination) {
            System.out.print(ch);
        }







    }
}
