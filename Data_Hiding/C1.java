package Data_Hiding;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the username");
		Scanner sc = new Scanner(System.in);
		String uname = sc.nextLine();
		C2 fc = new C2();
		fc.checkname(uname);
	}
}