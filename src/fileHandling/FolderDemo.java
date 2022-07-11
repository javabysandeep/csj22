package fileHandling;

import java.io.File;

public class FolderDemo {
    public static void main(String[] args) {
        File folder = new File("csj23");
        System.out.println(folder.mkdir());
        System.out.println(folder.isDirectory());
        System.out.println(folder.isHidden());
        System.out.println(folder.setWritable(false));
    }
}
