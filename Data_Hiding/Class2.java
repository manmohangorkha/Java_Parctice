package Data_Hiding;

import java.util.Scanner;

class Class2 extends Class1
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter the username");
		Scanner sc1 = new Scanner(System.in);
		String uname =	sc1.nextLine();
		System.out.println("Enter the password");
		Scanner sc2 = new Scanner(System.in);
		String pass = sc2.nextLine();
		Class2 cs = new Class2();
		cs.details(uname, pass);
		
	}	
}