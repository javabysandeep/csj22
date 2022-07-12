package fileHandling.readingFiles;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("csj22.txt");
        System.out.println(file.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < Integer.MAX_VALUE / 2; i++) {
            bufferedOutputStream.write(65);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("Time taken " + (endTime.getSecond() - startTime.getSecond()));
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Written successfully");
    }

}
