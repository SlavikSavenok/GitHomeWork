package homeWork_9_2;

public class WrongLoginException extends Throwable {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
