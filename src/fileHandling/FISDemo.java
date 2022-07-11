package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read();
        while (read != -1) {
            System.out.print((char)read);
            read = fileInputStream.read();
        }
        fileInputStream.close();
    }

}
