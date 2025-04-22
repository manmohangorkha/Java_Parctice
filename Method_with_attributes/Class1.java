package Method_with_attributes;

import java.util.Scanner;

public class Class1 {
	int speed;
	int time;

	public void speed(int k,int a) {
		float distance = k/ a;
		System.out.println(distance);
	}
	
	public static void main(String[] args) {
		
//		System.out.println("Enter the value of speed");
//		Scanner sc = new Scanner(System.in);
//	  int spd=	sc.nextInt();
//	  
//	  Scanner tm = new Scanner(System.in);
//	  int tim= tm.nextInt();
	  Class1 cs = new Class1();
	  cs.speed(40,2);	
	  
	}

}