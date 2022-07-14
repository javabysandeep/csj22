package fileHandling;

import java.io.*;

public class Student implements Externalizable {
    int studentId;
    String studentName;
    String username;
    transient String password;

    public Student(int studentId, String studentName, String username, String password) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.username = username;
        this.password = password;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
