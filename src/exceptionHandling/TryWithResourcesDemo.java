package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws IOException {

        try (
                FileInputStream fis = new FileInputStream("file");) {

        } catch (Exception ex) {
        }
    }
}
