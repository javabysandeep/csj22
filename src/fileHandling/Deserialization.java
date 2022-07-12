package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("/Users/sandeepbhingle/Documents/Pooja.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student pooja = (Student) objectInputStream.readObject();
        System.out.println(pooja);

        objectInputStream.close();
        fileInputStream.close();
    }
}
