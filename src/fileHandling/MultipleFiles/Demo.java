package fileHandling.MultipleFiles;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        writeToFile("A.txt", 'A');
        writeToFile("B.txt", 'B');
        writeToFile("C.txt", 'C');
        writeToFile("D.txt", 'D');
        writeToFile("E.txt", 'E');
        writeToFile("F.txt", 'F');
        writeToFile("G.txt", 'G');
        writeToFile("H.txt", 'H');
        writeToFile("I.txt", 'I');
        writeToFile("J.txt", 'J');
    }

    private static void writeToFile(String fileName, char ch) throws IOException {
        File file = new File(fileName);
        System.out.println("New file created " + file.createNewFile());

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        for (int i = 1; i < Integer.MAX_VALUE/2; i++) {
            bufferedOutputStream.write(ch);
        }
        bufferedOutputStream.close();
        fileOutputStream.close();

        System.out.println("Write successfully");

    }
}
