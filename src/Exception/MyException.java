package Exception;

public class MyException extends Exception{
    private String exception;
    public MyException(String exception) {
        super();
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
