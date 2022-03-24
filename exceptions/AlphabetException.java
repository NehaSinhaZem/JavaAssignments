package exceptions;

class AlphabetException extends Exception {
    public AlphabetException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}
