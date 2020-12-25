package Exception;

public class Main {
    public static int getSize(String text) throws MyException{
        try {
            return text.length();
        } catch (Exception e) {
            throw new MyException("Loi null point");
        }
    }

    public static void main(String[] args) {
        String string = null;
        try {
            System.out.println(getSize(string));
        } catch (MyException e) {
            System.out.println(e.getException());
        }
    }
}
