package exceptionHandling;

public class InvalidNumberException extends RuntimeException {
    InvalidNumberException(String message) {
        super(message);
    }

    InvalidNumberException() {

    }
}
