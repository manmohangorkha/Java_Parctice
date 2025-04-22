package Constructor;


public class ClassB    // constructor program with the same argument as instance variables
{
	int temp;
	String city;

	public ClassB(String city, int temp)
	{		
		this.temp = temp;
		this.city = city;	
		System.out.println(city);
		System.out.println(temp);
	}	
	public static void main(String[] args) {
	
		ClassB fc1 = new ClassB("Noida", 33);
		System.out.println(fc1.temp +" instance varibales "+fc1.city);
		
		ClassB fc2= new ClassB("Ganga Nagar", 22);
		System.out.println(fc2.city+" instance varibales "+fc2.temp);
		
				
	}
	
	
}