package fileHandling.readingFiles;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);

        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < Integer.MAX_VALUE / 2; i++) {
            fileOutputStream.write(65);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("Time taken " + (startTime.getSecond() - endTime.getSecond()));
        fileOutputStream.close();
        System.out.println("Written successfully");
    }

}
