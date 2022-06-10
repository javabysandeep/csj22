package oops;

public class Student {
    private int rollNumber;
    private String name;
    private int age;

    public void setRollNumber(int rollNumber){
        if(rollNumber > 0){
            this.rollNumber = rollNumber;
        }
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
