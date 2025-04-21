package Array_objects;

import java.util.Scanner;

public class practice2 {
	int house;
	String name;
	
	@Override
	public String toString()
	{
		return name +" "+ house;
		
	}
	
	
	public static void main(String[] args) {
		
		practice2[] pc = new practice2[2];
		pc[0]= new practice2();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the value for house number for first object ");
		pc[0].house= sc.nextInt();
		System.out.println("Enter the value for name for first obejct ");
		sc.nextLine();
		pc[0].name=sc.nextLine();
		
		pc[1]= new practice2();
		System.out.println("Enter the value for house number for second object ");
		pc[1].house=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the value for name for second object ");
		pc[1].name=sc.nextLine();
		
//		pc[0].house= 344;
//		pc[0].name="vicky";		
//		pc[1]= new practice2();
//		pc[1].house=444;
//		pc[1].name= "dhiraj";
		
		for(practice2 fc : pc)
		{
			System.out.println(fc);
		}
		
		
		
	}

}
