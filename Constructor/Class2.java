package Constructor;
public class Class2

{
  int a;
  char b;   // Creating program to check default consturtor output, here no arugments are given
  float c;
  double d;
  
  public Class2()
  {
	  System.out.println("I am constuctor");	  
  }
  
  public static void main(String[] args) {
	
	  Class2 fc = new Class2();
	  System.out.println(fc.a);
	  System.out.println(fc.b);
	  System.out.println(fc.c);
	  System.out.println(fc.d);
	  Class2 fc1 = new Class2();
	  Class2 fc2 = new Class2();
}
	
	
	
}