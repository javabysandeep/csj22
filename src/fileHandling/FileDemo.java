package fileHandling;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/sandeepbhingle/Documents/csj22.txt";
        File file = new File(fileName);
        System.out.println(file.createNewFile());
        System.out.println(file);
        System.out.println("Length of the file "+file.length());
        System.out.println("Can we write to a file "+file.canWrite());
        System.out.println("Can we read from a file "+file.canRead());
        System.out.println("Can we execute "+file.canExecute());
        System.out.println(file.setWritable(false));
        System.out.println("Its Folder ? "+file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.lastModified());
        System.out.println(file.delete());
    }
}
