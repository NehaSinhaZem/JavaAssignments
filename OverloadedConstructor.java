public class OverloadedConstructor{
    OverloadedConstructor(){
        System.out.println("Inside default constructor");
        new OverloadedConstructor(3);
    }
    OverloadedConstructor(int val){
        System.out.println("Inside parametrized constructor having val "+val);
    }
    public static void main(String[] args) {
     		new OverloadedConstructor();   
    }
}