package Polymorphism;

import java.util.Scanner;

public class Class1 {
	//method overloading
	public void demo1() {
		System.out.println("This is method with blank arguments ");
	}

	public void demo1(int a) {
		System.out.println("This is method with int arguments " + a);
	}

	public void demo1(int a, int b) {
		System.out.println("This method is with two int arguments " +a + ","+b);
	}

	public void demo1(float a) {
		System.out.println("This is method with float arguments " +a);
	}

	public void demo1(int a, float b) {
		System.out.println("This method is with int & float arguments " +a + ","+b);
	}

	public void demo1(float a, float b) {
		System.out.println("This method is with two float arguments " +a + ","+b);
	}	
	public void demo1(String k) {
		System.out.println("This method is with String argument and its value is "+k);
	}
	public static void main(String[] args) {
		Class1 fc = new Class1();
		fc.demo1();
		fc.demo1(5);
		fc.demo1(4.5f);
		fc.demo1(4,5);
		fc.demo1(3,8.9f);
		fc.demo1(2.4f,8.1f);
		fc.demo1('A');
		System.out.println("Enter any String please here");
		Scanner sc = new Scanner(System.in);
		String pb = sc.nextLine();
		fc.demo1(pb);
		
	}
}
	