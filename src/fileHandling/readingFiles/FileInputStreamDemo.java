package fileHandling.readingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read();
        while (read != -1){
            System.out.print((char) read);
            read =fileInputStream.read();
        }

        //close the fis
        fileInputStream.close();
    }
}
