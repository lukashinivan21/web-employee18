package pro.sky.java.lesson18.webemployee18.exceptions;

public class EmployeeIsAlreadyInsideMapException extends RuntimeException {

    public EmployeeIsAlreadyInsideMapException() {

    }

    public EmployeeIsAlreadyInsideMapException(String message) {
        super(message);
    }

    public EmployeeIsAlreadyInsideMapException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
