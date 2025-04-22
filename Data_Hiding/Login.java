package Data_Hiding;

import java.util.Scanner;

public class Login
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter your password");
		Scanner sc = new Scanner(System.in);
		 String m2 =  sc.nextLine();	
		 Bank bn = new Bank();
		 bn.match(m2);
	}
	
	
}