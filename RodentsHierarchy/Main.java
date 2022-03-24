package RodentsHierarchy;

public class Main
{
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0]= new Mouse();
        rodents[0].weight();
        rodents[0].behaviour();
        rodents[0].habitat();
        rodents[0].communication();
        rodents[1]= new Gerbil();
        rodents[1].weight();
        rodents[1].behaviour();
        rodents[1].habitat();
        rodents[1].communication();
        rodents[2]= new Hamster();
        rodents[2].weight();
        rodents[2].behaviour();
        rodents[2].habitat();
        rodents[2].communication();
    }
}
