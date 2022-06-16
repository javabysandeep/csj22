package oops.inheritance.superDemo;

public class InvalidAgeException extends InvalidAgeExceptionParent {
    String message;

    public InvalidAgeException(String message) {
        super(message);
        this.message = message;
    }
}
