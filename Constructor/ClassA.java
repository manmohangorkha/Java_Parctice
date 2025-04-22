package Constructor;
public class ClassA

{
	String city;
	int temp;
	
	public ClassA(String a, int b)
	{
		city = a;
		temp = b;
	}
	
	public static void main(String[] args) {
		
		ClassA camp1 = new ClassA("Vadodara", 45);
		System.out.println(camp1.city + " " + camp1.temp);
		
		
		ClassA camp2= new ClassA("Delhi",30);
		System.out.println(camp2.city+ " " + camp2.temp);		
		
	}
	
	
	
}