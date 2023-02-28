package Task13;

public class TestException {
    public static void callException(String str) throws SimpleException {
        throw new SimpleException(str);
    }

    public static void main(String[] args) throws SimpleException {
        callException("call");
    }
}


