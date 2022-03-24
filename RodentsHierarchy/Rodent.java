package RodentsHierarchy;

abstract class Rodent{
    void display(){
        System.out.println("I'm a Rodent");
    }
    void weight(){
        System.out.println("Weigh about 100g");
    }
    void habitat(){
        System.out.println("Terrestrial habitat");
    }
    abstract void behaviour();
    void communication(){
        System.out.println("Olfactory, Auditory, Visual, Tactlile");
    }
}

