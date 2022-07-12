package fileHandling.readingFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("writing with the file writer in characters");
        System.out.println("Written successfully");
        fileWriter.close();
    }
}
