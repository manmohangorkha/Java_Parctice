package Access_Modifiers;

public class Bclass {
public static void main(String[] args) {
	Aclass bc= new Aclass();
	bc.pbm();
	System.out.println("The is public varible called from Class A "+ bc.pbv);
	bc.dfm();
	System.out.println("The is default varible called from Class A "+ bc.dfv);
	bc.prom();
	System.out.println("The is protected varible called from Class A "+ bc.prov);
	
} 
}

