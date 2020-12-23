package hw2;

public class MyArrayDataException extends NumberFormatException{
    private int i;
    private int j;

    public MyArrayDataException(String s) {
        super(s);
    }

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }
}
