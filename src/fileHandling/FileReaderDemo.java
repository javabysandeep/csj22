package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileReader fileReader = new FileReader(file);
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char)read);
            read = fileReader.read();
        }
        fileReader.close();
    }

}
