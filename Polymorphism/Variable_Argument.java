package Polymorphism;

public class Variable_Argument {
	
	
	public void m1(int a)
	{
		System.out.println("This is an int method");
	}
	public void m1(float a)
	{
		System.out.println("This is float method");
	}
	public void m1(long a)
	{
		System.out.println("this is long method");
	}
	public static void main(String[] args) {
		Variable_Argument fc = new Variable_Argument();
		fc.m1(20.9f);
	}
}