package pro.sky.java.lesson18.webemployee18.exceptions;

public class EmployeeIsNotFoundException extends RuntimeException {

    public EmployeeIsNotFoundException() {

    }

    public EmployeeIsNotFoundException(String message) {
        super(message);
    }

    public EmployeeIsNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
