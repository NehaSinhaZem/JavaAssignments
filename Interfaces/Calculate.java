package Interfaces;

public class Calculate
{
	public static void main(String[] args) {
		Calculation ob= new Calculation(18,9,"Neha","Sinha");
		ob.m1(ob);
		ob.display();
		ob.m2(ob);
		ob.display();
		ob.m3(ob);
		ob.m4(ob);
		ob.display();
	}
}
