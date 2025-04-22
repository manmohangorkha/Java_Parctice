package Constructor;

public class ClassP

{
	int roll;     //program to create constructor in ClassP and instantiating it from ClassQ
	String city;
	
	ClassP(String a, int b)
	{
		city = a;
		roll = b;		
	}	
	public void display()
	{
		System.out.println(roll +" " + city);
	}
}