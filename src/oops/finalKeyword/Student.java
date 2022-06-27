package oops.finalKeyword;

public final class Student {
    int rollNumber;
     String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNumber() {
        return rollNumber;
    }

    /*public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }*/

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/
}
class StudentImpl /*extends Student*/{

}