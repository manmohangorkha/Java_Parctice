package Constructor;

class ClassM
{
	int book;   // program to diffenetiate bw constructor & member function
	String rate;
	
	ClassM()
	{
		System.out.println("I am constructor's output\n");	
	}
	void ClassM(String a, int b)
	{
		System.out.println("I am a method output when you called me in line 21");
	}
	
	public static void main(String[] args) {
		ClassM fc = new ClassM();// constructor run as we create the object
		
		
		fc.ClassM("Haryana gk", 23);// need to create method manually
		
	}
	
}