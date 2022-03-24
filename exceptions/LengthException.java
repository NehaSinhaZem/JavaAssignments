package exceptions;

class LengthException extends Exception {
    public LengthException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}
