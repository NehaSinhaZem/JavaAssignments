package exceptions;

class NumberException extends Exception {
    public NumberException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}
