package neha.assignment.data;

public class Data {
    int intValue;
    char charValue;
    void printData(){
        System.out.println(intValue);
        System.out.println(charValue);
    }
    void printLocalData(){
        int intVal;
        char charVal;
        /*
            These local variables need to be initialized explicitly. Java doesn't initialize local variable itself.
        System.out.println(intVal);
        System.out.println(charVal);
         */
    }
}
