package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializationDemo {
    public static void main(String[] args) throws IOException {

        // serialization: saving the object into file

        Student student = new Student(1,"Ganesh","ganesh123", "ganeshpwd");
        File file = new File("GaneshData.txt");
        System.out.println(file.createNewFile());

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Student object saved in file");


    }
}
