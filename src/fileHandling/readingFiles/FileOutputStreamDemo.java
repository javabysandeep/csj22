package fileHandling.readingFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,false);
        fileOutputStream.write(65);
        System.out.println("Written successfully");
        fileOutputStream.close();
    }
}
