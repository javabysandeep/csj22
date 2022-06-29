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
}
