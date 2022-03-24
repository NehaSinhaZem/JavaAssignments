package neha.assignment.singleton;

public class Singleton {
    String str;
    static Singleton initilizeStr(String s){
        /*
            static method cannot access a non-static variable, thus str can't be accessed here.
        str=s;
         */
        return new Singleton();
    }
    void print(){
        System.out.println(str);
    }
}
