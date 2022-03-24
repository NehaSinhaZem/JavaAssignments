package neha.assignment.main;

import neha.assignment.data.Data;
import neha.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        /*
            Only public methods can be accessed outside the package.
            Since printData() and printLocalData() are default methods of Data class in another package, they can't be accessed here

        data.printData();
        data.printLocalData();
        */
        Singleton singleton = new Singleton();
        /*
            Only public methods can be accessed outside the package.
            Since print() is default method of Singleton class in another package, it can't be accessed here

        singleton.print();
         */
    }
}
