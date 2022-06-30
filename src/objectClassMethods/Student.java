package objectClassMethods;

import java.util.Objects;

public class Student {
    int roll;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Finalize method will be called by Garbage collector");
    }
}
