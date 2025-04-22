package Data_Hiding;

import java.util.Scanner;

public class C2 {
	private int a = 9999999;
	private String b = "Qwerty@123";
	private String c = "B345666";

	public void checkname(String p) {
		if (p.equals(c)) {
			System.out.println("Enter the password");
			Scanner sc = new Scanner(System.in);
			String q = sc.nextLine();
			if (q.equals(b)) {
				System.out.println(a);
			} else {
				System.out.println("Wrong password");
			}
		} else {
			System.out.println("Wrong username");
		}

	}
}
