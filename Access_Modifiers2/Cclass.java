package Access_Modifiers2;

import Access_Modifiers.Aclass;

public class Cclass extends Aclass{
	public static void main(String[] args) {

		Cclass cc = new Cclass();
		cc.pbm();
		System.out.println("The is public varible called from Class A " + cc.pbv);
		
		Cclass ccc= new Cclass();
		ccc.prom();
		System.out.println("The is protected varible called from Class A " + ccc.prov);
		
		
	}
}
