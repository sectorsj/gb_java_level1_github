package homeworks.level2.homework2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}