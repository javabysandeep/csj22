package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializationDemo2 {
    public static void main(String[] args) throws IOException {
        // Serialization : save the object into the file

        //This object is present in heap area which is temporary storage
        Student student = new Student(2,"Pooja","pooja123","pass123");

        File file = new File("/Users/sandeepbhingle/Documents/Pooja.txt");
        System.out.println(file.createNewFile());

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        //close connection
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Pooja object saved in the file");
    }
}
