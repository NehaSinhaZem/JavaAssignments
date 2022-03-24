package CyclesInheritance;

public class Inheritance{
    public static void main(String[] args){
    Unicycle uni = new Unicycle();
    Bicycle bi = new Bicycle();
    Tricycle tri= new Tricycle();
    Cycle[] cycles = new Cycle[]{uni,bi,tri};
    for(Cycle c:cycles)
        c.balance();
    Unicycle unicycle = (Unicycle)cycles[0];
    Bicycle bicycle= (Bicycle)cycles[1];
    Tricycle tricycle =(Tricycle)cycles[2];
    unicycle.balance();
    bicycle.balance();
    tricycle.balance();
    }
}