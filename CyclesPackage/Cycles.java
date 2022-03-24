package CyclesPackage;

public class Cycles{
    public static void main(String[] args){
        Cycle uni= new Unicycle();
        uni.wheels();
        uni.balance();
        Cycle bi= new Bicycle();
        bi.wheels();
        bi.balance();
        Cycle tri =new Tricycle();
        tri.wheels();
        tri.balance();
    }
}
