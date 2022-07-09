package exceptionHandling;


import java.io.*;

public class Demo13CheckedThrows {
    public static void main(String[] args) {
        try {
            writeFile();
            readFile();
        }
//        System.out.println("independent statements");
        catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("rest of the main");
    }

    private static void writeFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        fileOutputStream.write(2);
    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

    }
}
